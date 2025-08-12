import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Area calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Base into cms: ");
        double base = input.nextDouble();
        System.out.println("Please enter the Height into cms: ");
        double height = input.nextDouble();

        double totalArea = 0.5 * base * height;
        System.out.println("Here is the Area of Triangle: " + totalArea + "cm2");


    }
}
