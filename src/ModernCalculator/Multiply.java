package ModernCalculator;

public class Multiply implements Operate{
    @Override
    public Double getResult(Double... numbers) {
        Double result = 1.0;
        for(Double number: numbers) {
            result *= number;
        }
        return result;
    }
}
