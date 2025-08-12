import java.util.Scanner;

class Determine {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Determine Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("Positive Number");
        } else if (num == 0) {
            System.out.println("Number is ZERO");
        }else {
            System.out.println("Negative Number");
        }
    }
}
