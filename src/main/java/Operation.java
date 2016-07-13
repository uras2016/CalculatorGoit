import java.math.BigDecimal;

public interface Operation {

    public BigDecimal count(BigDecimal number1, BigDecimal number2);
    char getOperator();
}
