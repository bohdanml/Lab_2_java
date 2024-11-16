import input.InputData;
import logic.*;
import output.OutputData;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        OutputData outputData = new OutputData();

        inputData.printMenu();
        int choice = inputData.getInt("");
        Shape shape = null;

        switch (choice) {
            case 1:
                double base = inputData.getDouble("Введіть основу трикутника: ");
                double height = inputData.getDouble("Введіть висоту трикутника: ");
                shape = new Triangle(base, height);
                break;
            case 2:
                double side = inputData.getDouble("Введіть сторону квадрата: ");
                shape = new Square(side);
                break;
            case 3:
                double length = inputData.getDouble("Введіть довжину прямокутника: ");
                double width = inputData.getDouble("Введіть ширину прямокутника: ");
                shape = new Rectangle(length, width);
                break;
            case 4:
                double cubeSide = inputData.getDouble("Введіть сторону куба: ");
                shape = new Cube(cubeSide);
                break;
            case 5:
                double baseArea = inputData.getDouble("Введіть площу основи піраміди: ");
                double pyramidHeight = inputData.getDouble("Введіть висоту піраміди: ");
                shape = new Pyramid(baseArea, pyramidHeight);
                break;
            case 6:
                double radius = inputData.getDouble("Введіть радіус кола: ");
                shape = new Circle(radius);
                break;
            case 7:
                double sphereRadius = inputData.getDouble("Введіть радіус сфери: ");
                shape = new Sphere(sphereRadius);
                break;
            default:
                System.out.println("Невірний вибір.");
                return;
        }

        outputData.printArea(shape.area());
        outputData.printVolume(shape.volume());
    }
}
