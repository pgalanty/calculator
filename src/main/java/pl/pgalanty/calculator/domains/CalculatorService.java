package pl.pgalanty.calculator.domains;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService {


    public BigDecimal calculate(CalculatorDTO calculatorDTO) {

        switch (calculatorDTO.getOperationType()){
            case ADD:
                return calculatorDTO.getA().add(calculatorDTO.getB());
            case SUBTRACT:
                return calculatorDTO.getA().subtract(calculatorDTO.getB());
            case MULTIPLY:
                return calculatorDTO.getA().multiply(calculatorDTO.getB());
            case DIVIDE:
                return calculatorDTO.getA().divide(calculatorDTO.getB());
        }

        return null;

    }
}
