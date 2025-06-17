public class SMSNotification implements NotificationService {
    public void send(Employee emp, String message) {
        System.out.println("SMS to " + emp.getPhone() + ": " + message);
    }
}
