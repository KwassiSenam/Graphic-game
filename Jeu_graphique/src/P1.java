import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class P1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane1;
	private JTextField txtSaisie;
	private JButton btnValider;
	
	String [] listContent = {"p2", "VilleGraphe"};
	String [] listContentStat = {"p2", "statistiques"};
	String [] listContentRess = {"p2", "ressourcesGraph"};
	public JFrame conteneurFrames = new JFrame();
	
	/*Création des cartes
	JFrame p2 = new JFrame();
    JFrame VilleGraphe = new JFrame();
	
    conteneurFrames.setPreferredSize(new Dimension(200, 200));
	//conteneurFrames.setPreferredSize(new Dimension(200,100));
    //Ajout des différents panels au conteneur
	//conteneurFrames.setLayout(contentPane1);
	
	//conteneurFrames.add(p2 , listContent[0]);
	//conteneurFrames.add(VilleGraphe, listContent[1]);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P1 frame = new P1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P1() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 473);
		contentPane1 = new JPanel();
		contentPane1.setBackground(Color.WHITE);
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JTextPane txtpnNomPlanete = new JTextPane();
		txtpnNomPlanete.setForeground(Color.WHITE);
		txtpnNomPlanete.setBackground(new Color(0,0,0,0));
		txtpnNomPlanete.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtpnNomPlanete.setText("Veuillez entrer le nom de la Planete");
		txtpnNomPlanete.setBounds(166, 138, 414, 32);
		contentPane1.add(txtpnNomPlanete);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(260, 244, 135, 23);
		contentPane1.add(btnValider);
		
		txtSaisie = new JTextField();
		txtSaisie.setBounds(260, 197, 135, 23);
		contentPane1.add(txtSaisie);
		txtSaisie.setColumns(10);
		
		
		/*public JTextField getTxtSaisie() {
			return txtSaisie;
		}
		

		public void setTxtSaisie(JTextField txtSaisie) {
			this.txtSaisie = txtSaisie;
		}
		*/
	
			btnValider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				 /*if( event.getSource() == btnValider)
			        {
					 */
			         String nomPlanete =txtSaisie.getText();
			         Planete maPlanete= new Planete(nomPlanete);
					 p2_Menu second =new p2_Menu(maPlanete); //passage à la fenetre suivante
					 second.setVisible(true);
					 dispose();
			       // }
			}
			});
	
		JLabel image1 = new JLabel("New label");
		image1.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\p.jpg"));
		image1.setBounds(0, 0, 705, 436);
		contentPane1.add(image1);
	}

	
}