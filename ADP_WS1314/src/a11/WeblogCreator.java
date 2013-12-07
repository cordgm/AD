package a11;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Klasse um die Weblogs anzulegen, und mit Inhalt zu füllen.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WeblogCreator {
        
        //Attributes
        private String path;
        private MyHash<Weblog> logs;
        
        
        //Constructors
        public WeblogCreator(String path){
                this.path = path;
                this.logs = new MyHash<Weblog>();
                
                createLogs();
        }
        
        
        //Methods
        @SuppressWarnings("unchecked")
        public void readLogs(){
                try {
                        ObjectInputStream oip = new ObjectInputStream(new FileInputStream(path));
                        this.logs = (MyHash<Weblog>)oip.readObject();
                        oip.close();
                } catch (IOException e) {
                        System.err.println("Unable to read Logs!");
                        e.printStackTrace();
                } catch (ClassNotFoundException e) {
                        System.err.println("Unable to read Logs!");
                }
        }
        
        private void addWeblog(String key, String info){
                Weblog tmp = new Weblog(key, info);
                if(logs.containsKey(tmp.hashCode())){
                        logs.get(tmp.hashCode()).addWebinfo(new Webinfo(info));
                }else{
                        this.logs.add(tmp.hashCode(), tmp);
                }
        }

        public void writeLogs(){
                try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                        oos.writeObject(this.logs);
                        oos.flush();
                        oos.close();
                } catch (FileNotFoundException e) {
                        System.err.println("File not found!");
                } catch (IOException e) {
                        System.err.println("Unable to write Logs!");
                }
//                this.logs = null;
                
        }
        
        private void createLogs(){
                addWeblog("209.131.40.83", " Sie liegt im östlichen Teil des Tarimbeckens im Uigurischen Autonomen \n" +
                		                       "Gebiet Xinjiang und ist etwa 47.000 Quadratkilometer groß. Sie ist im \n" +
                		                       "Westen als Sandwüste, im Osten als Salzwüste geprägt. Der Boden erhitzt \n" +
                		                       "sich im Sommer auf bis zu 80 Grad Celsius. Die Wüste war entlang der Fluss-\n" +
                		                       "läufe zum See Lop Nor seit etwa 2000 v. Chr. besiedelt.");
                addWeblog("141.22.10.56", "Aus dieser Zeit sind bis heute große Totenstädte erhalten geblieben. Durch die \n" +
                		               "Wüste Lop Nor führte eine Route der Seidenstraße, sodass Marco Polo sie in seinen \n" +
                		               "Reiseberichten erwähnte. Ihr genauer Verlauf innerhalb dieser Wüste ist jedoch \n" +
                		               "noch ungeklärt.");
                addWeblog("141.22.10.56", "Außerdem wurden Ruinen von Signaltürmen der Chinesischen Mauer gefunden, deren Ende \n" +
                		               "chinesische Wissenschaftler bis vor wenigen Jahren rund 500 Kilometer weiter östlich \n" +
                		               "vermuteten. Wirtschaftliche Bedeutung hat die Wüste heute für die Produktion von Pottasche. ");
                addWeblog("64.242.88.50", "Die Mitglieder kommen aus allen Bereichen der Wirtschaft. Durch ihren gemeinsamen Einsatz \n" +
                		               "wollen sie die Akzeptanz für unternehmerisches Handeln in Deutschland erhöhen. Die Wirtschafts-\n" +
                		               "junioren wollen die Wirtschafts- und Gesellschaftspolitik der Bundesrepublik Deutschland im \n" +
                		               "vereinten Europa aktiv mitgestalten, um damit die Wettbewerbsfähigkeit Deutschlands langfristig \n" +
                		               "weltweit zu sichern.");
                addWeblog("209.131.40.83", "Die Organisation steht für den demokratischen Rechtsstaat als Voraussetzung für die Markt-\n" +
                		                "wirtschaft mit der Verpflichtung zu sozialer und ökologischer Verantwortung. Die Wirtschafts-\n" +
                		                "junioren setzen sich dafür ein, dass Deutschland auch weiterhin ein zuverlässiges Mitglied der \n" +
                		                "Staatengemeinschaft bleibt.");
                
                addWeblog("311.53.10.23", "ohann Wolfgang von Goethe (* 28. August 1749 in Frankfurt am Main; † 22. März 1832 in Weimar), \n" +
                		                "geadelt 1782, war ein deutscher Dichter. Er forschte und publizierte außerdem auf verschiedenen \n" +
                		                "naturwissenschaftlichen Gebieten. Ab 1776 bekleidete er am Hof von Weimar unterschiedliche politische \n" +
                		                "und administrative Ämter.");
                addWeblog("11.523.140.21", "Goethes literarische Produktion umfasst Gedichte, Dramen, erzählende Werke (in Vers und \n" +
                		                "Prosa), autobiografische, ästhetische, kunst- und literaturtheoretische sowie natur-\n" +
                		                "wissenschaftliche Schriften. Auch sein umfangreicher Briefwechsel ist von großer \n" +
                		                "literarischer Bedeutung. Goethe war ein Vorreiter und der wichtigste Vertreter des \n" +
                		                "Sturm und Drang.");
                addWeblog("201.44.17.213", "Sein Roman Die Leiden des jungen Werthers machte ihn 1774 in ganz Europa berühmt. Später \n" +
                		                "wandte er sich inhaltlich und formal den Idealen der Antike zu und wurde ab den 1790er \n" +
                		                "Jahren, gemeinsam mit Friedrich Schiller und im Austausch mit diesem, zum wichtigsten \n" +
                		                "Vertreter der Weimarer Klassik. Im Alter galt Goethe auch im Ausland als Repräsentant des \n" +
                		                "geistigen Deutschland.");
                addWeblog("71.22.11.253", "Während die Wertschätzung Goethes nach seinem Tode zunächst abnahm, wurde er im Deutschen \n" +
                		                "Kaiserreich ab 1871 „zum Kronzeugen der nationalen Identität der Deutschen“[2] und \n" +
                		                "als solcher für den deutschen Nationalismus vereinnahmt.");
                addWeblog("31.233.11.77", "Es setzte nun eine Verehrung nicht nur des Werks, sondern auch der Persönlichkeit des Dichters \n" +
                		                "ein, dessen Lebensführung als vorbildlich empfunden wurde. Bis heute gilt Goethe als bedeutend-\n" +
                		                "ster deutscher Dichter, sein Werk wird zu den Höhepunkten der Weltliteratur gezählt.");
                addWeblog("31.66.143.22", "ohann Wolfgang von Goethe wurde am 28. August 1749 im heutigen Goethe-Haus am Frankfurter Großen \n" +
                		                "Hirschgraben geboren. Der Vater Johann Caspar Goethe (1710–1782) war Jurist, übte diesen Beruf \n" +
                		                "jedoch nicht aus, sondern lebte von den Erträgen seines Vermögens, das später auch dem Sohn ein \n" +
                		                "Leben ohne finanzielle Zwänge ermöglichen sollte.");
                addWeblog("87.51.67.302", "Er war vielseitig interessiert und gebildet, jedoch auch streng und pedantisch, was wiederholt zu \n" +
                		                "Konflikten in der Familie führte.");
                addWeblog("112.42.73.41", "Auf Weisung des Vaters begann Goethe im Herbst 1765 ein Jurastudium in Leipzig. Im Gegensatz zum alt-\n" +
                		                "fränkischen Frankfurt war Leipzig eine mondäne, weltoffene Stadt. Goethe begann sich eleganter zu \n" +
                		                "kleiden und seinen Lebensstil dem einer Metropole anzupassen.");
                addWeblog("129.77.11.52", "Das Pflichtstudium begann er schon bald zu vernachlässigen. Er gab dem Besuch der Poetikvorlesungen von \n" +
                		                "Christian Fürchtegott Gellert den Vorzug, der jedoch von den poetischen Versuchen seines \n" +
                		                "Schülers wenig hielt.");
                addWeblog("141.21.89.28", "Fern dem Elternhaus genoss der 16- und 17-Jährige größere Freiheiten: Er besuchte Theateraufführungen oder \n" +
                		                "verbrachte die Abende mit Freunden beim Bier, beispielsweise in Auerbachs Keller. In die Leipziger Zeit \n" +
                		                "fiel Goethes erste Verliebtheit. Die Romanze mit der Handwerkertochter Käthchen Schönkopf wurde \n" +
                		                "nach zwei Jahren im gegenseitigen Einvernehmen wieder gelöst.");
                addWeblog("60.91.78.61", "Die Gefühlsaufwallungen dieser Jahre beeinflussten Goethes Schreibstil; hatte er zuvor schon Gedichte im regel-\n" +
                		                "gerechten Stil des Rokoko verfasst, so wurde ihr Tonfall nun freier und stürmischer. Eine Sammlung von 19 \n" +
                		                "Gedichten, abgeschrieben und illustriert von seinem Freund Ernst Wolfgang Behrisch, ergab das Buch Annette.");
        }


        //Getter-Setter
        public MyHash<Weblog> getLogs() {
                return logs;
        }
        
}
