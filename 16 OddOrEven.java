import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Welcome to the ODD or EVEN Determiner");
        Scanner input = new Scanner(System.in);
        System.out.println("Input your Number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("This is an Even Number");
        }else {
            System.out.println("This is an Odd Number");
        }
    }
}
