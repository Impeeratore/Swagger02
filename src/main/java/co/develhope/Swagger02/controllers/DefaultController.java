package co.develhope.Swagger02.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping
    @ApiOperation(value = "Welcome message!")
    public String welcomeSwag(){
        return "This is my second Swagger! Welcome! For visit: https://localhost:5050/swagger-ui/!Check it!";
    }

}
