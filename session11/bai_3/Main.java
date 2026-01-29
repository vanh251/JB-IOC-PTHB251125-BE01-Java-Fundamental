package session11.bai_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Alice", 3000));
        employees.add(new PartTimeEmployee(2, "Bob", 20, 45));
        employees.add(new FullTimeEmployee(3, "Charlie", 3500));

        for(Employee e: employees){
            e.showInfo();
            if(e instanceof BonusEligible){
                double bonus = ((BonusEligible) e).calculateBonus();
                System.out.println("Bonus: " + bonus);
            }
            else{
                System.out.println("Bonus: Not eligible");
            }
            System.out.println("-------------------");
        }
    }
}
