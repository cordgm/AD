package a11;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * 
 * Die Klasse um die Benutzeroberfaeche zu regeln.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gui {

    //Attribute
    private JFrame frame;
    private ContentArea conArea;
    private ChooseArea choArea;
    
    //Kontruktor
    public Gui(Hash<Weblog> logs){
        this.frame = new JFrame("IP-Listing");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(700, 500);
        this.frame.setResizable(false);
        this.frame.setLocationRelativeTo(null);
        this.frame.setLayout(new BorderLayout());
        
        this.conArea = new ContentArea();
        this.choArea = new ChooseArea(this.conArea, logs);
        
        this.frame.add(BorderLayout.CENTER, conArea);
        this.frame.add(new JScrollPane(this.conArea));
        this.frame.add(BorderLayout.WEST, choArea);
        
        this.frame.setVisible(true);
    }
    
    
    //Inner-Classes
    private class ContentArea extends JTextArea{
            
        //Attribute
        private static final long serialVersionUID = 1L;
        
        //Konstruktor
        public ContentArea(){
            this.setEditable(false);
            this.setEnabled(false);
            this.setDisabledTextColor(Color.black);
            this.setBackground(SystemColor.window);
            this.setFont(new Font("", Font.PLAIN, 14));
        }
        
        //Methoden
        public void setContent(Weblog wl){
            this.setText(wl.getContent());
        }
    }
            
    

    @SuppressWarnings("serial")
    private class ChooseArea extends JPanel {
            
        //Attribute
        private ContentArea ca;
        private JList<String> ipList;
        private DefaultListModel<String> dlm;
        private String[] ips;
        private Hash<Weblog> logs;
        
        //Konstruktor
        public ChooseArea(ContentArea ca, Hash<Weblog> logs){
            this.setLayout(new BorderLayout());
            
            this.ca = ca;
            this.logs = logs;
            this.dlm = new DefaultListModel<String>();
            this.ipList = new JList<String>(this.dlm);
            this.ipList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.ipList.addListSelectionListener(new ListSL());
            
            this.add(BorderLayout.CENTER, ipList);
            this.add(new JScrollPane(this.ipList));
            
            initIps();
        }
        
        //Methoden
        private void initIps(){
            this.ips = new String[logs.size()];
            
            List<Weblog> tmp = logs.getObjectList();
            for(int i = 0; i < logs.size(); i++){
                this.ips[i] = tmp.get(i).getKey();
            }
            
            for(int i = 0; i < this.ips.length; i++){
                this.dlm.addElement(this.ips[i]);
            }
        }
        
        //Innere-Klasse
        private class ListSL implements ListSelectionListener {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (ipList.getSelectedIndex() != -1) {
                    int index = ipList.getSelectedIndex();
                    
                    ca.setContent(logs.getObjectList().get(index));
                }
            }
        }
    }
}
