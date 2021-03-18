package com.project.pratice.strategy.impl;

import com.project.pratice.base.result.Result;
import com.project.pratice.base.result.ResultEnum;
import com.project.pratice.base.result.ResultUtil;
import com.project.pratice.strategy.FinanceStrategy;
import org.springframework.stereotype.Service;

@Service
public class AllinOperate implements FinanceStrategy {
    @Override
    public Result loanOperate() {
        return ResultUtil.success();
    }

    @Override
    public Result deductOperate() {
        return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(),"失败");
    }
}
