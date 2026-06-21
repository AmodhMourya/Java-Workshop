package ClassObjectAssign;


class CourseStudent {
    private String name, course;
    private double fee, discount;

    public void setName(String n)
     { 
        name = n; 
     }
    public void setCourse(String c) {
         course = c;
         }
    public void setFee(double f) {
         fee = f; 
        } 
    public void setDiscount(double d) { 
        discount = d;
     }

    public String getName() { 
        return name;
     }
    public String getCourse() {
         return course; 
        }
    public double getFinalFee() { 
        return fee - (fee * discount / 100);
     }
}

public class OnlineCourseES {
    public static void main(String[] args) {
        CourseStudent s = new CourseStudent();
        s.setName("Jethalal Gada");
        s.setCourse("Java + Spring Boot + DSA");
        s.setFee(10000);
        s.setDiscount(10);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Course : " + s.getCourse());
        System.out.println("Final Fee After 10% Discount: " + s.getFinalFee());
    }
}