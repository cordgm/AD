package a01;

import java.util.ArrayList;



public class Testframe {

    /**
     * @param args
     */
    public static void main(String[] args) {

		List<Integer> list1 = new List<Integer>();
		List<Integer> list2 = new List<Integer>();
        
		//----------------  insert  ----------------
		//List1
		System.out.println("----------------  insert List 1  ----------------");
		list1.insert(list1.getHead(), 1);
		list1.insert(list1.find(1), 2);
		list1.insert(list1.find(2), 3);
		list1.showAll();
		//List2
		System.out.println("----------------  insert List 2  ----------------");
        list2.insert(list2.getHead(),22);
        list2.insert(list2.find(22),23);
        list2.insert(list2.find(23),24);
        list2.showAll();
        
        //----------------  concat  ----------------
		System.out.println("----------------  concat  ----------------");
        list1.concat(list2);
		list1.showAll();
		
        //----------------  Anfang und Ende was einfügen  ----------------
		System.out.println("----------------  Anfang und Ende was einfügen  ----------------");
		list1.insert(list1.getHead(), 0);
		list1.insert(list1.getTail(), 99);
		list1.showAll();
		
		//Ungueltiges Element einfuegen
		list1.insert(new Node<Integer>(null, null), 666);   //darf nichts inserten!
		list1.showAll();
		
		System.out.println("Kemplaexitaet von insert");
		
		list1 = new List<Integer>();
		list1.setZaehlerNull();
		for(int i = 0; i < 5 ;i++){
			list1.insert(list1.getHead(), i);
		}
		System.out.println("Listengroesse 5 = " + list1.getZaehler());
		
		list1 = new List<Integer>();
		list1.setZaehlerNull();
		for(int i = 0; i < 50 ;i++){
			list1.insert(list1.getHead(), i);
		}
		System.out.println("Listengroesse 50 = " + list1.getZaehler());
		
		list1 = new List<Integer>();
		list1.setZaehlerNull();
		for(int i = 0; i < 500 ;i++){
			list1.insert(list1.getHead(), i);
		}
		System.out.println("Listengroesse 500 = " + list1.getZaehler());
		
		list1 = new List<Integer>();
		list1.setZaehlerNull();
		for(int i = 0; i < 5000 ;i++){
			list1.insert(list1.getHead(), i);
		}
		System.out.println("Listengroesse 5000= " + list1.getZaehler() + "\n");
		
		
		System.out.println("Kemplaexitaet von find");
		
		list1 = new List<Integer>();
		for(int i = 0; i < 5 ;i++){
			list1.insert(list1.getHead(), i);
		}
		list1.setZaehlerNull();
		list1.find(999999);
		System.out.println("Listengroesse 5 = " + list1.getZaehler());
		
		list1 = new List<Integer>();
		for(int i = 0; i < 50 ;i++){
			list1.insert(list1.getHead(), i);
		}
		list1.setZaehlerNull();
		list1.find(999999);
		System.out.println("Listengroesse 50 = " + list1.getZaehler());
		
		list1 = new List<Integer>();
		for(int i = 0; i < 500 ;i++){
			list1.insert(list1.getHead(), i);
		}
		list1.setZaehlerNull();
		list1.find(999999);
		System.out.println("Listengroesse 500 = " + list1.getZaehler());
		
		list1 = new List<Integer>();
		for(int i = 0; i < 5000 ;i++){
			list1.insert(list1.getHead(), i);
		}
		list1.setZaehlerNull();
		list1.find(999999);
		System.out.println("Listengroesse 5000 = " + list1.getZaehler() + "\n");
		
		
		//-----------------------------Zeitmessungen----------------------------------
		System.out.println("***** Zeitmessungen *******\nbenötigte Zeit, um ein Element zu suchen, welches nicht existiert");
		System.out.println("\nEinfach Verkettete Liste");
		
		list1 = new List<Integer>();
		for(int i = 0; i < 100 ;i++){
			list1.insert(list1.getHead(), i);
		}
		long time1 = System.currentTimeMillis();
		list1.find(2000000);
		long time2 = System.currentTimeMillis();
		System.out.println("Listengroesse 100 = " + (time2-time1) + " ms");
		
		
		list1 = new List<Integer>();
		for(int i = 0; i < 10000 ;i++){
			list1.insert(list1.getHead(), i);
		}
		time1 = System.currentTimeMillis();
		list1.find(2000000);
		time2 = System.currentTimeMillis();
		System.out.println("Listengroesse 10000 = " + (time2-time1) + " ms");
		
		
		list1 = new List<Integer>();
		for(int i = 0; i < 1000000 ;i++){
			list1.insert(list1.getHead(), i);
		}
		time1 = System.currentTimeMillis();
		list1.find(2000000);
		time2 = System.currentTimeMillis();
		System.out.println("Listengroesse 1000000 = " + (time2-time1) + " ms");
		
		

		

		System.out.println("\nArrayList");
		ArrayList<Integer> listArray = new ArrayList<Integer>();
		for(int i = 0; i < 100 ;i++){
			listArray.add(i);
		}
		time1 = System.currentTimeMillis();
		listArray.contains(2000000);
		time2 = System.currentTimeMillis();
		System.out.println("Listengroesse 100 = " + (time2-time1) + " ms");
		

		listArray = new ArrayList<Integer>();
		for(int i = 0; i < 10000 ;i++){
			listArray.add(i);
		}
		time1 = System.currentTimeMillis();
		listArray.contains(2000000);
		time2 = System.currentTimeMillis();
		System.out.println("Listengroesse 10000 = " + (time2-time1) + " ms");
		

		listArray = new ArrayList<Integer>();
		for(int i = 0; i < 1000000 ;i++){
			listArray.add(i);
		}
		time1 = System.currentTimeMillis();
		listArray.contains(2000000);
		time2 = System.currentTimeMillis();
		System.out.println("Listengroesse 1000000 = " + (time2-time1) + " ms");
    }

}
