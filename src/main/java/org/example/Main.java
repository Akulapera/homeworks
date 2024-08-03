package org.example;
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        final double PI = 3.14;
        int a = 2;
        int b = 3;

        int resultTask1 = makeSquare(number);
        System.out.println("The square of " + number + " is " + resultTask1);
        double resultTask2 = cylinderVolume(10.0, 3.5);
        System.out.println("Volume of cylinder is " + resultTask2);
        double resultTask3 = toDegree(2, 3);
        System.out.println("The degree " + a + " of " + b + " is " + resultTask3);

    }

    public static int makeSquare(int number) {
        int square = number * number;
        return square;
    }

    public static double cylinderVolume(double height, double radius) {
        double volume = PI * height * radius * radius;
        return volume;
    }
    public static double toDegree(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
