package ua.goit.java;

import java.util.ArrayList;
import java.util.List;

public class Provider implements OperationProvider {
    public List<Operation> operations = new ArrayList<>();

    @Override
    public List<Operation> getOperations() {
        return operations;
    }

    @Override
    public void init() {
        operations.add(new Adding());
        operations.add(new Subtraction());

    }
}
