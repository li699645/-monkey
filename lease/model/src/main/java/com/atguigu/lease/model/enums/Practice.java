package com.atguigu.lease.model.enums;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
public enum Practice implements BaseEnum{
    wuhu(1,"name");
    @EnumValue
    @JsonValue
    private Integer code;
    private String name;
    Practice(Integer code,String name){
        this.code=code;
        this.name=name;
    }
    @Override
  public Integer getCode(){
        return this.code;
    }
    @Override
   public String getName(){
        return this.name;

    }
}
