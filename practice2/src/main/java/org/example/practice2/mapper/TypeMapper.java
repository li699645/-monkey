package org.example.practice2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.practice2.pojo.Type;

/**
* @author 蟹蟹
* @description 针对表【type】的数据库操作Mapper
* @createDate 2025-07-23 17:46:30
* @Entity practice2.pojo.Type
*/
@Mapper
public interface TypeMapper extends BaseMapper<Type> {

}




