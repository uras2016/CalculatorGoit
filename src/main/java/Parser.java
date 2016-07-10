import java.util.List;

public interface Parser {



    public void parse(String expression);
    public List<Double> getOperands();
    public char getOperator();

}
