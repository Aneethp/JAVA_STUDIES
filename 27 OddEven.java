import java.sql.SQLOutput;
import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd or Even determine operating calculator\n");
        System.out.print("Please enter the first Number: ");
        int num = input.nextInt();


        if ((num & 1) == 1) {
            System.out.println("Your number is ODD.");
        } else {
            System.out.println("Your number is Even");
        }
    }

}
