原版swagger界面：`http://localhost:8080/swagger-ui.html`
侧栏界面：`http://localhost:8080/doc.html`
```
SwaggerConfig.java
@Configuration // 配置类
@EnableSwagger2 // 开启 swagger2 的自动配置

WebMvcConfig.java
        addResourceHandlers 添加资源处理器
```
```
解决springboot版本高于2.5.X
spring:
mvc:
pathmatch:
matching-strategy: ANT_PATH_MATCHER
```
```
@Api
@ApiOperation
```
```
使用spring-boot-starter-validation进行参数校验
@Vaild
@Vaildated
@NUll @NotNull
@Size
@Max @Min
@Email
```

