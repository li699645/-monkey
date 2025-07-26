package com.atguigu.lease.web.admin.com.atguigu.lease.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName nouse1
 */
@TableName(value ="nouse1")
@Data
public class Nouse1 {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer noId;

    /**
     * 
     */
    private String noName;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Nouse1 other = (Nouse1) that;
        return (this.getNoId() == null ? other.getNoId() == null : this.getNoId().equals(other.getNoId()))
            && (this.getNoName() == null ? other.getNoName() == null : this.getNoName().equals(other.getNoName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoId() == null) ? 0 : getNoId().hashCode());
        result = prime * result + ((getNoName() == null) ? 0 : getNoName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noId=").append(noId);
        sb.append(", noName=").append(noName);
        sb.append("]");
        return sb.toString();
    }
}