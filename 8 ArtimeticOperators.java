import java.util.Scanner;

class ArtimeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator.");
        System.out.println("Enter the first number: ");

        int first = input.nextInt();
        System.out.println("Now enter the second Number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Additional : "+ add);
        System.out.println("Substraction : "+ sub);
        System.out.println("Multiply : "+ mult);
        System.out.println("Dividion : "+ div);
        System.out.println("Modulus : "+ mod);
    }
}
