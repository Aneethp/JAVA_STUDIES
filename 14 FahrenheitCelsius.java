import java.util.Scanner;

class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fahrenheit to Celsius calculator");
        System.out.println("Please enter the Fahrenheit ");
        int fah = input.nextInt();

        double cel = (fah - 32)* 5/9;
        System.out.println("Your temperature is : " + cel+ "C" );


    }
}
