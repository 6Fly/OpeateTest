package com.cfam.factory.impl;

import com.cfam.factory.AddFlow;

import java.util.Map;

public class deductFlow implements AddFlow {
    @Override
    public String addOperate(Map map) {
        return "扣款流程";
    }
}
