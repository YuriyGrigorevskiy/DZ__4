import model.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String number1 = in.nextLine();
        String mathOperation = in.nextLine();    //this version program understands only + - * operations
        String number2 = in.nextLine();

        System.out.println(Calculator.execute(new String[]{number1,mathOperation,number2}));

    }
}
