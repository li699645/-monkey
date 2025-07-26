package org.example.practice2.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.servlet.http.HttpServletRequest;
import org.example.practice2.pojo.Type;
import org.example.practice2.result.ResultMap;
import org.example.practice2.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.example.practice2.baseEnum.BaseEnum.a;

@RestController
@RequestMapping("type")
public class TypeController {
    @Autowired TypeService Service;
    @PostMapping("/post")
    public void type(HttpServletRequest request, @RequestBody Type newtype) throws IOException {

        String body = new BufferedReader(new InputStreamReader(request.getInputStream()))
                .lines().collect(Collectors.joining());
        System.out.println(body);
        Service.saveOrUpdate(newtype);
    }
    @GetMapping("/get")
    public Page<Type> findAll(){
        Page<Type> page = new Page<>(1, 10);
        return Service.page(page);
    }
    @DeleteMapping("/delete")
        public ResultMap<Integer> deleteType(@RequestParam Integer id){
        Service.deleteID2(id);
        System.out.println("要删除的ID是：" + id);
        String hello= String.valueOf(a.getCode());
        return  ResultMap.success(id);
        }
}

