package Task4;

public class Main {
    public static void main(String[] args) {
        Protocol httpClient = new HttpClientAdapter();
        httpClient.connect();
        httpClient.send("Данные для HTTP");
        httpClient.disconnect();
        System.out.println();

        Protocol ftpClient = new FtpClientAdapter();
        ftpClient.connect();
        ftpClient.send("Данные для FTP");
        ftpClient.disconnect();
        System.out.println();

        Protocol smtpClient = new SmtpClientAdapter();
        smtpClient.connect();
        smtpClient.send("Данные для SMTP");
        smtpClient.disconnect();

    }
}
