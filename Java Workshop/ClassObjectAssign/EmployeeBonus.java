package ClassObjectAssign;

public class EmployeeBonus {
    private String employeeName;
    private double salary;
    private int yearsOfService;

    public EmployeeBonus(String employeeName, double salary, int yearsOfService) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public double getBonusAmount() {
        double bonusPercentage;
        if (yearsOfService >= 10) {
            bonusPercentage = 0.20;
        } else if (yearsOfService >= 5) {
            bonusPercentage = 0.10;
        } else {
            bonusPercentage = 0.05;
        }
        return salary * bonusPercentage;
    }

    public double getFinalSalary() {
        return salary + getBonusAmount();
    }

    public static void main(String[] args) {
        EmployeeBonus emp = new EmployeeBonus("Hunar Singh", 55555.0, 7);

        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Base Salary: Rs" + emp.getSalary());
        System.out.println("Years of Service: " + emp.getYearsOfService());
        System.out.println("Bonus Amount: Rs" + emp.getBonusAmount());
        System.out.println("Final Salary with Bonus: Rs" + emp.getFinalSalary());
    }
}