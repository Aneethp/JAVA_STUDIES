import java.util.Scanner;

class GCD {
    //Create a program to find the Greatest Common division number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the GCD Calculater");
        System.out.print("Please enter the 1st number: ");
        int first = input.nextInt();
        System.out.println("Please enter the 1st number: ");
        int second = input.nextInt();
        int GCD =  GCD(first, second);
        System.out.println("LCM of two number is: "+ GCD);
    }
}
