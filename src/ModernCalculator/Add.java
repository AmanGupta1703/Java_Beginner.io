package ModernCalculator;


public class Add implements Operate{
    @Override
    public Double getResult(Double  ... numbers) {
        Double sum = 0.0;
        for(Double number: numbers) {
            sum += number;
        }
        return sum;
    }
}
