package Task10;

public class Main {
    public static void main(String[] args) {
        EmailFacade emailFacade = new EmailFacade();

        emailFacade.sendEmail(
                "smtp.example.com", 25,
                "user1@example.com",
                "Привет!",
                "Привет, user1!!!."
        );
    }
}
