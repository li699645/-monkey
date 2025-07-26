package org.example.practice2.result;

import org.springframework.http.HttpStatus;

public class ResultMap<T> {
    private Integer code;
    private String message;
    private T data;
    public ResultMap(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;


    }
    public static <T> ResultMap<T> success(T data){
        return  new ResultMap(HttpStatus.OK.value(), "massage",data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
