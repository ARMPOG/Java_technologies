package com.example.java_technologies.controller;

import com.example.java_technologies.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Controller REST Endpoint")
public class UserController {


    @GetMapping
    @ApiOperation(value = "Shows all the Users")
    public List<User> getUsers(){
        return Arrays.asList(
                new User("Armo",2000L),
                new User("Benji",1500L));
    }

    @GetMapping ("/{username}")
    @ApiOperation(value = "Shows specific user")
    public User getUser(@PathVariable("username") final  String username){
        return new User(username, 1000L);
    }
}



