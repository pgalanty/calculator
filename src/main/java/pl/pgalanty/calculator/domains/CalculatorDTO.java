package pl.pgalanty.calculator.domains;

import java.math.BigDecimal;

public class CalculatorDTO {

    private BigDecimal a;
    private BigDecimal b;

    private OperationType operationType;

    public CalculatorDTO(){}

    public CalculatorDTO(BigDecimal a, BigDecimal b, OperationType operationType) {
        this.a = a;
        this.b = b;
        this.operationType = operationType;
    }

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public OperationType getOperationType() {
        return operationType;
    }
}
