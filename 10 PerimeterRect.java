import java.util.Scanner;
class PerimeterRect {
    public static void main(String[] args) {
        System.out.println("Welcome to Perimeter Calculator");
        System.out.println("Enter all sides of a rectangle respectively to find the perimeter: ");
        Scanner input = new Scanner(System.in);
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double sideC = input.nextDouble();
        double sideD = input.nextDouble();

        double pr = sideA + sideB + sideC + sideD;
        System.out.println("The perimeter of the rectangle is: "+ pr);
    }
}
