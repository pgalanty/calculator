package pl.pgalanty.calculator.domains;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer calculate(Integer[] a) {

        Integer sum = 0;
        for (Integer i : a ){
            sum  = sum + i;
        }
        return sum;
    }

    public Integer calculate(Integer a, Integer b) {
        return a+b;
    }
}
