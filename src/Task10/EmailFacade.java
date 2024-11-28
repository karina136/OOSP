package Task10;

public class EmailFacade {
    private SmtpServer smtpServer;
    private EmailMessage emailMessage;
    private EmailSender emailSender;

    public EmailFacade() {
        smtpServer = new SmtpServer();
        emailMessage = new EmailMessage();
        emailSender = new EmailSender();
    }

    public void sendEmail(String host, int port, String recipient, String subject, String body) {
        smtpServer.configureServer(host, port);

        emailMessage.setRecipient(recipient);
        emailMessage.setSubject(subject);
        emailMessage.setBody(body);

        String details = emailMessage.getDetails();
        emailSender.send(details);
    }
}
