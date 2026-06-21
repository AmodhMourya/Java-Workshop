package ClassObjectAssign;

public class ResultTime {
    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public ResultTime(String studentName, int mathMarks, int scienceMarks, int englishMarks) {
        this.studentName = studentName;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getTotalMarks() {
        return getMathMarks() + getScienceMarks() + getEnglishMarks();
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
      ResultTime student = new ResultTime("Gourav", 85, 92, 78);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Average Marks: " + student.getAverage());
        System.out.println("Grade: " + student.getGrade());
    }
}
