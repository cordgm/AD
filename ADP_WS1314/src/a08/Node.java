package a08;

public class Node<T> {

    T daten; //Die eigentliche Daten
    int key; 
    Node<T> links;    //Linker Sohn
    Node<T> rechts;  //Rechter Sohn
    Node<T> vater;   //Vater (Knoten)
}
