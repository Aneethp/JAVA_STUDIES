import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swaping Station");
        System.out.println("Enter the value of A: ");
        int a = input.nextInt();
        System.out.println("Now,Enter the value of B: ");
        int b = input.nextInt();
        System.out.println("The value of A is = "+a);
        System.out.println("The value of B is = "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("I swaped the value for you");

        System.out.println("The value of A is = "+a);
        System.out.println("The value of B is = "+c);
            }
}