/*
 *####################################
 * ADP_WS1314_v0
 *
 * RingQueue.java
 *
 *  Created on: 05.10.2013
 *      Author: Sheppard
 * 05.10.2013
 * 
 *####################################
 */
package a02;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class RingQueue<T> implements IQueue<T> {

    private int head; //Vorderteil
    private int tail; //Hinterteil
    private int size; //Größe der Schlange
    private int N; //Maximale Größe des Arrays
    
    private T[] rb;
    
     /**
     * N ist die Maximale Größe des Arrays vom Typ T. 
     * @param N
     */
    public RingQueue(int N) {
        super();
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.N = N; 
        
        this.rb = (T[]) new Object[N];
    }
    
    @Override
    public T front() {
        
        return ( (size != 0) ? rb[head] :  null );
   
    }

    @Override
    public boolean enqueu(T data) {
        
        if( !(isFull()) ) { //if( !(isFull()) ) {//Nicht Voll
            rb[tail] = data; 
            tail = tail % N; 
            size++;
            
            return true; 
        }
        
        return false;
    }

    @Override
    public boolean dequeue() {
        
        if( !(isEmpty()) ) {
            rb[head] = null;
            head++;
            head = head % N;
            size--;
            return true; 
        }
        return false;
    }

    @Override
    public boolean isEmpty() {

        return ( (size<= 0)  ?  true :  false);
    }

    public boolean isFull() {
        
        return ( (size >= N) ? true : false ); //rb.length
    }
}
