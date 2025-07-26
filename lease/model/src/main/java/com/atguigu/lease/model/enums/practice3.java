package com.atguigu.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum practice3 implements BaseEnum{
    victor(1,"saa");
    @JsonValue
    @EnumValue
    private Integer code;
    private String name;
    practice3(Integer code,String name){
        this.code=code;
        this.name=name;
    }
    @Override
    public Integer getCode() {
        return this.code;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
