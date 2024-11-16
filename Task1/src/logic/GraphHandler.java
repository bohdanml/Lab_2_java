package logic;

import data.Node;
import data.Link;
import java.util.ArrayList;
import java.util.List;

public class GraphHandler {
    private final List<Node> nodes;
    private final List<Link> links;

    public GraphHandler() {
        nodes = new ArrayList<>();
        links = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addLink(Node start, Node end, boolean directed) {
        Link link = new Link(start, end, directed);
        links.add(link);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Link> getLinks() {
        return links;
    }
}
