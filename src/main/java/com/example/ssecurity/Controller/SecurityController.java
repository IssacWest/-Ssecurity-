package com.example.ssecurity.Controller;

import com.example.ssecurity.Pojo.Student;
import com.example.ssecurity.config.Groups;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/sec")
@Api(value = "Sec接口", tags = {"Sec接口"})
public class SecurityController {

    @GetMapping("/hello")
    @ApiOperation("hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/stu")
    @ApiOperation("显示stu")
    public Student stu(@Validated(Groups.Update.class) Student student){
        /**
         * @Valid 不分组校验
         * @Validated 可分组校验
         */
        return student;
    }
}
