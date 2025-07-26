package com.atguigu.lease.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    @Schema(description = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @Schema(description = "创建时间")
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    @JsonIgnore//jackson（默认的序列化框架）提供，序列化时忽略改字段
    private Date createTime;

    @Schema(description = "更新时间")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    @JsonIgnore
    private Date updateTime;
    @Schema(description = "逻辑删除")
    @JsonIgnore
    @TableLogic//过滤作用的注解=0只对Mybatis-plus自动注入的Sql生效
    @TableField("is_deleted")
    private Byte isDeleted;
}