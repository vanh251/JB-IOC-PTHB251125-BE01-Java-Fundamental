package session11.bai_3;

public class FullTimeEmployee extends Employee{
    protected double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    protected double calculateSalary() {
        return monthlySalary;
    }

    @Override
    protected void showInfo() {
        super.showInfo();
    }
}
