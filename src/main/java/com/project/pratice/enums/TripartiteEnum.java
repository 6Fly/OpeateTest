package com.project.pratice.enums;

import com.project.pratice.base.exception.BusinessException;

/**
 * 放款三方
 * @author L
 */
public enum TripartiteEnum {
    //银行
    BANK(1,"bank"),
    //宝付
    BAOFOO(2,"baoFoo"),

    ALLINPAY(3,"allinPay");


    Integer code;

    String tripartite;

    public Integer getCode() {
        return code;
    }

    public String getTripartite() {
        return tripartite;
    }

    TripartiteEnum(Integer code, String tripartite) {
        this.code  = code;
        this.tripartite = tripartite;
    }

    public static String getTripartiteEnum(Integer code){
        for (TripartiteEnum tripartite: TripartiteEnum.values()){
            if(tripartite.code.equals(code)){
                return tripartite.tripartite;
            }
        }
        throw new BusinessException(1002,"未知的三方");
    }
}
