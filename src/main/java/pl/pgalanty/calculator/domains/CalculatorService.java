package pl.pgalanty.calculator.domains;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CalculatorService {

// regular expression operation handling
    public static final String REG_EXP = "([\\d]+)[+-/*]([\\d]+)";

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


    public Integer calculate(String s) {

        Pattern pattern = Pattern.compile(REG_EXP);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            String first = matcher.group(1);
            String operation = matcher.group(2);
            String secound = matcher.group(3);
            System.out.println(first + ", " + secound);
        }

        return 0;

        /*-?\d+(?:\.\d+(?:E\d+)?)?(\s*[-+/\*]\s+-?\d+(?:\.\d+(?:E\d+)?)?)+*/
    }
}
