package input;

import java.util.Scanner;

public class InputData {
    private final Scanner scanner;

    public InputData() {
        this.scanner = new Scanner(System.in);
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public void printMenu() {
        System.out.println("Оберіть фігуру:");
        System.out.println("1. Трикутник");
        System.out.println("2. Квадрат");
        System.out.println("3. Прямокутник");
        System.out.println("4. Куб");
        System.out.println("5. Піраміда");
        System.out.println("6. Коло");
        System.out.println("7. Сфера");
        System.out.print("Ваш вибір: ");
    }
}
