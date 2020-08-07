package com.cfam.factory.impl;

import com.cfam.factory.AddFlow;

import java.util.Map;

public class loanFlow  implements AddFlow {

    @Override
    public String addOperate(Map map) {
        return "添加放款流程";
    }
}
