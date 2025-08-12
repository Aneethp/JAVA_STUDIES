import java.util.Scanner;

class LCM {
    //Create a program to find the least common Multiple (LCM) of two numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the LCM Calculater");
        System.out.print("Please enter the 1st number: ");
        int first = input.nextInt();
        System.out.println("Please enter the 1st number: ");
        int second = input.nextInt();
        int lcm =  lcm(first, second);
        System.out.println("LCM of two number is: "+ lcm);
    }
    public static int lcm(int first, int second){
        int i = 1;
        while (true){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
