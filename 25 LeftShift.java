import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Complement operator\n");
        System.out.print("Please enter the first Number: ");
        int num = input.nextInt();


        int result = num << 4;
        System.out.println("Result is: " + result);
    }

}
