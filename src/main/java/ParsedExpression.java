import java.util.ArrayList;
import java.util.List;

public class ParsedExpression implements Parser {

    public List<Double> operands;
    public char operator;


    public void parse(String expression) {

        operands = new ArrayList<>();
        String temp = "";
        for (char c : expression.toCharArray()) {
            if (c==' ') continue;

            if ((c>='0'&&c<='9') || (c=='.')){
                temp+=c;
            }else {
                operator = c;
                try {
                    operands.add(Double.parseDouble(temp));
                }catch (NumberFormatException e){
                    System.out.println("wrong expression");
                }

                temp="";
            }
        }

        operands.add(Double.parseDouble(temp));
    }


    @Override
    public List<Double> getOperands() {
        return operands;
    }

    @Override
    public char getOperator() {
        return operator;
    }
}
