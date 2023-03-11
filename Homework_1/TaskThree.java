//Реализовать простой калькулятор

package Homework_1;

import java.util.Scanner;

public class TaskThree {  
    public static void main(String[] args) {
        System.out.printf("Введите число a = ");

        Scanner iScanner = new Scanner(System.in);
        int numberOne = iScanner.nextInt();
        
        System.out.printf("Введите число b = ");
        int numberTwo = iScanner.nextInt();
        
        iScanner.close();
        
        int res = numberOne + numberTwo;
        System.out.printf("%d + %d = %d \n", numberOne, numberTwo, res);
        
        res = numberOne - numberTwo;
        System.out.printf("%d - %d = %d \n", numberOne, numberTwo, res);

        res = numberOne * numberTwo;
        System.out.printf("%d * %d = %d \n", numberOne, numberTwo, res);

        res = numberOne / numberTwo;
        System.out.printf("%d / %d = %d \n", numberOne, numberTwo, res);
    }   
}
