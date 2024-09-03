package org.example;

public class GraphImpementation {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge("0", "1", true);
        g.addEdge("0", "4", true);
        g.addEdge("1", "2", true);
        g.addEdge("1", "3", true);
        g.addEdge("1", "4", true);
        g.addEdge("2", "3", true);
        g.addEdge("3", "4", true);

        System.out.println(g.printToString());
        System.out.println("get neighbour of :"+"4");
        g.neighbour("4");
        g.getVertexCount();
        g.hasEdge("1","0");

    }
}
