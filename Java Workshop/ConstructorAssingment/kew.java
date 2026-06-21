package ConstructorAssingment;

class StudentAdmission {
    private String collegeName;
    private String studentName;
    private String course;

    {
        System.out.println("Admission Process Started");
        this.collegeName = "ABC College";
    }

    public StudentAdmission() {
        this("Unknown Student", "Not Assigned");
    }

    public StudentAdmission(String studentName) {
        this(studentName, "Not Assigned");
    }

    public StudentAdmission(String studentName, String course) {
        this.studentName = studentName;
        this.course = course;
        System.out.println("College: " + this.collegeName);
        System.out.println("Student: " + this.studentName);
        System.out.println("Course: " + this.course);
    }

    public static void main(String[] args) {
        StudentAdmission student = new StudentAdmission("Neha", "MCA");
    }
}