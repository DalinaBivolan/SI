package Interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interfata extends JFrame {
	
	private JPanel contentPanel;
	private JButton addAgent;
	
	public Interfata(){
		setBounds(100, 200, 800, 650);
		setTitle("Inspectorat Polite");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		contentPanel = new JPanel();
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		addAgent = new JButton("Adaugare Agent");
		addAgent.setBounds(335, 10, 180, 30);
		contentPanel.add(addAgent);
		
		addAgent.addActionListener(new addAgent());
		
		JButton cancelButton = new JButton("Iesire");
		cancelButton.setBounds(365, 580, 70, 23);
		contentPanel.add(cancelButton);

		cancelButton.addActionListener(new CancelButton());
	}
	
	class addAgent implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			new AddAgent();
		}
	}
	
	class CancelButton implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			dispose();
		}
	}
}
