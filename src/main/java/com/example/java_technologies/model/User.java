package com.example.java_technologies.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    @ApiModelProperty(notes = "name of the user")
    private String name;

    @ApiModelProperty(notes = "salary of the user")
    private Long salary;

}
