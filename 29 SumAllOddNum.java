import java.util.Scanner;

class SumAllOddNum {
    // Crete a program to sum all odd numbers from 1 to a specified number N.
     public static void main(String[] args) {
         System.out.println("Welcome to the odd calculation calculator");
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int num = input.nextInt();
         int sum = sumOddNum(num);
         System.out.println("Odd Sum till " + num + " is " + sum );
     }
     public static int sumOddNum(int num) {
         int sum = 0;
         int i = 1;
         while (i <= num) {
            sum += i;
            i += 2;
         }
             return sum;
     }

}
