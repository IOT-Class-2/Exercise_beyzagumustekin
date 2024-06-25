package merve_hoca_mex;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Beyza Gümüştekin",58000,26);
        SalesPerson employeeTwo = new SalesPerson("Şule Yalçın",5800,23,.55);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getComissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());
    }
}
