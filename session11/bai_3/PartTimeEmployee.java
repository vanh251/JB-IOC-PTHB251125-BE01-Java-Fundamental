package session11.bai_3;

public class PartTimeEmployee extends Employee implements BonusEligible{
    private double hourWage;
    private int workingHours;

    public PartTimeEmployee(int id, String name, double hourWage, int workingHours) {
        super(id, name);
        this.hourWage = hourWage;
        this.workingHours = workingHours;
    }

    @Override
    protected double calculateSalary() {
        return hourWage*workingHours;
    }

    public void showInfo() {
        super.showInfo();
    }


    @Override
    public double calculateBonus() {
        if(workingHours>40){
            return calculateSalary()*0.1;
        } else {
            return 0;
        }
    }
}
