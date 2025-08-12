import java.util.Scanner;

class CompoundInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Compound Interest calculator");
        System.out.println("Please enter the Principle ");
        int principle = input.nextInt();
        System.out.println("Please enter the Time: ");
        float time = input.nextFloat();
        System.out.println("Please enter the Rate: ");
        float rate = input.nextFloat();

        double compInt = principle* Math.pow((1 + rate / 100), time);
        System.out.println("Here is your Compound interest: " + compInt );


    }
}
