package pl.pgalanty.calculator.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/api/calculate/{a}/{b}", method = RequestMethod.POST)
    private Integer calculation(@PathVariable Integer a, @PathVariable Integer b){
        return calculatorService.calculate(a,b);
    }

    @RequestMapping(value = "/api/calculate", method = RequestMethod.POST)
    private Integer calculation2(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
        return a+b;
    }

    @RequestMapping(value = "/api/calculate2", method = RequestMethod.POST)
    private Integer calculation3(@RequestParam("a") Integer... a){
        return calculatorService.calculate(a);
    }

    @RequestMapping(value = "/api/calculate3", method = RequestMethod.POST)
    private Integer calculation3(@RequestBody CalculatorDTO calculatorDTO){
        return calculatorDTO.getA()+calculatorDTO.getB();
    }

}
