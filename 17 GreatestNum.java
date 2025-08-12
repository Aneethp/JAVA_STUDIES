import java.util.Scanner;

class GreatestNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Determiner");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three Number Respectively to find out which is the Greatest: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 > num3){
            System.out.println(num1 + " is number is the greatest");
        }else if (num2 >= num3) {
            System.out.println(num2 + " is number is the greatest");
//        }else if(num1 < num2 && num2 < num3){
//            System.out.println("3rd number is the greatest");
//        }
        } else{
            System.out.println(num3 + " is number is the greatest");
        }
    }
}
