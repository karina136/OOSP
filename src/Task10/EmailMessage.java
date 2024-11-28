package Task10;

public class EmailMessage {
    private String recipient;
    private String subject;
    private String body;

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetails() {
        return "Получатель: " + recipient + ", Тема: " + subject + ", Тело: " + body;
    }
}
