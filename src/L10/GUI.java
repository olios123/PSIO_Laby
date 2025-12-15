package L10;

import javax.swing.*;
import java.awt.*;

public class GUI {
	public static void main(String[] args) {
		JButton button1 = new JButton("Click me 1");
		JButton button2 = new JButton("Click me 2");
		JButton button3 = new JButton("Click me 3");
		JButton button4 = new JButton("Click me 4");
		JButton button5 = new JButton("Click me 5");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, panel1);
		frame.getContentPane().add(BorderLayout.WEST, panel2);
		frame.getContentPane().add(BorderLayout.CENTER, panel3);
		frame.getContentPane().add(BorderLayout.EAST, panel4);
		frame.getContentPane().add(BorderLayout.SOUTH, panel5);
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		panel5.add(button5);
		frame.setSize(300, 120);
		frame.pack();
		frame.setResizable(true);
		frame.setVisible(true);

	}
}
