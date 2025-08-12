import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to the leap year determiner");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year:");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("This year is leap year");

        } else {
            System.out.println("This year is not leap year.");
        }
    }
}
