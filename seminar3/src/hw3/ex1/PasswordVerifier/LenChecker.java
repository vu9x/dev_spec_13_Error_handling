package hw3.ex1.PasswordVerifier;

public class LenChecker extends Exception{
    public LenChecker(){
        super("Пароль должен быть не менее 8 символов");
    }
}
