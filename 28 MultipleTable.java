import java.util.Scanner;

//Develop a program that prints the Multiplication table for a given number.

 class MultipleTable {
    public static void main(String[] args) {
        greetings();
        printmultiNum();

    }
    public static void printmultiNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number you would like to multiple by: ");
        int num1 = input.nextInt();
        int i = 0;
        while (i <= 10){
                System.out.println(num1 + " x " + i + " = " + (num1 * i));
                i++;
        }
    }
    public static void greetings(){
        System.out.println("Welcome to the multiplication table");
    }
}
