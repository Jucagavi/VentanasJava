package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio04 extends JFrame {

	private JPanel contentPane;
	private JButton btnDeshabilita;
	private JButton btnCentral;
	private JButton btnHabilita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio04 frame = new Ejercicio04();
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
	public Ejercicio04() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][]", "[][][][][]"));
		
		btnDeshabilita = new JButton("Deshabilita Central");
		btnDeshabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activa();
			}
		});
		contentPane.add(btnDeshabilita, "cell 2 1 1 4");
		
		btnCentral = new JButton("Central");
		contentPane.add(btnCentral, "cell 4 1 1 4");
		
		btnHabilita = new JButton("Habilita Central");
		btnHabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activa2();
			}
		});
		btnHabilita.setEnabled(false);
		contentPane.add(btnHabilita, "cell 6 1 1 4");
	}

	protected void activa2() {
		btnDeshabilita.setEnabled(true);
		btnCentral.setEnabled(true);
		btnHabilita.setEnabled(false);
		
	}

	protected void activa() {
		btnDeshabilita.setEnabled(false);
		btnCentral.setEnabled(false);
		btnHabilita.setEnabled(true);
	}

}
