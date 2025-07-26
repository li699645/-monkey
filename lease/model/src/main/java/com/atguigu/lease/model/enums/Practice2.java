package com.atguigu.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Practice2 implements BaseEnum{
    wuhu(1,"成功"),
    aha(2,"失败");
    @EnumValue
    @JsonValue
    private int code;
    private String name;

    Practice2(Integer code,String name){
        this.code=code;
        this.name=name;
    }
    public Integer  getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
}
