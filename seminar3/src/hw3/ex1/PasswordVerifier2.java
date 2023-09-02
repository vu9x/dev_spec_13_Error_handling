package hw3.ex1;

import java.util.regex.*;
import hw3.ex1.PasswordVerifier.*;

public class PasswordVerifier2 extends Exception{
    public PasswordVerifier2(String password){

        boolean digitMatch = Pattern.matches("\\d",password);
        boolean caseMatch = Pattern.matches("[A-Z]", password);

       try {
            if(password.length() < 8) throw new LenChecker();
            if(!digitMatch) throw new DigitChecker();
            if(!caseMatch) throw new UpperCaseChecker();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
