package com.hualan.sfzy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLDataException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice       //@ControllerAdvice将当前类标识为异常处理的组件
public class GlobalExceptionHandler {
    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(value = SQLDataException.class)
    @ResponseBody
    public Map<String,Object> handleCustomException(SQLDataException e){
        Map<String,Object> map = new HashMap<>();
        map.put("code", -100);
        map.put("message", "SQL异常");
        return map;
    }

    @ExceptionHandler(value = ArithmeticException.class)
    @ResponseBody
    public Map<String,Object> handleCustomException(ArithmeticException e){
        Map<String,Object> map = new HashMap<>();
        map.put("code", -101);
        map.put("message", "算数异常");
        return map;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String,Object> handleCustomException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code", -102);
        map.put("message", "系统异常");
        return map;
    }
}
