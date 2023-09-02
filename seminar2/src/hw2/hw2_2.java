package hw2;


import java.util.Scanner;

//Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
// с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить
// результат деления.
//
//Обратите внимание, что в обоих задачах используются собственные исключения,
// которые наследуются от класса Exception. Это позволяет нам определить специфическую
// причину ошибки и передать информацию об ошибке для последующей обработки.
public class hw2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите делимое: ");
        int dividend = sc.nextInt();

        System.out.println("Введите делитель: ");
        int divisor = sc.nextInt();

        try{
            if(divisor == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }

            float quotient = dividend / divisor;
            System.out.printf("Частное: %.2f", quotient);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
