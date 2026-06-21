package ClassObjectAssign;

public class LibraryBookFine {
    private String bookName;
    private int daysLate;
    private double finePerDay;

    public LibraryBookFine(String bookName, int daysLate, double finePerDay) {
        this.bookName = bookName;
        this.daysLate = daysLate;
        this.finePerDay = finePerDay;
    }

    public String getBookName() {
        return bookName;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public double getFinePerDay() {
        return finePerDay;
    }

    public double getTotalFine() {
        double totalFine = daysLate * finePerDay;
        if (daysLate > 10) {
            totalFine = totalFine + 100;
        }
        return totalFine;
    }

    public static void main(String[] args) {
        LibraryBookFine book = new LibraryBookFine("How To Get Rich In 25day: By Akshay Kumar", 12, 5.0);

        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Days Late: " + book.getDaysLate());
        System.out.println("Fine Per Day: ₹" + book.getFinePerDay());
        System.out.println("Total Fine (including penalty if applicable): ₹" + book.getTotalFine());
    }
}
