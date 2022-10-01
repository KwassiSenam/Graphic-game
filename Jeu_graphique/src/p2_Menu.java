import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class p2_Menu extends JFrame implements MouseListener {
	private static final long serialVersionUID = 1L;
	
	private String nomPlanete;
	private Ressources mesRes;
	private JPanel contentPaneX_1;
	private JPanel panelStatistiques;
	private JPanel panelRessources;
	private JPanel panelColonie;
	
public p2_Menu(Planete planet) {
	this.nomPlanete=planet.getNom();
	addMouseListener(this);  //Pour ajouter le listener à l'interface
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 769, 499);
	contentPaneX_1 = new JPanel();
	contentPaneX_1.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPaneX_1);
	contentPaneX_1.setLayout(null);
	
	JTextPane planeteTitre = new JTextPane();
	planeteTitre.setEnabled(false);
		planeteTitre.setForeground(Color.WHITE);
		planeteTitre.setBackground(new Color(0,0,0,0));
		planeteTitre.setFont(new Font("Tahoma", Font.BOLD, 28));
		planeteTitre.setText("Planete : " + nomPlanete);
		planeteTitre.setBounds(268, 11, 243, 92);
		contentPaneX_1.add(planeteTitre);
		
		/*******************************************/
		
		panelStatistiques = new JPanel();
		panelStatistiques.setBackground(Color.BLACK);
		panelStatistiques.setBounds(181, 114, 398, 270);
		contentPaneX_1.add(panelStatistiques);
		
		/* Configuration du panel Stat */
		  
		panelStatistiques.setVisible(false);
		  mesRes=new Ressources(planet);
		panelStatistiques.setLayout(null);
		JTextPane textPnOxygene = new JTextPane();
		textPnOxygene.setEditable(false);
		textPnOxygene.setBackground(new Color(0,0,0,0));
		textPnOxygene.setFont(new Font("Sylfaen", Font.BOLD, 38));
		textPnOxygene.setForeground(Color.WHITE);
		textPnOxygene.setText("Oxygene : " + mesRes.getM_oxygene() + "%");
		textPnOxygene.setBounds(53, 5, 291, 56);
		panelStatistiques.add(textPnOxygene);
		
		JTextPane textPnTemperature = new JTextPane();
		textPnTemperature.setBackground(new Color(0,0,0,0));
		textPnTemperature.setFont(new Font("Sylfaen", Font.BOLD, 38));
		textPnTemperature.setForeground(Color.WHITE);
		textPnTemperature.setText("Temperature : " + mesRes.getM_temperature() + "%");
		textPnTemperature.setBounds(32, 60, 339, 56);
		panelStatistiques.add(textPnTemperature);
		
		JTextPane textPnEau = new JTextPane();
		textPnEau.setBackground(new Color(0,0,0,0));
		textPnEau.setFont(new Font("Sylfaen", Font.BOLD, 38));
		textPnEau.setForeground(Color.WHITE);
		textPnEau.setText("Eau : " + mesRes.getM_eau() + "%");
		textPnEau.setBounds(97, 127, 204, 56);
		panelStatistiques.add(textPnEau);
		
		// ajout d'une image 
		  JLabel lblNewLabel = new JLabel("New label");
		  lblNewLabel.setBounds(0, 0, 398, 270);
		  panelStatistiques.add(lblNewLabel);
		  lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\p.jpg"));
		
		JButton btnStat = new JButton("Statistiques\r\n");
		btnStat.setBounds(10, 71, 117, 32);
		contentPaneX_1.add(btnStat);
		btnStat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelStatistiques.setVisible(true);
				panelColonie.setVisible(false);
				panelRessources.setVisible(false);
				
			}
		});
		
		/*********************************************************************/
		
		panelRessources = new JPanel();
		panelRessources.setBounds(181, 114, 398, 270);
		contentPaneX_1.add(panelRessources);
		
		/* Configuration du panel Ressources */
		panelRessources.setVisible(false);
		panelRessources.setLayout(null);
		
		JTextPane txtpnMagasin = new JTextPane();
		txtpnMagasin.setForeground(Color.WHITE);
		txtpnMagasin.setBackground(new Color(0,0,0,0));
		txtpnMagasin.setFont(new Font("Tahoma", Font.BOLD, 27));
		txtpnMagasin.setBounds(0, 0, 398, 77);
		txtpnMagasin.setText("\t\tMagasin ");
		txtpnMagasin.setEnabled(false);
		panelRessources.add(txtpnMagasin);
		
		JButton btnCreerMine = new JButton("Creer Mine");
		btnCreerMine.setBounds(10, 176, 114, 34);
		panelRessources.add(btnCreerMine);
		btnCreerMine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					planet.creerMine();
					contentPaneX_1.updateUI();
