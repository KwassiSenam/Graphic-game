import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ressourcesGraph extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ressourcesGraph(Planete planRes) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 516);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnMagasin = new JTextPane();
		txtpnMagasin.setBackground(Color.GRAY);
		txtpnMagasin.setBounds(73, 5, 426, 20);
		txtpnMagasin.setText("\t\tMagasin ");
		contentPane.add(txtpnMagasin);
		
		JButton btnCreerMine = new JButton("Creer Mine");
		btnCreerMine.setBounds(67, 384, 122, 43);
		contentPane.add(btnCreerMine);
		btnCreerMine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					planRes.creerMine();
				
				}
			});
		
		JButton btnCreerPuits = new JButton("Creer un Puits");
		btnCreerPuits.setBounds(399, 384, 129, 43);
		contentPane.add(btnCreerPuits);
		btnCreerPuits.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			planRes.creerForage();
			dispose();
			}
				});
		
		JLabel image = new JLabel("New label");
		image.setIcon(new ImageIcon("C:\\Users\\kwass\\Bureau\\imagemine_2.jpg"));
		image.setBounds(44, 53, 531, 391);
		contentPane.add(image);
	}

}
