package pl.pgalanty.calculator.domains;

public class CalculatorDTO {

    private Integer a;
    private Integer b;

    public CalculatorDTO(){}

    public CalculatorDTO(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
