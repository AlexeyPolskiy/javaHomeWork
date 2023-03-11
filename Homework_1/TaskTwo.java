//Вывести все простые числа от 1 до 1000

package Homework_1;

public class TaskTwo {
    static boolean simpleNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                continue;        
            } 
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    for (int i = 2; i <= 1000; i++) {
        if (simpleNum(i) == true)
            System.out.println(i);
    }
}
}