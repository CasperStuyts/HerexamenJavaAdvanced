package edu.ap.spring.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.beans.EventHandler;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UI implements InitializingBean {
	//@Autowired
	//EventHandler eventHandler;
	
	private JFrame jFrame;
	private JLabel label1, label2;
	private JTextField searchWord;
	private JPasswordField userPass;
	private JPanel controlPanel;
    private JButton btnAddQuotes;
	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}

	public void setupUI() {
		jFrame = new JFrame("Spring JFrame");
		jFrame.setLayout(new FlowLayout());
		
		controlPanel = new JPanel();	
		controlPanel.setLayout(new GridLayout(3, 2));
		
		label1 = new JLabel("Zoeken op woord : ");
		searchWord = new JTextField(15);
		searchWord.setDragEnabled(true);
		
		btnAddQuotes = new JButton();
		btnAddQuotes.setText("Add all quotes");
		//btnAddQuotes.addActionListener(eventHandler::whenButtonClicked);
		
		jFrame.add(controlPanel);
		controlPanel.add(label1);
		controlPanel.add(searchWord);
		controlPanel.add(btnAddQuotes);
		jFrame.setSize(400, 400);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	}
	    public JFrame getjFrame() {
	        return this.jFrame;
	    }
	    
	    public JTextField getSearchWord() {
	    		return this.searchWord;
	    }
	    
	    public JPasswordField getPassword() {
			return this.userPass;
	    }

	    public JButton getButton() {
	        return btnAddQuotes;
	    
		};
}