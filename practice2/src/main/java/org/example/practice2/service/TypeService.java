package org.example.practice2.service;

import org.example.practice2.pojo.Type;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 蟹蟹
* @description 针对表【type】的数据库操作Service
* @createDate 2025-07-23 17:46:30
*/
public interface TypeService extends IService<Type> {

    void deleteID2(Integer id);
}
