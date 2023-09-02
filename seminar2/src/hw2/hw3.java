package hw2;

//Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
//
// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int[] intArr = new int[2];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){

            System.out.printf("Введите число %d: ", i+1);
            int num = sc.nextInt();
            intArr[i] = num;

        }

        try {
            if (intArr[0] > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            if (intArr[1] < 0){
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            if(intArr[0] + intArr[1] < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            System.out.println("Проверка пройдена успешно");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
