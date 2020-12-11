import com.alibaba.fastjson.JSONObject;
import net.sf.json.JSONArray;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class ParamTest {
    public static void main(String[] args) {
        /*String res = "{\"code\": 0,\"msg\":\"成功\",\"data\":[{\"isFirstBuckleId\": 1,\"deductionSide\": {\"typeId\": \"0\",\"typeName\": \"无\",\"merchantNumber\": \"123\", \"describe\": \"扣款方\"},\"productId\": 77,\"updateTime\": \"2020-11-24 16:13:44\",\"subAccountSide\": {\"typeId\": \"1\", \"typeName\": \"辉煌\",\"merchantNumber\": \"12345\",\"describe\": \"分账方\" },\"type\": \"\",\"version\": \"1\",\"deductionSideId\": 1,\"productCode\": \"XRTX_TJAP_LH_36\", \"enable\": 1,\"costRatio\": 2.1,\"validateList\": [],\"id\": 2,\"key\": \"robberyRescue\",\"desc\":\"盗抢险\",\"isFirstBuckle\":\"是\"}, {\"isFirstBuckleId\":1,\"deductionSide\": {\"typeId\":\"0\",\"typeName\":\"无\", \"merchantNumber\":\"3454\",\"describe\":\"扣款方\"},\"productId\": 77, \"updateTime\": \"2020-11-24 16:13:44\",\"subAccountSide\": {\"typeId\": \"1\",\"typeName\": \"辉煌\",\"merchantNumber\": \"12345\",\"describe\": \"分账方\" },\"type\": \"\",\"version\": \"1\",\"deductionSideId\": 1,\"productCode\": \"XRTX_TJAP_LH_36\", \"createTime\": \"2020-11-24 16:13:44\",\"enable\": 1,\"costRatio\":2.1,\"validateList\":[],\"id\":4,\"key\":\"serviceCharge\",\"desc\":\"服务费\",\"isFirstBuckle\":\"是\"}]}";
        Object data = JSONObject.parseObject(res).get("data");
        System.out.println(data);
        List<Map<Object, Object>> list = (List<Map<Object, Object>>) JSONArray.fromObject(data);
        List<Map<Object, Object>> cal = list.stream().map(pa -> {
            Map<Object, Object> calMap = new HashMap<>();
            calMap.put("costRatio",pa.get("costRatio"));
            JSONObject deduct = JSONObject.parseObject(pa.get("deductionSide").toString());
            calMap.put("deductionSide",deduct.get("typeId"));
            JSONObject sub = JSONObject.parseObject(pa.get("deductionSide").toString());
            calMap.put("subAccountSide",sub.get("merchantNumber"));
            return calMap;
        }).collect(Collectors.toList());*/
        AtomicReference<Double> deductAmount = new AtomicReference<>((double) 0);
        deductAmount.updateAndGet(v -> (v + 1));
        double deduct = deductAmount.get();
        System.out.println(deduct);
    }
}
