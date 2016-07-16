package ua.goit.java;

import java.util.List;

public interface OperationProvider {

    public List<Operation> getAllOperations();

    public void init();
    public void initAdditionalOperation(Operation operation);
}
