package L10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Event_Example2
{
    private JButton przycisk1;
    private JButton przycisk2;
    private int ile1, ile2;
    public static void main(String[] args)
    {
        Event_Example2 apGUI = new Event_Example2();
        apGUI.doRysuj();
    }
    /* Obsługa zdarzeń za pomocą klas wewnętrznych.
    Każda klasa implementuje interfejs ActionListener,
    czyli przesiania na swój sposób actionPerformed.
    */
    class ReakcjaNaPrzycisk1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ile1++;
            przycisk1.setText("Zostałem klinięty razy " + ile1);
        }
    }
    class ReakcjaNaPrzycisk2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ile2++;
            przycisk2.setText("Zostałem klinięty razy " + ile2);
        }
    }

    // Tworzenie prostego GUI__________________________________________
    public void doRysuj() {
        JFrame ramka = new JFrame();
        przycisk1 = new JButton("Kliknij mnie");
        przycisk2 = new JButton("Kliknij mnie");
/*Teraz już obiektami nasłuchującymi (obserwatorami)
przycisków
są obiekty klas wewnętrznych.
Każdy przycisk rejestruje swojego obserwatora*/
        przycisk1.addActionListener(new ReakcjaNaPrzycisk1());
        przycisk2.addActionListener(new ReakcjaNaPrzycisk2());
        JPanel panel = new JPanel();
        ramka.getContentPane().add(panel);
        panel.add(przycisk1);
        panel.add(przycisk2);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.pack();
        ramka.setSize(500,300);
        ramka.setVisible(true);
    }
//________________________________________________________________
}