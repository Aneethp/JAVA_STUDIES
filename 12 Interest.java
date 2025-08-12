import java.util.Scanner;

class Interest {
    public static void main(String[] args) {
        System.out.println("Welcome to the Interest calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Principle ");
        int principle = input.nextInt();
        System.out.println("Please enter the Time: ");
        float time = input.nextFloat();
        System.out.println("Please enter the Rate: ");
        float rate = input.nextFloat();

        float simpleInt = (principle * time * rate)/100;
        System.out.println("Here is your simple interest: " + simpleInt );


    }
}
