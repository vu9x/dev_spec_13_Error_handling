package hw3.ex1.PasswordVerifier;

public class UpperCaseChecker extends Exception{
    public UpperCaseChecker(){
        super("Пароль должен содержать хотя бы одну заглавную букву.");
    }
}
