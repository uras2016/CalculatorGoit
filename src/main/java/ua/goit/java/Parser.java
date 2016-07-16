package ua.goit.java;

import java.math.BigDecimal;
import java.util.List;

public interface Parser {



    public void parse(String expression);
    public List<BigDecimal> getOperands();
    public char getOperator();


}
