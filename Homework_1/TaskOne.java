//Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Homework_1;

import java.util.Scanner;

public class TaskOne {
    static int inputNamber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите N: ");
        int number = iScanner.nextInt();
        iScanner.close();
        return number;
    }
    static int summmator(int n) {
        int resoult = 0;
        for (int i = 1; i <= n; i++) {
            resoult += i;
        }
        return resoult;
    }
    static int factor(int n) {
        int resoult = 1;
        for (int i = 1; i <= n; i++) {
            resoult = resoult * i;
        }
        return resoult;
    }
    public static void main(String[] args) {
        int number = inputNamber();
        // System.out.println(number);
        System.out.printf("сумма чисел от 1 до n = ");
        System.out.println(summmator(number));
        System.out.printf("произведение чисел от 1 до n = ");
        System.out.println(factor(number));

    }   
    
}
