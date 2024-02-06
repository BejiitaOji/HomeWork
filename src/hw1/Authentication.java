package hw1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {

    public static final String LOGIN_AND_PASSWORD_REGEX = "[a-zA-Z0-9_]+";
    public static final Pattern LOGIN_AND_PASSWORD_PATTERN = Pattern.compile(LOGIN_AND_PASSWORD_REGEX);

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {

            Matcher loginMatcher = LOGIN_AND_PASSWORD_PATTERN.matcher(login);
            Matcher passwordMatcher = LOGIN_AND_PASSWORD_PATTERN.matcher(password);

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
