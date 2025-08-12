import java.util.Scanner;
// Create a program that computes the sum of the digits os an integer.
class Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = sumOfTheDigits(num);
        System.out.println("The Sum of the digit: "+ sum);
    }
    public static int sumOfTheDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
