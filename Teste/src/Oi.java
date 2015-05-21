

import Principal.TelaInicial;
public class Oi {
	import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.EventQueue;
import java.awt.Font;	
import java.awt.Color;	

import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
	        
			public void run() {
				try {
				  
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					TelaInicial frame = new TelaInicial();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

}
