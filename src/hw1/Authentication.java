package hw1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {

    public static boolean autenticate(String login, String password, String confirmPassword) throws Exception {
        try {
            Pattern p = Pattern.compile("[a-zA-Z0-9_]+");
            Matcher loginMatcher = p.matcher(login);
            Matcher passwordMatcher = p.matcher(password);

            if (login.length() >= 20 || !loginMatcher.matches()) {
                throw new WrongLoginException("invalid login format");
            }

            if (!passwordMatcher.matches() || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("invalid password format or passwords do not match");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return false;
        }


    }
}
