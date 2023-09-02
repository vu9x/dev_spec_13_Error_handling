package hw3.ex1.PasswordVerifier;

public class DigitChecker extends Exception{
    public DigitChecker(){
        super("Пароль должен содержать хотя бы одну цифру.");
    }
}
