package hw2;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Задача 1:
//Напишите программу, которая запрашивает у пользователя число и проверяет,
//является ли оно положительным. Если число отрицательное или равно нулю, программа
//должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
//В противном случае, программа должна выводить сообщение "Число корректно".
public class hw2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое положительное число: ");
        int num = sc.nextInt();

        try{
            if(num < 0 || num == 0){
                throw new InvalidNumberException("Некорректное число");
            }
            System.out.println("Корректное число");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
