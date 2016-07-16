package ua.goit.java;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
    private Parser parser;
    private List<Operation> operationsSet;

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void setOperationsSet(List<Operation> operationsSet) {
        this.operationsSet = operationsSet;
    }

    public void addOperation(Operation operation){
        operationsSet.add(operation);
    }


    public BigDecimal calculate(String expression){
        boolean operatorFound = false;
        BigDecimal result = BigDecimal.valueOf(0);
        parser.parse(expression);

        for (Operation operation : operationsSet) {

             if (operation.getOperator() != parser.getOperator()) {
            continue;
        }
        operatorFound = true;

            result=operation.count(parser.getOperands().get(0),parser.getOperands().get(1));

        }
        if (!operatorFound) {
            System.out.println("Wrong token");
        }


        return result;
    }
}
