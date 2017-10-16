package pl.pgalanty.calculator.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/api/calculate3", method = RequestMethod.POST)
    private BigDecimal calculation3(@RequestBody CalculatorDTO calculatorDTO){
        return calculatorService.calculate(calculatorDTO);
    }

}
