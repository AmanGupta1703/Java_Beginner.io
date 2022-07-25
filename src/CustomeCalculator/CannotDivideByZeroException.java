package CustomeCalculator;

public class CannotDivideByZeroException extends Exception{
    public String toString() {
        return "Invalid Expression.";
    }
    public String getMessage() {
        return "Cannot divide the expression by zero.";
    }
}
