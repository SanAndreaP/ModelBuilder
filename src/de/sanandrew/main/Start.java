package de.sanandrew.main;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Start {
	
	private static JFrame frame;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		frame = new JFrame("llllloooollll");
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		leftPanel.setBackground(Color.BLACK);
		leftPanel.setSize(100, 0);
		rightPanel.setBackground(Color.decode("0x800080"));
		
		mainPanel.add(leftPanel, BorderLayout.LINE_START);
		mainPanel.add(rightPanel, BorderLayout.CENTER);
		
		frame.setContentPane(mainPanel);
		
		frame.setVisible(true);
	}

}
