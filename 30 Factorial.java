import java.util.Scanner;

class Factorial {
//    Write a function that calculates the factorial of a given number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Factrial calculation calculator\n");
        System.out.println("Please enter the number: ");
        int num = input.nextInt();
        long fact = calculateFactrial(num);
        System.out.println("Factorial is "+ fact);


    }
    public static long calculateFactrial(int num){
        if (num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }


}
