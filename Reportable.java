// --- I: Interface Segregation Principle ---
interface Reportable {
    void generate(Employee emp);
}

class SalaryReport implements Reportable {
    public void generate(Employee emp) {
        System.out.println("Generating salary report for " + emp.getName());
    }
}

class PromotionReport implements Reportable {
    public void generate(Employee emp) {
        System.out.println("Generating promotion report for " + emp.getName());
    }
}
