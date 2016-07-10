import java.util.List;

public class ParsedExpressionTest {

    ParsedExpression parsedExpression = new ParsedExpression();
    @org.junit.Test
    public void testParsering() throws Exception {
    String example = "31+5";
        parsedExpression.parse(example);
        List<Double> operands = parsedExpression.getOperands();
        char operator = parsedExpression.getOperator();
        for (Double operand : operands) {
            System.out.println("operand " + operand);
        }
        System.out.println("operator " + operator);


    }


}