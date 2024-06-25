package merve_hoca_mex;

public class Engineer extends Employee {
    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        return super.salary * .05;
    }
}
