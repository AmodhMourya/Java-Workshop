package ConstructorAssingment;

class EmployeeJoining {
    private String name;
    private String department;

    {
        System.out.println("Employee Registration Started");
    }

    public EmployeeJoining() {
        this("Unknown", "Bench");
    }

    public EmployeeJoining(String name) {
        this(name, "General");
    }

    public EmployeeJoining(String name, String department) {
        this.name = name;
        this.department = department;
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        EmployeeJoining emp = new EmployeeJoining("Raja Kohli", "IT");
    }
}