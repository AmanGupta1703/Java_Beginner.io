package CustomeCalculator;

import java.util.Scanner;

public class Calculator {
    double number1;
    double number2;
    char operator = ' ';
    double result;
    Scanner sc = new Scanner(System.in);

    public void calcOperations() throws CannotDivideByZeroException {
        System.out.println("Basic Level Mathematical Calculator");
        System.out.print("Input the number: ");
        this.number1 = sc.nextDouble();
        System.out.print("Input the operator: ");
        this.operator = sc.next().charAt(0);
        System.out.print("Input the number: ");
        this.number2 = sc.nextDouble();

        switch (operator) {
            case '+':
               result = this.number1 + this.number2;
                break;
            case '-':
                result = this.number1 - this.number2;
                break;
            case '*':
                result = this.number1 * this.number2;
                break;
            case '/':
                if(number2 == 0) {
                    throw new CannotDivideByZeroException();
                } else { result = this.number1 / this.number2; }
                break;
            case '%':
                result = this.number1 % this.number2;
                break;
        }
        System.out.println(this.number1 + " " + this.operator + " " + this.number2 + " = " + this.result);
    }
}
