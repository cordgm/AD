package a11;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die eigentliche Hash-Klasse.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class MyHash<T> implements IMyHash<T>, Serializable {

    //Attribute
    private T[] dataArray;
    private int size;
    
    //Konstruktor
    public MyHash(){
        this(16);
    }
    
    @SuppressWarnings("unchecked")
    public MyHash(int size){
        this.dataArray = (T[]) new Object[size];
        this.size = 0;
    }
    
    //Methoden
    private int hash(int key, T[] a, boolean isWriting){
        int index = -1;
        int i = 0;
        if(isWriting){
            do{
                index = (hash1(key, a) + (i * i) * hash2(key, a)) % a.length;
                i++;
                if(index < 0){
                    index += a.length -1;
                }
            }while(index < 0 || a[index] != null);
        } else {
            do{
                index = (hash1(key, a) + (i * i) * hash2(key, a)) % a.length;
                i++;
                if(index < 0){
                    index += a.length -1;
                }
            }while(index < 0 || a[index] != null && a[index].hashCode() != key);
        }
        
        return index;
    }
    
    private int hash1(int key, T[] a){
        return (key % a.length);
    }

    private int hash2(int key, T[] a){
        return (1 + (key % (a.length - 2)));
    }
    
    @SuppressWarnings("unchecked")
    private void checkLoadFactor(){
        double factor = ((double) this.size) / ((double) this.dataArray.length);
//                System.out.println(factor);
        if(factor > 0.6){
//                        System.out.println("------------ Resize array! -------------");
            T[] tmp = (T[]) new Object[(int) (this.dataArray.length * (1.0 + factor))];

            for(int i = 0; i < this.dataArray.length; i++){
                if(this.dataArray[i] != null){
                        int newIndex = hash(this.dataArray[i].hashCode(), tmp, true);
                        tmp[newIndex] = this.dataArray[i];
                }
            }
            this.dataArray = tmp;
        }
//                System.out.println(this.dataArray.length);
    }
    
    @Override
    public void add(int key, T info) {
        if(containsKey(key)){
            return;
        }
        checkLoadFactor();
        this.dataArray[hash(key, this.dataArray, true)] = info;
        this.size++;
    }

    @Override
    public T get(int key) {
        return this.dataArray[hash(key, this.dataArray, false)];
    }

    @Override
    public void remove(int key) {
        /*
         * MUSS NICHT IMPLEMENTIERT WERDEN!!!
         */
    }

    @Override
    public boolean containsKey(int key) {
        return (this.dataArray[hash(key, this.dataArray, false)] != null);
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        this.dataArray = (T[]) new Object[16];
        this.size = 0;
    }
    
    public List<T> getObjectList(){
        List<T> tmpList = new ArrayList<T>();
        for(int i = 0; i < this.dataArray.length; i++){
            if(this.dataArray[i] != null){
                tmpList.add(this.dataArray[i]);
            }
        }
        return tmpList;
    }
    
    protected void showArray(){
        for(int i = 0; i < this.dataArray.length; i++){
            System.out.print("[" + i + "]\t" + ((this.dataArray[i] != null) ? this.dataArray[i] : "-"));
            System.out.println();
        }
        System.out.println("Size: " + this.size);
    }
}
