package com.cfam.service;

import com.cfam.bean.CostAllocation;
import com.cfam.factory.ServiceFeeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author L
 */
@Service
public class CalculationService {

    /**
     * 核批金额code
     */
    private  final String CAL_BASE_CODE = "2";

    /**
     * 融资总价code
     */
    private  final String CAL_ADDITIONAL_CODE = "1";
    /**
     * 加融ID
     */
    private  final String ADDITIONAL_CODE = "2";

    @Autowired
    private JsonParsingService jsonParsingService;
    @Autowired
    private ServiceFeeFactory serviceFeeFactory;

    public Map<String,Double> calAmount(String id,String v,String amount){

        BigDecimal baseAmount = new BigDecimal(amount);
        //获取配置费用
        List<CostAllocation> allCost = jsonParsingService.parsJson();
        Map<String, Double> charge = new HashMap<>(allCost.size());
        final BigDecimal[] baseFinancing = {new BigDecimal("0")};
        //计算以核批为基准的费用项
        List<CostAllocation> collect = allCost.stream().filter(co -> {
            if (co.getCalculationBasisId().equals(CAL_BASE_CODE)){
                String serviceFee = serviceFeeFactory.getServiceFee(co, id, v, amount);
                charge.put(co.getKey(),Double.valueOf(serviceFee));
                //添加加融金额
                if (co.getAdditionalFinancingSideId().equals(ADDITIONAL_CODE)){
                    baseFinancing[0] = baseFinancing[0].add(new BigDecimal(serviceFee));
                }
                return false;
            }
            return true;
        }).collect(Collectors.toList());
        //计算项目租赁总价
        BigDecimal financingFee = baseAmount.add(baseFinancing[0]);
        charge.put("financingFee",financingFee.doubleValue());
        //计算以租赁总价为基准的费用项
        collect.forEach(co->{
            if (co.getCalculationBasisId().equals(CAL_ADDITIONAL_CODE)){
                String serviceFee = serviceFeeFactory.getServiceFee(co, id, v, financingFee.toString());
                charge.put(co.getKey(),Double.valueOf(serviceFee));
            }
        });
        return charge;
    }
}
