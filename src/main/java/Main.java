import model.Calculator;
import model.CalculatorException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        String number1 = in.nextLine();
        System.out.print("Введите арифметическую операцию + - или *: ");
        String mathOperation = in.nextLine();
        System.out.print("Введите второе целое число: ");
        String number2 = in.nextLine();

        System.out.println("Результат:"+Calculator.execute(new String[]{number1,mathOperation,number2}));
    }
}
