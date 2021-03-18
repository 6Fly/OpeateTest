package com.project.pratice.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * @author L
 */
@RestControllerAdvice
public class CommExceptionHandle {
    Logger logger = LoggerFactory.getLogger(CommExceptionHandle.class);
    /**
     * 基础的业务流程异常处理  如果需要添加新的异常在@ExceptionHandler中添加新的异常类
     * 如果有业务逻辑相关 可以新增与该方法类似的方法
     * @param e
     * @return
     */
    @ExceptionHandler({ BusinessException.class })
    public BaseResponse businessExceptionHandler(BusinessException e) {
        StackTraceElement[] stacktrace = e.getStackTrace();
        logger.info("Catch Exception in Class="+stacktrace[0].getClassName()+"， MethodName="+stacktrace[0].getMethodName()
                +"， LineNumber="+stacktrace[0].getLineNumber());
        logger.error(e.getMsg());
        return new BaseResponse(e.getCode(),e.getMsg());
    }

}
