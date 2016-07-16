import ua.goit.java.ParsedExpression;

import java.math.BigDecimal;
import java.util.List;

public class ParsedExpressionTest {

    ua.goit.java.ParsedExpression parsedExpression = new ParsedExpression();
    @org.junit.Test
    public void testParsering() throws Exception {
    String example = "31+5";
        parsedExpression.parse(example);
        List<BigDecimal> operands = parsedExpression.getOperands();
        char operator = parsedExpression.getOperator();
        for (BigDecimal operand : operands) {
            System.out.println("operand " + operand);
        }
        System.out.println("operator " + operator);


    }


}