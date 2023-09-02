//Напишите программу, которая запрашивает у пользователя два числа и выводит результат их деления.
// Если пользователь вводит некорректные данные (например, буквы или делитель равен нулю), программа
// должна выводить сообщение "Ошибка" и просить пользователя ввести числа заново.

import java.util.Scanner;
import java.util.InputMismatchException;

public class seminar1_4 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.println("Введите 1 число: ");
//            int first = sc.nextInt();
//            System.out.println("Введите 2 число: ");
//            int second = sc.nextInt();
//
//            if (second == 0) {
//                throw new Exception("Цифра не должна быть нулем");
//            }
//
//            int result = first / second;
//            System.out.println("Result = " + result);
//        } catch (InputMismatchException e) {
//            System.out.println("InputMismatchException " + e.getMessage());
//            e.getStackTrace();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//
//        sc.close();

        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int dividend = 0;
        int divisor = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the dividend: ");
                dividend = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                divisor = scanner.nextInt();

                double result = (double) dividend / divisor;
                System.out.println("Result: " + result);

                validInput = true;  // Введены корректные числа, выходим из цикла
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль недопустимо.");
                scanner.nextLine();  // Очистка буфера ввода
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: введите числа.");
                scanner.nextLine();  // Очистка буфера ввода
            }
        }

        scanner.close();

    }

}
