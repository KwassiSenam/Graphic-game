
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class statistiques extends JFrame {
	private static final long serialVersionUID = 1L;
	private  JPanel contentPaneS;
	private Ressources mesRes;

	public statistiques(Planete planStat) {
		mesRes=new Ressources(planStat);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneS = new JPanel();
		contentPaneS.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneS);
		contentPaneS.setLayout(null);
		
		JTextPane textPnOxygene = new JTextPane();
		textPnOxygene.setEditable(false);
		textPnOxygene.setBackground(new Color(0,0,0,0));
		textPnOxygene.setFont(new Font("Sylfaen", Font.BOLD, 38));
		textPnOxygene.setForeground(Color.WHITE);
		textPnOxygene.setText("Oxygene : " + mesRes.getM_oxygene() + "%");
		textPnOxygene.setBounds(32, 28, 329, 51);
		contentPaneS.add(textPnOxygene);
		
		JTextPane textPnTemperature = new JTextPane();
		textPnTemperature.setBackground(new Color(0,0,0,0));
		textPnTemperature.setFont(new Font("Sylfaen", Font.BOLD, 38));
		textPnTemperature.setForeground(Color.WHITE);
		textPnTemperature.setText("Temperature : " + mesRes.getM_temperature() + "%");
		textPnTemperature.setBounds(33, 105, 373, 51);
		contentPaneS.add(textPnTemperature);
		
		
		JTextPane textPnEau = new JTextPane();
		textPnEau.setBackground(new Color(0,0,0,0));
		textPnEau.setFont(new Font("Sylfaen", Font.BOLD, 38));
		textPnEau.setForeground(Color.WHITE);
		textPnEau.setText("Eau : " + mesRes.getM_eau() + "%");
		textPnEau.setBounds(32, 183, 335, 57);
		contentPaneS.add(textPnEau);
		
		
		JButton btnQuit = new JButton("X");
		btnQuit.setForeground(Color.RED);
		btnQuit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnQuit.setBounds(371, 11, 65, 38);
		contentPaneS.add(btnQuit);
		 btnQuit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//dispose();
				}
			});
		 
		 
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\p.jpg"));
		lblNewLabel.setBounds(0, 0, 436, 263);
		contentPaneS.add(lblNewLabel);
		
	}
}
