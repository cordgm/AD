package a12.a3_hybrides_Verfahren;


public class Testframe {

    public static void main(String[] args) {

        Hybrides_Verfahren hv = new Hybrides_Verfahren();
        String nachricht = "Es soll ein hybrides Kryptographieverfahren implementiert werden."
                + " Dazu programmieren Sie zunaechst das asymmetrische Verfahren aus der Vorlesung (RSA)"
                + " um den Schluessel zu uebermitteln. Dann folgt ein einfaches symmetrisches Verfahren welches auf einer Block-Chiffre basiert. ";

        String cryptNachricht = hv.encrypt(nachricht);
        System.out.println("_____________________Nachricht_____________________");
        System.out.println(nachricht);
        System.out.println("_____________________Nachricht verschluesselt_____________________");
        System.out.println(cryptNachricht);
        System.out.println("_____________________Nachricht entschluesselt_____________________");
        System.out.println(hv.decrypt(cryptNachricht));
    }

}
