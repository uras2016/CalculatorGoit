import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculate() throws Exception {
        Provider provider = new Provider();
        Parser parser = new ParsedExpression();
        double result = 0;
        String a = "3+5";
        Calculator calculator = new Calculator();
        provider.init();
        calculator.setOperationsSet(provider.getOperations());
        calculator.setParser(parser);
        System.out.println(calculator.calculate(a));

    }
}