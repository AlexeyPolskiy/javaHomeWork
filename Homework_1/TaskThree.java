//Реализовать простой калькулятор

package Homework_1;

import java.util.Scanner;

public class TaskThree {  
    static int inputNamber(Scanner iScanner, String str) {
        System.out.print(str);
        int number = iScanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        // System.out.printf("Введите число a = ");
        String strOne = "Введите число a = ";
        int numberOne = inputNamber(iScanner, strOne);
        
        String strTwo = "Введите число b = ";
        int numberTwo = inputNamber(iScanner, strTwo);
        
        iScanner.close();
        
        int res = numberOne + numberTwo;
        System.out.printf("%d + %d = %d \n", numberOne, numberTwo, res);
        
        res = numberOne - numberTwo;
        System.out.printf("%d - %d = %d \n", numberOne, numberTwo, res);

        res = numberOne * numberTwo;
        System.out.printf("%d * %d = %d \n", numberOne, numberTwo, res);

        double numberOneD = numberOne; 
        double numberTwoD = numberTwo;

        double result =  numberOneD / numberTwoD;
        System.out.printf("%d / %d = %.2f \n", numberOne, numberTwo, result);
    }   
}
