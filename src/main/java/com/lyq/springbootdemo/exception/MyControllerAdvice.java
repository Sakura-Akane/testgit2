package com.lyq.springbootdemo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> errorHandler(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg",e.getMessage());
        return map;
    }

   /* public Map<String,Object> errorHandler(BusinessException e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",e.getCode());

    }*/
}
