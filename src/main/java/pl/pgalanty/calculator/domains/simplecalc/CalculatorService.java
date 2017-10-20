package pl.pgalanty.calculator.domains.simplecalc;

import org.springframework.stereotype.Service;
import pl.pgalanty.calculator.domains.parabola.PointsDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CalculatorService {

    private  HashMap<String, OperationType> map;

    public static final String REG_EXP = "([\\d]+)([+-/*//])([\\d]+)";

    public CalculatorService(){
        map = new HashMap<>();
        map.put("+", OperationType.ADD);
        map.put("-", OperationType.SUBTRACT);
        map.put("*", OperationType.MULTIPLY);
        map.put("/", OperationType.DIVIDE);
    }




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


    public BigDecimal calculate(String s) {

        CalculatorDTO calculatorDTO = parseStringTOCalculatorDTO(s);
        return calculate(calculatorDTO);

    }

    private CalculatorDTO parseStringTOCalculatorDTO(String s) {
        Pattern pattern = Pattern.compile(REG_EXP);
        Matcher matcher = pattern.matcher(s);
        String first = null;
        String second = null;
        String operation = null;

        if (matcher.matches()) {
            first = matcher.group(1);
            operation = matcher.group(2);
            second = matcher.group(3);
            System.out.println(first + " " + operation + " " + second);
        }

        return new CalculatorDTO(new BigDecimal(first), new BigDecimal(second),map.get(operation));
    }


}
