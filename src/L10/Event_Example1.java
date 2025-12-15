package L10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Event_Example1 implements ActionListener
{
    //Składowe klasy____________________
    private JButton przycisk1;
    private JButton przycisk2;
    private int ile1, ile2;
    //__________________________________
    public static void main(String[] args)
    {
        Event_Example1 apGUI = new Event_Example1();
        apGUI.doRysuj();
    }

    // Tworzenie prostego   GUI________________________________________________
    public void doRysuj()
    {
        JFrame ramka = new JFrame();
        przycisk1 = new JButton("Kliknij mnie");
        przycisk2 = new JButton("Kliknij mnie");
        przycisk1.addActionListener(this);
        przycisk2.addActionListener(this);
        JPanel panel = new JPanel();
        ramka.getContentPane().add(panel);
        panel.add(przycisk1);
        panel.add(przycisk2);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.pack();
        ramka.setSize(500,300);
        ramka.setVisible(true);}

    //__________________________________________________________
    /* Obiekt zainteresowany źródłem zdarzeń (działaniem
    przycisków) jest obiektem klasy
    Event_example1 (czyli obiekt bieżący - wskazywany przez
    this)
    On rejestruje się jako 'nasłuchiwacz' zdarzeń generowanych
    przez przyciski.
    Oznacza to, że jego klasa musi implementować interfejs
    ActionListener, a więc również
    przesłonić metodę: actionPerformed, która jest reakcją na
    zdarzenie.
    Dodatkowo, obiekt zdarzenia przekazywany do metody
    actionPerformed identyfikuje źródło zdarzenia.
    */
    public void actionPerformed(ActionEvent zdarzenie)
    {
        if (zdarzenie.getSource() == przycisk1)
        {
            ile1++;
            przycisk1.setText("Zostałem klinięty razy " +
                    ile1);
        }
        if (zdarzenie.getSource() == przycisk2)
        {
            ile2++;
            przycisk2.setText("Zostałem klinięty razy " +
                    ile2);
        }
    }
}