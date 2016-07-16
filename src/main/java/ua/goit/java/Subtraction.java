package ua.goit.java;

import java.math.BigDecimal;

public class Subtraction implements Operation {
    @Override
    public BigDecimal count(BigDecimal number1, BigDecimal number2) {
        return number1.subtract(number2);
    }

    @Override
    public char getOperator() {
        return '-';
    }
}
