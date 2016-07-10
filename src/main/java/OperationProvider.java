import java.util.List;

public interface OperationProvider {
    public List<Operation> getOperations();
    public void init();
}
