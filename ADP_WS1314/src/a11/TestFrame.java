package a11;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Start- und Testklasse für die Hash-Klasse.
 */

public class TestFrame {

        public static void main(String[] args) {
                
                WeblogCreator wc = new WeblogCreator("./src/a11/logs");
                
                wc.writeLogs();
                
                wc.readLogs();
                
                new Gui(wc.getLogs());
                
                MyHash<Weblog> h = new MyHash<Weblog>(8);
                Weblog w;
                
                w = new Weblog("4", "vier");
                h.add(w.hashCode(), w);
                w = new Weblog("9", "neun");
                h.add(w.hashCode(), w);
                
                //Darf nicht hinzugefügt werden, da sonst doppelt vorhanden
                w = new Weblog("9", "neun");
                h.add(w.hashCode(), w);

//                h.showArray();
                w = new Weblog("8", "acht");
                h.add(w.hashCode(), w);
                w = new Weblog("5", "fuenf");
                h.add(w.hashCode(), w);
                w = new Weblog("2", "zwei");
                h.add(w.hashCode(), w);
                w = new Weblog("1", "eins");
                h.add(w.hashCode(), w);
                w = new Weblog("3", "drei");
                h.add(w.hashCode(), w);
                w = new Weblog("6", "sechs");
                h.add(w.hashCode(), w);
//                h.showArray();
                w = new Weblog("10", "zehn");
                h.add(w.hashCode(), w);
                w = new Weblog("22", "zweiundzwanzig");
                h.add(w.hashCode(), w);
                w = new Weblog("90", "neunzig");
                h.add(w.hashCode(), w);
                w = new Weblog("0", "nullll");
                h.add(w.hashCode(), w);

                h.showArray();
                
                System.out.println("------------");
                
                System.out.println("Muss: 4\t\tIst: " + h.get(4));
                System.out.println("Muss: 9\t\tIst: " + h.get(9));
                System.out.println("Muss: 8\t\tIst: " + h.get(8));
                System.out.println("Muss: 5\t\tIst: " + h.get(5));
                System.out.println("Muss: 2\t\tIst: " + h.get(2));
                System.out.println("Muss: 1\t\tIst: " + h.get(1));
                System.out.println("Muss: 3\t\tIst: " + h.get(3));
                System.out.println("Muss: 6\t\tIst: " + h.get(6));
                System.out.println("Muss: 10\tIst: " + h.get(10));
                System.out.println("Muss: 22\tIst: " + h.get(22));
                System.out.println("Muss: 90\tIst: " + h.get(90));
                System.out.println("Muss: 0\t\tIst: " + h.get(0));
        }
}
