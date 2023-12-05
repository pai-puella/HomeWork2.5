
public class Main {
    public static void main(String[] args) {
        try {
            validate("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Validation completed");
        }
    }

    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException("Login is incorrect");
        }

        if (!password.equals(confirmPassword) || password.length() > 20 || !password.matches("\\w+")) {
            throw new WrongPasswordException("Password is incorrect");
        }
    }
}
