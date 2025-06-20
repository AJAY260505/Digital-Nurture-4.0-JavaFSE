public class Main {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();

        // Add SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);

        // Add Slack functionality on top of SMS + Email
        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification via all channels
        fullNotifier.send("Server is down!");
    }
}
