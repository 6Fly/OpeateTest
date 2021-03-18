package com.project.pratice.service;

import com.project.pratice.bean.CostAllocation;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author L
 */
@Service
public class JsonParsingService {
    public List<CostAllocation> parsJson(){
        String json = "{\"code\":0,\"msg\":\"成功\",\"data\":[{\"isFirstBuckleId\":0,\"calculationBasisId\":1,\"productId\":77,\"deductionSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"扣款方\"},\"updateTime\":\"2020-11-24 16:13:44\",\"subAccountSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"分账方\"},\"calculationBasis\":\"融资租赁项目总价\",\"type\":\"\",\"version\":\"1\",\"additionalFinancingSide\":\"不加融\",\"productCode\":\"XRTX_TJAP_LH_36\",\"createTime\":\"2020-11-24 16:13:44\",\"enable\":1,\"additionalFinancingSideId\":0,\"costRatio\":3,\"chargeUndertaker\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"手续费承担方\"},\"validateList\":[],\"id\":37,\"key\":\"bond\",\"remarks\":\"无\",\"desc\":\"保证金\",\"isFirstBuckle\":\"否\"},{\"isFirstBuckleId\":1,\"calculationBasisId\":1,\"productId\":77,\"deductionSide\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"扣款方\"},\"updateTime\":\"2020-11-24 16:13:44\",\"subAccountSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"分账方\"},\"calculationBasis\":\"融资租赁项目总价\",\"type\":\"\",\"version\":\"1\",\"additionalFinancingSide\":\"不加融\",\"productCode\":\"XRTX_TJAP_LH_36\",\"createTime\":\"2020-11-24 16:13:44\",\"enable\":1,\"additionalFinancingSideId\":0,\"costRatio\":2.5,\"chargeUndertaker\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"手续费承担方\"},\"validateList\":[],\"id\":38,\"key\":\"theft\",\"remarks\":\"无\",\"desc\":\"盗抢险\",\"isFirstBuckle\":\"是\"},{\"isFirstBuckleId\":0,\"calculationBasisId\":1,\"productId\":77,\"deductionSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"扣款方\"},\"updateTime\":\"2020-11-24 16:13:44\",\"subAccountSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"分账方\"},\"calculationBasis\":\"融资租赁项目总价\",\"type\":\"\",\"version\":\"1\",\"additionalFinancingSide\":\"不加融\",\"productCode\":\"XRTX_TJAP_LH_36\",\"createTime\":\"2020-11-24 16:13:44\",\"enable\":1,\"additionalFinancingSideId\":0,\"costRatio\":0,\"chargeUndertaker\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"手续费承担方\"},\"validateList\":[],\"id\":39,\"key\":\"insurance\",\"remarks\":\"无\",\"desc\":\"保险费\",\"isFirstBuckle\":\"否\"},{\"isFirstBuckleId\":1,\"calculationBasisId\":1,\"productId\":77,\"deductionSide\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"扣款方\"},\"updateTime\":\"2020-11-24 16:13:44\",\"subAccountSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"分账方\"},\"calculationBasis\":\"融资租赁项目总价\",\"type\":\"\",\"version\":\"1\",\"additionalFinancingSide\":\"不加融\",\"productCode\":\"XRTX_TJAP_LH_36\",\"createTime\":\"2020-11-24 16:13:44\",\"enable\":1,\"additionalFinancingSideId\":0,\"costRatio\":5,\"chargeUndertaker\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"手续费承担方\"},\"validateList\":[],\"id\":40,\"key\":\"retain\",\"remarks\":\"无\",\"desc\":\"自留费\",\"isFirstBuckle\":\"是\"},{\"isFirstBuckleId\":0,\"calculationBasisId\":1,\"productId\":77,\"deductionSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"扣款方\"},\"updateTime\":\"2020-12-02 17:44:26\",\"subAccountSide\":{\"typeId\":\"\",\"typeName\":\"\",\"merchantNumber\":\"\",\"describe\":\"分账方\"},\"calculationBasis\":\"融资租赁项目总价\",\"type\":\"\",\"version\":\"1\",\"additionalFinancingSide\":\"不加融\",\"productCode\":\"XRTX_TJAP_LH_36\",\"createTime\":\"2020-12-02 17:44:26\",\"enable\":1,\"additionalFinancingSideId\":0,\"costRatio\":0,\"chargeUndertaker\":{\"typeId\":\"KAER\",\"typeName\":\"生产卡尔\",\"merchantNumber\":\"1210069\",\"describe\":\"手续费承担方\"},\"validateList\":[],\"id\":47,\"key\":\"mediumPremium\",\"remarks\":\"无\",\"desc\":\"中保国信费用\",\"isFirstBuckle\":\"否\"}]}";
        Object data = com.alibaba.fastjson.JSONObject.parseObject(json).get("data");
        List<Map<Object, Object>> list = (List<Map<Object, Object>>) JSONArray.fromObject(data);
        return list.stream().map(config->{
            CostAllocation costAllocation = new CostAllocation();
            costAllocation.setKey(config.get("key").toString());
            costAllocation.setCostRatio(config.get("costRatio").toString());
            costAllocation.setFixedCosts("1");
            costAllocation.setCalculationBasisId(config.get("calculationBasisId").toString());
            costAllocation.setAdditionalFinancingSideId(config.get("additionalFinancingSideId").toString());
            return costAllocation;
        }).collect(Collectors.toList());
    }
}
