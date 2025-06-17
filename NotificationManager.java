// --- L: Liskov Substitution Principle ---
public class NotificationManager {
    private NotificationService notifier;

    public NotificationManager(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void notifyEmployee(Employee emp, String msg) {
        notifier.send(emp, msg);
    }
}
