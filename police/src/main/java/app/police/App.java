package app.police;

import java.awt.EventQueue;
import java.util.logging.*;

import javax.swing.*;

import Interfata.Interfata;

public class App {

	public static void main(String[] args) 
	{
		try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);   
        } catch (InstantiationException ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
        	Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Interfata interfata = new Interfata();
				//new RoundRobinAlgorithm();
			}
		});
	}
}

