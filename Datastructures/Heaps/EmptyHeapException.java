



/*
  Exception to be thrown if the getElement method is used on an empty heap.
  
  13-February-2023
*/


package com.thealgorithms.datastructures.heaps;

@SuppressWarnings("serial")
public class EmptyHeapException extends Exception {

    public EmptyHeapException(String message) {
        super(message);
    }
}
