package org.example.practice2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.practice2.pojo.Type;
import org.example.practice2.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("type")
public class TypeController {
    @Autowired TypeService Service;
    @PostMapping("/post")
    public void type(HttpServletRequest request, @RequestBody Type newtype) throws IOException {

        String body = new BufferedReader(new InputStreamReader(request.getInputStream()))
                .lines().collect(Collectors.joining());
        System.out.println(body);
        Service.save(newtype);
    }
    @GetMapping("/get")
    public List<Type> findAll(){
        return Service.list();
    }
}
