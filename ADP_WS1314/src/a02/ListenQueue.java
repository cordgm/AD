/*
 *####################################
 * ADP_WS1314_v0
 *
 * EVL_Queue.java
 *
 *  Created on: 04.10.2013
 *      Author: Sheppard
 * 04.10.2013
 * 
 *####################################
 */
package a02;

import a01.Node;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */

public class ListenQueue<T> implements IQueue<T> {

    private Node<T> head; //Vorderteil
    private Node<T> tail; //Hinterteil
    private int size; //Größe der Schlange
    
    //Konstruktor.
    public ListenQueue() {
        super();
        this.head = new Node<T>(null,null);
        this.tail = new Node<T>(null,null);
        this.size = 0;
        
        this.head.setNext(tail);
        this.tail.setNext(head);
    }

    @Override
    public T front() {
        
        return this.head.getData();
    }

 
    @Override
    public boolean enqueu(T data) {
        
        Node<T> tmp = new Node<T>(null,null);
        this.tail.setData(data);
        this.tail.setNext(tmp);
        tmp.setNext(this.tail);//?
        this.tail = this.tail.getNext();
        size++;
        
        return true;
    }

    @Override
    public boolean dequeue() {
        if(!(isEmpty())){
            this.head = this.head.getNext();
            size--;
            return true;
        }
        
        
        return false;
    }

    @Override
    public boolean isEmpty() {
       return (size == 0);
    }

    public Node<T> getHead() {
        return head;
    }

    
    //--------- Eigene Methoden ---------
    /**
     * @param head
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     * @return tail
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     * @param tail
     */
    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    /**
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    
    /**
     * Gibt den Inhalt der Queue aus.
     */
    public void showAll() {
        Node<T> tmp = head;
        System.out.println("*******Anfang der Queue*******");
        do{
            System.out.println("Node: " + tmp + "\nDATA: " + tmp.getData() + "\nNext:  " + tmp.getNext() + "\n");
            tmp = tmp.getNext();
        }while(tmp.getData() != null);
        
        System.out.println("Node: " + tmp + "\nDATA: " + tmp.getData() + "\nNext:  " + tmp.getNext() + "\n");
        tmp = tmp.getNext();
        
        System.out.println("Size: " + size);
    
        System.out.println("*******Ende der Queue*******\n\n");
    }

  
    
    
}
