package org.example.practice2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.practice2.mapper.TypeMapper;
import org.example.practice2.pojo.Type;
import org.example.practice2.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 蟹蟹
* @description 针对表【type】的数据库操作Service实现
* @createDate 2025-07-23 17:46:30
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public void deleteID2(Integer id) {
       typeMapper.deleteId(id);
    }
}




