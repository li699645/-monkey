package org.example.practice1.Api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("wuhu")
@Tag(name = "body参数")
public class BodyController {
    @Operation(summary = "普通body请求")
    @GetMapping ("/body")
    public String body(){
        return "连接成功";
    }

}
