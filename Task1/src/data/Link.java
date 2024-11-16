package data;

public class Link {
    private final Node start;
    private final Node end;
    private final boolean directed;

    public Link(Node start, Node end, boolean directed) {
        this.start = start;
        this.end = end;
        this.directed = directed;
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }

    public boolean isDirected() {
        return directed;
    }

    @Override
    public String toString() {
        return start + (directed ? " -> " : " -- ") + end;
    }
}