//					contentPaneX_1.repaint();
				}
			});
		
		JButton btnCreerPuits = new JButton("Creer un Puits");
		btnCreerPuits.setBounds(246, 176, 142, 34);
		panelRessources.add(btnCreerPuits);
		btnCreerPuits.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			planet.creerForage();
			}
				});
		
		JLabel image = new JLabel("New label");
		image.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\imagemine_2.jpg"));
		image.setBounds(0, 0, 398, 270);
		panelRessources.add(image);
		 
		
		JButton btnRessources = new JButton("Ressources");
		btnRessources.setBounds(15, 121, 112, 32);
		contentPaneX_1.add(btnRessources);
		btnRessources.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ressourcesGraph Res=new ressourcesGraph(planet);
				panelRessources.setVisible(true);
				panelStatistiques.setVisible(false);
				panelColonie.setVisible(false);
			}
		});
		
		/*********************************************************************/
		
		JTextPane txtpnNiveauDhabitabilite = new JTextPane();
		txtpnNiveauDhabitabilite.setEnabled(false);
		txtpnNiveauDhabitabilite.setText("Habitabilite : " + planet.getNiveauHabitabilite());
		txtpnNiveauDhabitabilite.setBounds(610, 241, 141, 51);
		contentPaneX_1.add(txtpnNiveauDhabitabilite);
		
		JTextPane txtpnNiveauDhabitants = new JTextPane();
		txtpnNiveauDhabitants.setEnabled(false);
		txtpnNiveauDhabitants.setText("Nombre d'Habitants : " + planet.totalHabitant());
		txtpnNiveauDhabitants.setBounds(610, 152, 141, 51);
		contentPaneX_1.add(txtpnNiveauDhabitants);
		
		JTextPane txtpnNiveauArgent = new JTextPane();
		txtpnNiveauArgent.setEnabled(false);
		txtpnNiveauArgent.setText("Argent : " + planet.recuperationMoney() ); //
		txtpnNiveauArgent.setBounds(610, 71, 141, 51);
		contentPaneX_1.add(txtpnNiveauArgent);
		
		/********************************************************/
		
		panelColonie = new JPanel();
		panelColonie.setBounds(152, 83, 447, 301);
		contentPaneX_1.add(panelColonie);
		panelColonie.setVisible(false);
		panelColonie.setLayout(null);

		JLabel imageUniteHabitation = new JLabel("New label");
		imageUniteHabitation.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\uniteHabitation_image.png"));
		imageUniteHabitation.setBounds(0, 46, 242, 255);
		imageUniteHabitation.setLayout(null);
		panelColonie.add(imageUniteHabitation);
		
		
		JTextPane txtPnTitre = new JTextPane();
		txtPnTitre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPnTitre.setText("\t\t  Colonies\r\n\tRecrutez des colons et creez votre societe\r\n");
		txtPnTitre.setBounds(29, 0, 388, 35);
		panelColonie.add(txtPnTitre);
		
		JTextPane txtVilleCreer = new JTextPane();
		txtVilleCreer.setForeground(Color.BLACK);
		txtVilleCreer.setBackground(new Color(0,0,0,0));
		txtVilleCreer.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtVilleCreer.setBounds(252, 89, 170, 30);
		panelColonie.setEnabled(false);
		panelColonie.add(txtVilleCreer);
		
		JButton btnUniteHabitation = new JButton("Créer Unite d'habitation");
		btnUniteHabitation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUniteHabitation.setBounds(239, 130, 198, 35);
		panelColonie.add(btnUniteHabitation);
		
		RandomNameGeneratorImpl generateur = new RandomNameGeneratorImpl();
		String nomDeVille = generateur.createName();
		Colonie maColo = new Colonie(nomPlanete,nomDeVille);
		 btnUniteHabitation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//PlaneteHeritee.creerColonie(maColo);
				txtVilleCreer.setText(nomDeVille + " : " + maColo.getNbHabitant());
				txtVilleCreer.setVisible(true);
	
			}
		});
		 
		 JButton btnModiferHbt = new JButton("Augmenter le nombre d'habitants");
		 	btnModiferHbt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		    btnModiferHbt.setBounds(239, 201, 198, 41);
			panelColonie.add(btnModiferHbt);
			btnModiferHbt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					maColo.modifierHabitant(10);
					planet.ModArg(-100);
					txtVilleCreer.setText(nomDeVille + " : " + maColo.getNbHabitant());
		
				}
			});
		
		JButton btnAddColonie = new JButton("Colonie");
		btnAddColonie.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddColonie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelColonie.setVisible(true);
				panelStatistiques.setVisible(false);
				panelRessources.setVisible(false);
			}
		});
		btnAddColonie.setBounds(268, 395, 226, 68);
		contentPaneX_1.add(btnAddColonie);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\p2.jpg"));
		lblNewLabel_1.setBounds(0, 11, 755, 451);
		contentPaneX_1.add(lblNewLabel_1);
		
		
		/*********************************************************************/
		
   }

	public String getNomPlanete() {
		return nomPlanete;
	}

	public void setNomPlanete(String nomPlanete) {
		this.nomPlanete = nomPlanete;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.setVisible(true);
		panelStatistiques.setVisible(false);
		panelRessources.setVisible(false);
		panelColonie.setVisible(false);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	