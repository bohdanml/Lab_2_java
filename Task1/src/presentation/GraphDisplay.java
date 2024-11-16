package presentation;

import logic.GraphHandler;
import data.Link;
import data.Node;

public class GraphDisplay {
    public static void showGraph(GraphHandler graph) {
        System.out.println("Nodes:");
        for (Node node : graph.getNodes()) {
            System.out.println(node);
        }
        System.out.println("\nLinks:");
        for (Link link : graph.getLinks()) {
            System.out.println(link);
        }
    }
}
