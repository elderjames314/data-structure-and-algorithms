package com.aapeli.springpattern.microsoft.graph;

import java.util.*;

/**
 * @author jamesoladimeji
 * @created 03/02/2022 - 10:47 AM
 * @project IntelliJ IDEA
 */
public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public void addVertext(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertext(String label) {
        Vertex v =  new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v)); //remove its value
        adjVertices.remove(new Vertex(label)); //remove the key
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);

        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String labbel2) {
        Vertex v1 = new Vertex(label1);
        Vertex  v2 = new Vertex(labbel2);

        List<Vertex> eVi = adjVertices.get(v1);
        List<Vertex> ev2 = adjVertices.get(v2);

        if(eVi != null) eVi.remove(v2);
        if(ev2 != null) ev2.remove(v1);

    }

    public List<Vertex> getAdjVertext(String label) {
        return adjVertices.get(new Vertex(label));
    }

    public Set<String> depthFirstSearch(String root, Graph graph) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
           String vertex = stack.pop();
           if(!visited.contains(vertex)) {
               visited.add(vertex);
            }
           for(Vertex v : graph.getAdjVertext(vertex)) {
               stack.push(v.getLabel());
           }
        }
        return visited;
    }

    public Set<String> breathFirstSearch(String root, Graph graph) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new ArrayDeque<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for(Vertex v : graph.getAdjVertext(vertex)) {
                if(!visited.contains(v)) {
                    visited.add(v.getLabel());
                    queue.add(v.getLabel());
                }
            }
        }
        return visited;
    }
}
