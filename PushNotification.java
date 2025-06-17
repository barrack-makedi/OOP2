public class PushNotification implements NotificationService {
    public void send(Employee emp, String message) {
        System.out.println("Push notification to " + emp.getName() + ": " + message);
    }
}
