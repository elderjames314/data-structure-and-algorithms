package com.aapeli.springpattern.microsoft.graph;

import com.aapeli.springpattern.java8.James;

/**
 * @author jamesoladimeji
 * @created 03/02/2022 - 11:09 AM
 * @project IntelliJ IDEA
 */
public class GraphOperation {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertext("James");
        graph.addVertext("John");
        graph.addVertext("Bob");
        graph.addVertext("Emmanuel");
        graph.addVertext("Dimeji");

        graph.addEdge("James", "John");
        graph.addEdge("James", "Emmanuel");
        graph.addEdge("John", "Bob");
        graph.addEdge("Emmanuel", "Dimeji");

    }
}
