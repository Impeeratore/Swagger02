package co.develhope.Swagger02.controllers;

import co.develhope.Swagger02.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping(value = "")
    @ApiOperation(value = "First message", notes = "Print a Welcome's message")
    public String welcomeMathMsg(){
        return "Welcome to the math operations! Visit localhost:5050/swagger-ui/ for more info";

    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Info about Division", notes = "Try to get a division")
    public ArithmeticOperation operationDiv(){
        String[] properties = {"Division by 2", "Division by 4", "Division by 6"};
        return new ArithmeticOperation("Division", 4, "Get a result with more division!", properties);
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "An multiplication", notes = "Try to get a Multiplication")
    public int getMultiplication(
        @ApiParam(value = "1 Operation") @RequestParam int operation1,
        @ApiParam(value = "2 Operation") @RequestParam int operation2){
        return operation1*operation2;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Return the square about number", notes = "Try to get a square!")
    public int getSquare(@ApiParam(value = "The value of the number") @PathVariable() int n){
        return n*n;
    }



}
