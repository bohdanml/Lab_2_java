import data.Node;
import logic.GraphHandler;
import presentation.GraphDisplay;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphHandler graph = new GraphHandler();

        System.out.print("ID першої вершини: ");
        String id1 = scanner.nextLine();
        System.out.print("Дані для першої вершини (int): ");
        int data1 = getIntInput();

        Node node1 = new Node(id1, data1);
        graph.addNode(node1);

        System.out.print("ID другої вершини: ");
        String id2 = scanner.nextLine();
        System.out.print("Дані для другої вершини (int): ");
        int data2 = getIntInput();

        Node node2 = new Node(id2, data2);
        graph.addNode(node2);

        System.out.print("Чи зв'язок орієнтований? (true/false): ");
        boolean directional = getBooleanInput();

        graph.addLink(node1, node2, directional);

        GraphDisplay.showGraph(graph);

        scanner.close();
    }

    private static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введіть коректне ціле число.");
                scanner.nextLine();
            }
        }
    }

    private static boolean getBooleanInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("true")) {
                return true;
            } else if (input.equalsIgnoreCase("false")) {
                return false;
            } else {
                System.out.println("Помилка: введіть 'true' або 'false'.");
            }
        }
    }
}
