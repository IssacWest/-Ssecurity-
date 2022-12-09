package com.example.ssecurity.config;


import lombok.Data;

import java.util.Map;

@Data
public class Result {
    private Integer code;
    private String message;
    private Map map;

    public static Result build(Integer code, String message, Map map){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setMap(map);
        return result;
    }
}
