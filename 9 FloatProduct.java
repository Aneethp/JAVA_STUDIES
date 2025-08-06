import java.util.Scanner;

class FloatProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing float multiplication\n");
        System.out.println("Enter the first Number: ");
        double first = input.nextDouble();
        System.out.println("Now enter Second Number");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result : "+ mul);
    }
}
