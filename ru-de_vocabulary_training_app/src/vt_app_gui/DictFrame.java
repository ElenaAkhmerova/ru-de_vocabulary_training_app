package vt_app_gui;

import javax.swing.*;
import java.awt.*;

public class DictFrame extends JFrame {
	
	//private Dictionary dictionary;
	private JPanel panel;

	public DictFrame() {
		super();
		//this.dictionary = dictionary;
		setTitle("Wortschatz Training - Тренировка словарного запаса");
		getContentPane().setBackground(Color.getHSBColor(50, 57, 99));
		setSize(900, 700);
		this.setLocation(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
	}
	
	private void init() {
		panel = new JPanel();
		panel.setBackground(Color.getHSBColor(50, 57, 99));
		panel.setLayout(new BorderLayout());//check out other layouts
		
		JLabel header = new JLabel("Wortschatz Training - Тренировка словарного запаса");
		panel.add(header, BorderLayout.NORTH);
		JButton deversion = new JButton("DE --> RU");
		panel.add(deversion, BorderLayout.WEST);
		JButton ruversion = new JButton("RU --> DE");
		panel.add(ruversion, BorderLayout.EAST);
		
		this.setContentPane(panel);
	}
}