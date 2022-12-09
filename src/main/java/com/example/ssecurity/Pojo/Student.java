package com.example.ssecurity.Pojo;


import com.example.ssecurity.config.Groups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@ApiModel("创建Swagger请求参数")
public class Student {

    @Null(message = "1", groups = Groups.Add.class)
    @NotNull(message = "2", groups = Groups.Update.class)
    @Max(100)
    @Min(1)
    @ApiModelProperty("id")
    private Integer id;

    @NotNull
    @Size(min = 2, max = 5)
    @ApiModelProperty("姓名")
    private String name;

    @NotNull
    /**
     * ^(男|女){1}$
     */
    @Pattern(regexp = "^(0|1){1}$", message = "性别only男女")
    @ApiModelProperty("性别")
    private Integer gender;
}