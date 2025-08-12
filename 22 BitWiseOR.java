import java.util.Scanner;

class BitWiseOR {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Showing BitWise OR Operator\n");
        System.out.print("Please enter the first Number: ");
        int first = input.nextInt();
        System.out.print("Please enter the second Number: ");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result is: " + result);
    }

}
