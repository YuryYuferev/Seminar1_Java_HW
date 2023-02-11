/* Вычислить n! (произведение чисел от 1 до n) */

import java.util.Scanner;

public class Task1n {

public static void main(String[] args) {
 
    System.out.println("Введите число n: ");
    try (Scanner scanner = new Scanner((System.in))) {
        Integer n = scanner.nextInt();
        int number = multiplication_numbers(n);
        System.out.printf("Для n = %d факториал числа будет равен: %d", n, number);
    }
}
public static int multiplication_numbers(int number){
    int res = 1;
    if (number == 1){
        //res = 1;
        return res;
    } 
        else {
            res = number * multiplication_numbers(number - 1);
            return res;
        }
    }
}

