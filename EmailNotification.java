public class EmailNotification implements NotificationService {
    public void send(Employee emp, String message) {
        System.out.println("Email to " + emp.getEmail() + ": " + message);
    }
}
