package Interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Clase.SectiePolitie;
import Operatii.Operatii;

public class AddAgent extends JFrame {

	private JTextField jtextFieldID;
	private JTextField jtextFieldNume;
	private JTextField jtextFieldPrenume;
	private JTextField jtextFieldAdresa;
	private JTextField jtextFieldPregatireProfesionala;
	private JTextField jtextFieldConduitaMorala;
	private JTextField jtextFieldNrCazuriRezolvate;
	private JTextField jtextFieldFunctie;
	
	private JLabel jlabelID;
	private JLabel jlabelNume;
	private JLabel jlabelPrenume;
	private JLabel jlabelAdresa;
	private JLabel jlabelPregatireProfesionala;
	private JLabel jlabelConduitaMorala;
	private JLabel jlabelNrCazuriRezolvate;
	private JLabel jlabelFunctie;
	private JLabel jlabelNumeSectieAg;
	
	private JComboBox jComboBoxSectie;
	
	private JPanel contentPanel;
	
	public AddAgent()
	{
		setBounds(100, 130, 800, 650);
		setTitle("Adauga Agent");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		contentPanel = new JPanel();
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		jlabelID = new JLabel("ID:");
		jlabelID.setBounds(10, 10, 130, 23);
		contentPanel.add(jlabelID);
		
		jtextFieldID = new JTextField();
		jtextFieldID.setBounds(150, 10, 130, 23);
		contentPanel.add(jtextFieldID);
		
		jlabelNume = new JLabel("Nume:");
		jlabelNume.setBounds(10, 40, 130, 23);
		contentPanel.add(jlabelNume);
		
		jtextFieldNume = new JTextField();
		jtextFieldNume.setBounds(150, 40, 130, 23);
		contentPanel.add(jtextFieldNume);
		
		jlabelPrenume = new JLabel("Prenume:");
		jlabelPrenume.setBounds(10, 70, 130, 23);
		contentPanel.add(jlabelPrenume);
		
		jtextFieldPrenume = new JTextField();
		jtextFieldPrenume.setBounds(150, 70, 130, 23);
		contentPanel.add(jtextFieldPrenume);
		
		jlabelAdresa = new JLabel("Adresa:");
		jlabelAdresa.setBounds(10, 100, 130, 23);
		contentPanel.add(jlabelAdresa);
		
		jtextFieldAdresa = new JTextField();
		jtextFieldAdresa.setBounds(150, 100, 130, 23);
		contentPanel.add(jtextFieldAdresa);
		
		jlabelPregatireProfesionala = new JLabel("Pregatire Profesionala:");
		jlabelPregatireProfesionala.setBounds(10, 130, 130, 23);
		contentPanel.add(jlabelPregatireProfesionala);
		
		jtextFieldPregatireProfesionala = new JTextField();
		jtextFieldPregatireProfesionala.setBounds(150, 130, 130, 23);
		contentPanel.add(jtextFieldPregatireProfesionala);
		
		jlabelConduitaMorala = new JLabel("Conduita Morala:");
		jlabelConduitaMorala.setBounds(10, 160, 130, 23);
		contentPanel.add(jlabelConduitaMorala);
		
		jtextFieldConduitaMorala = new JTextField();
		jtextFieldConduitaMorala.setBounds(150, 160, 130, 23);
		contentPanel.add(jtextFieldConduitaMorala);

		jlabelNrCazuriRezolvate = new JLabel("Numar cazuri:");
		jlabelNrCazuriRezolvate.setBounds(10, 190, 130, 23);
		contentPanel.add(jlabelNrCazuriRezolvate);
		
		jtextFieldNrCazuriRezolvate = new JTextField();
		jtextFieldNrCazuriRezolvate.setBounds(150, 190, 130, 23);
		contentPanel.add(jtextFieldNrCazuriRezolvate);
		
		jlabelFunctie = new JLabel("Functie:");
		jlabelFunctie.setBounds(10, 220, 130, 23);
		contentPanel.add(jlabelFunctie);
		
		jtextFieldFunctie = new JTextField();
		jtextFieldFunctie.setBounds(150, 220, 130, 23);
		contentPanel.add(jtextFieldFunctie);
		
		jComboBoxSectie = new JComboBox();
		jComboBoxSectie.setBounds(150, 250, 130, 23);
		contentPanel.add(jComboBoxSectie);
		
		jlabelNumeSectieAg = new JLabel("Sectie:");
		jlabelNumeSectieAg.setBounds(10, 250, 130, 23);
		contentPanel.add(jlabelNumeSectieAg);
		
		ArrayList<SectiePolitie> model = Operatii.GetAllSectii();
		for(SectiePolitie sectie : model){
			jComboBoxSectie.addItem(sectie.getNumeSectie());
		}
		
		JButton addButton = new JButton("Adauga");
		addButton.setBounds(100, 280, 70, 23);
		contentPanel.add(addButton);
		
		JButton cancelButton = new JButton("Iesire");
		cancelButton.setBounds(200, 280, 70, 23);
		contentPanel.add(cancelButton);
		
		addButton.addActionListener(new AddButton());
		cancelButton.addActionListener(new CancelButton());
	
	}
	class AddButton implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			Operatii adaugareAgent = new Operatii();
			adaugareAgent.AdaugaAgent(jtextFieldID.getText(), jtextFieldNume.getText(), jtextFieldPrenume.getText(), jtextFieldAdresa.getText(),  jtextFieldPregatireProfesionala.getText(), jtextFieldConduitaMorala.getText(), Integer.parseInt(jtextFieldNrCazuriRezolvate.getText()), jtextFieldFunctie.getText(), String.valueOf(jComboBoxSectie.getSelectedItem()));
			dispose();
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
