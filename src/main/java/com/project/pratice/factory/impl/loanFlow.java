package com.project.pratice.factory.impl;

import com.project.pratice.factory.AddFlow;

import java.util.Map;

public class loanFlow  implements AddFlow {

    @Override
    public String addOperate(Map map) {
        return "添加放款流程";
    }
}
