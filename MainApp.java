public class MainApp {
     public static void main(String[] args) {
        Employee emp = new Employee("Jane Doe", "jane@example.com", "+254700123456");

        // Notify using Email
        NotificationManager manager = new NotificationManager(new EmailNotification());
        manager.notifyEmployee(emp, "Your salary has been credited.");

        // Notify using SMS
        manager = new NotificationManager(new SMSNotification());
        manager.notifyEmployee(emp, "You got a promotion!");

        // Generate reports
        Reportable report = new SalaryReport();
        report.generate(emp);

        report = new PromotionReport();
        report.generate(emp);
    }
}
