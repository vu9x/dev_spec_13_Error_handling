package hw3.ex1;


import java.util.regex.*;
import hw3.ex1.PasswordVerifier.*;
import java.util.Scanner;


// Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
//
//Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает
// строку пароля и проверяет его на соответствие следующим правилам:
//
//Пароль должен быть не менее 8 символов.
//Пароль должен содержать хотя бы одну цифру.
//Пароль должен содержать хотя бы одну заглавную букву.
//Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
public class hw1 {
    public static void main(String[] args) {
        Pattern digit = Pattern.compile("\\d");
        Pattern caseM = Pattern.compile("[A-Z]");

        Scanner sc = new Scanner(System.in);
        boolean go = true;

        while(go){
            System.out.println("Введите пароль: ");
            String password = sc.nextLine();

            Matcher digitMatcher = digit.matcher(password);
            Matcher caseMatch = caseM.matcher(password);

            try {
                if(password.length() < 8) throw new LenChecker();
                if(!digitMatcher.find()) throw new DigitChecker();
                if(!caseMatch.find()) throw new UpperCaseChecker();
                System.out.println("Пароль принят");
                go = false;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
