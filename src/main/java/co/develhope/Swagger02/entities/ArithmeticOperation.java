package co.develhope.Swagger02.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {
    @ApiModelProperty(value = "The name of operations", example = "rest")
    private String name;
    @ApiModelProperty(value = "The minimum number of operands is ", example = "5")
    private Integer minNumberOfOperands;
    @ApiModelProperty(value = "An exercise on Swagger", example = "Add + add = sum")
    private String description;
    @ApiModelProperty(value = "An array on Swagger", example = "['Subtraction', 'sum', 'division]")
    private String[] properties;


}
