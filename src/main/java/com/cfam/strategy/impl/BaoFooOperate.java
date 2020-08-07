package com.cfam.strategy.impl;

import com.cfam.base.result.Result;
import com.cfam.base.result.ResultUtil;
import com.cfam.strategy.FinanceStrategy;
import org.springframework.stereotype.Service;

@Service
public class BaoFooOperate implements FinanceStrategy {
    @Override
    public Result loanOperate() {
        return ResultUtil.success();
    }

    @Override
    public Result deductOperate() {
        return ResultUtil.success();
    }
}
