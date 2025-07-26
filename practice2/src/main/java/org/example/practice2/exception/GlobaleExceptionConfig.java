package org.example.practice2.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.practice2.result.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//统一处理
public class GlobaleExceptionConfig {
@ExceptionHandler({Exception.class})//什么异常的统一处理
    public ResultMap handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
//方法参数要求三个，为异常等；
    //记录日志
    Logger log= LoggerFactory.getLogger(GlobaleExceptionConfig.class);
    log.error("统一异常:",e);
    return new ResultMap(500,"error",null);
}
}
