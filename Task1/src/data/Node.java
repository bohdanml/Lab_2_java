package data;

public class Node {
    private final String label;
    private final int value;

    public Node(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return label + " [" + value + "]";
    }
}
