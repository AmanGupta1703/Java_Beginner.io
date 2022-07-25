package ModernCalculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        final String inputExpression = ReadInput.readInput();

        Queue<String> operations;
        Queue<String> numbers;

        String[] numbersArray = inputExpression.split("[-+/*]");
        String[] operationsArray = inputExpression.split("[0-9]+");

        numbers = new LinkedList<String>(Arrays.asList(numbersArray));
        operations = new LinkedList<String>(Arrays.asList(operationsArray));

        Double result = Double.parseDouble(numbers.poll()); // pick the first number from the queue (will pick 4)
// 4+5*3/2
        while(!numbers.isEmpty()) {
            String firstOperator = operations.poll();   // pick the first operator from the queue

            Operate operate;
            switch (firstOperator) {
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }
            Double number = Double.parseDouble(numbers.poll()); //pick the next number from the queue (will pick 5 and so forth)
            result = operate.getResult(result, number);
        }
        System.out.println(result);
    }
}
