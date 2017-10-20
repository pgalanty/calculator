package pl.pgalanty.calculator.domains.simplecalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pgalanty.calculator.domains.parabola.PointsDTO;

import java.math.BigDecimal;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/api/simple-calculate", method = RequestMethod.POST)
    private BigDecimal simpleCalculate(@RequestBody CalculatorDTO calculatorDTO){
        return calculatorService.calculate(calculatorDTO);
    }

    @RequestMapping(value = "/api/calculate", method = RequestMethod.GET)
    private BigDecimal calculate(@RequestParam("evaluation") String s){
        return calculatorService.calculate(s);
    }

}
