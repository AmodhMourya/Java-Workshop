package OperatorsAssigment;

class WeeksDays {
    public static void main(String[] args) {
        int totalDays = 31; 
        int weeks = totalDays / 7;
        int remainingDays = totalDays % 7;
        System.out.println("Total Days = " + totalDays);
        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + remainingDays);
    }
}

