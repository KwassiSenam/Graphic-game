import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class p extends JFrame {

	/**
	 * on declare un Jpanel pour contenir notre image
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
					p frame = new p();
					frame.setVisible(true);
					//p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Creation du constructeur du frame
	 * on a les configurations de base
	 */
	public p() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 472);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane titre = new JTextPane();
		titre.setBackground(new Color(0,0,0,0));
		titre.setFont(new Font("Sylfaen", Font.BOLD, 38));
		titre.setForeground(new Color(0, 0, 128));
		titre.setText("Bienvenue dans notre jeu\r\n");
		titre.setBounds(219, 0, 440, 51);
		contentPane.add(titre);
		
		JLabel image = new JLabel("New label");
		image.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\AP4B_projet\\src\\838_planete.jpg"));
		image.setBackground(SystemColor.activeCaption);
		image.setBounds(0, 0, 807, 440);
		contentPane.add(image);
		
		JButton play = new JButton("Play");
		play.setFont(new Font("Tahoma", Font.PLAIN, 12));
		play.setForeground(Color.BLACK);
		play.setBounds(593, 344, 166, 65);
		contentPane.add(play);
		
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				 if( event.getSource() == play)
			        {
					 JFrame first=new P1(); //passage à la fenetre suivante
					 first.setVisible(true);
					 dispose();
			        }
			}
		});
		
	}

}