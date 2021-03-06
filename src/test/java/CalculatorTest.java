import org.junit.Test;
import ua.goit.java.Calculator;
import ua.goit.java.ParsedExpression;
import ua.goit.java.Parser;
import ua.goit.java.Provider;

public class CalculatorTest {

    @Test
    public void testCalculate() throws Exception {
        Provider provider = new Provider();
        Parser parser = new ParsedExpression();
        ua.goit.java.Calculator calculator = new Calculator();
        double result = 0;
        String a = "153135103513-5";
        provider.init();
        calculator.setOperationsSet(provider.getAllOperations());
        calculator.setParser(parser);
        System.out.println(calculator.calculate(a));

    }
}