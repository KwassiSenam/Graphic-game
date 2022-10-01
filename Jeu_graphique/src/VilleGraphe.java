/*import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;

public class VilleGraphe extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane3;
	public String nomDePlanete;
	private Colonie maColo;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VilleGraphe frame = new VilleGraphe(name,moi);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 
	public VilleGraphe(Planete PlaneteHeritee ) {
		
		nomDePlanete=PlaneteHeritee.getNom();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 566);
		contentPane3 = new JPanel();
		contentPane3.setBackground(Color.WHITE);
		contentPane3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane3);
		contentPane3.setLayout(null);
		
		JLabel imageUniteHabitation = new JLabel("New label");
		imageUniteHabitation.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\uniteHabitation_image.png"));
		imageUniteHabitation.setBounds(10, 75, 300, 300);
		contentPane3.add(imageUniteHabitation);
		
		JTextPane txtPnTitre = new JTextPane();
		
		txtPnTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPnTitre.setText("\t\tColonies\r\n\r\nRecrutez des colons et creez votre societe\r\n");
		txtPnTitre.setBounds(364, 117, 356, 92);
		contentPane3.add(txtPnTitre);
		
		JTextPane txtVilleCreer = new JTextPane();
		txtVilleCreer.setForeground(Color.WHITE);
		txtVilleCreer.setBackground(new Color(0,0,0,0));
		txtVilleCreer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtVilleCreer.setBounds(364, 235, 163, 52);
		contentPane3.add(txtVilleCreer);
		txtVilleCreer.setVisible(false);
		
		JButton btnUniteHabitation = new JButton("Cr\u00E9er Unit\u00E9 d'habitation");
		btnUniteHabitation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUniteHabitation.setBounds(35, 419, 252, 52);
		contentPane3.add(btnUniteHabitation);
		
		RandomNameGeneratorImpl generateur = new RandomNameGeneratorImpl();
		String nomDeVille = generateur.createName();
		Colonie maColo = new Colonie(nomDePlanete,nomDeVille);
		 btnUniteHabitation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//PlaneteHeritee.creerColonie(maColo);
				txtVilleCreer.setText(nomDeVille + " : " + maColo.getNbHabitant());
				txtVilleCreer.setVisible(true);
	
			}
		});
		
		JButton btnModiferHbt = new JButton("Augmenter le nombre d'habitants");
		btnModiferHbt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModiferHbt.setBounds(446, 421, 289, 53);
		contentPane3.add(btnModiferHbt);
		btnModiferHbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				maColo.modifierHabitant(10);
				PlaneteHeritee.ModArg(-100);
				txtVilleCreer.setText(nomDeVille + " : " + maColo.getNbHabitant());
	
			}
		});
		
	}
	
	public static void changerFenetre(JFrame frame1, JFrame frame2) {
		frame1.setVisible(false); // cacher la fenêtre actuelle
		frame2.setVisible(true); // revenir sur la fenêtre précedente
	}
}

*/
