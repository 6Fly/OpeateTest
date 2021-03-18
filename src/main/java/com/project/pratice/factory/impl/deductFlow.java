package com.project.pratice.factory.impl;

import com.project.pratice.factory.AddFlow;

import java.util.Map;

public class deductFlow implements AddFlow {
    @Override
    public String addOperate(Map map) {
        return "扣款流程";
    }
}
