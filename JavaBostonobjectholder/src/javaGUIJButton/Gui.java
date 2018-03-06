package javaGUIJButton;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Gui extends JFrame {
	private JButton reg;
	private JButton custom;
	
	public Gui () {
		super("this is a beginner JFrame app");
		setLayout(new FlowLayout());
		
		
		reg = new JButton("press me");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("pic1.png"));
		Icon x = new ImageIcon(getClass().getResource("pic2.png"));
		custom = new JButton("CustomButton",x);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	private class HandlerClass implements ActionListener {
		public void ActionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	

}
