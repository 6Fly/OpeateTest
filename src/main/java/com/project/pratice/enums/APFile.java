package com.project.pratice.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author L
 */

public enum APFile {
        //文件匹配列举
        ApplyCardP("014001-1","businessApply","身份证正面"),
        ApplyCardN("014001-1","businessApply","身份证反面"),
        ApplyBank("014001-7","businessApply","银行卡"),
        ApplyCar("014001-8","businessApply","车辆登记证"),
        ApplyFinanceLease("014004-4","businessApply","融资申请表"),
        //放款申请
        LoanFinanceLease("016001-1","loanApply","融资申请表"),
        LoanContract("016002-4","loanApply","融资租赁合同"),
        LoanCarMortgage("016002-8","loanApply","抵押合同"),
        LoanCarHandover("016002-9","loanApply","车辆交接单"),
        LoanCarTrans("016002-12","loanApply","债权转让通知书"),
        LoanCarRegist("016004-6","loanApply","车辆登记证"),
        LoanFacePhoto("016003-5","loanApply","面签"),
        //放款后督
        SupFinanceLease("018002-1","loanSupervise","融资申请表"),
        SupContract("018002-2","loanSupervise","融资租赁合同"),
        SupMortgage("018002-2","loanSupervise","抵押合同"),
        SupFacePhoto("018002-3","loanSupervise","面签");

        String code;

        String method;

        String desc;

     APFile(String code, String method, String desc) {
        this.code = code;
        this.method = method;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getMethod() {
        return method;
    }

    public String getDesc() {
        return desc;
    }

    public static String getCode(String method, String desc){
        for (APFile node: APFile.values()){
            if (node.method.equals(method) && desc.contains(node.desc)){
                return node.code;
            }
        }
        return null;
    }
    public static List<String> getFileName(String method){
        List<String> list =  new ArrayList<>();
         for (APFile node:APFile.values()){
            if (node.method.equals(method)){
                list.add(node.desc);
            }
         }
         return list;
    }

    public static List<String> getFile(String method){
        return Arrays.stream(APFile.values()).sequential()
                .filter(e->e.method.equals(method))
                .map(APFile::getDesc).collect(Collectors.toList());
    }
}
