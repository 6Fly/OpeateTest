package com.project.pratice.strategy.impl;

import com.project.pratice.base.result.Result;
import com.project.pratice.base.result.ResultUtil;
import com.project.pratice.strategy.FinanceStrategy;
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
