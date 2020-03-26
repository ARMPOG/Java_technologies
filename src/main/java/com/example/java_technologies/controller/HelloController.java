package com.example.java_technologies.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/home")
@Api(value = "HelloWorld controller")
public class HelloController {

    @ApiOperation(value = "Returns Hello world") // describes API function
    @ApiResponses(value = {
            @ApiResponse(code = 100, message = "100 is a message"), // adds custom message , body
            @ApiResponse(code = 200, message = "Successful"), // adds custom message , body
    })
    @GetMapping
    public String hello() {
        return "Hello world";
    }


    @ApiOperation(value = "Returns custom string")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }


    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }

    @DeleteMapping("/delete")
    public void helloDelete(@RequestBody final String hello) {

    }
}
