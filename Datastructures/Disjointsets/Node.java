



/*
  12-February-2023
*/


package com.jmboulos.datastructures.disjointsets;

public class Node<T> {

    public int rank;
    public Node<T> parent;
    public T data;

    public Node(T data) {
        this.data = data;
        parent = this;
    }
}
