package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
    Map<String, LinkedList<String>> map = new HashMap<>();
    public void addVertex( String s){
        map.put(s,new LinkedList<>());

    }

    public void addEdge(String source, String destination, boolean bidirectional){
        if(!map.containsKey(source)){
            addVertex(source);
        }
        if(!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(bidirectional){
            map.get(destination).add(source);
        }
    }

    public String printToString(){
        StringBuilder s = new StringBuilder();
        for(String k : map.keySet()){
            s.append(k +": ");
            for (String l: map.get(k)){
                s.append(l + " ");
            }
            s.append("\n");
        }
        return (s.toString());
    }

    public void neighbour(String s){
        if(!map.containsKey(s)){
            return;
        }
        System.out.println("neighbor of "+s+ " are :  ");
        for(String l : map.get(s)){
            System.out.println(">>> "+ l);
        }
    }

    public void getVertexCount(){
        System.out.println("vertext count :" + map.keySet().size());
    }

    public void hasEdge(String i,String j){
        if(null!=map.get(i) && map.get(i).contains(j)){
            System.out.println("the graph has edge between "+i+ " <=======> "+j);
        }else{
            System.out.println("the graph has no edge between "+i+" and "+j);
        }
    }





}
