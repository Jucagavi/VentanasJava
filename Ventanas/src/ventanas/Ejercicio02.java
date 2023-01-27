package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ejercicio02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio02 frame = new Ejercicio02();
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
	public Ejercicio02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][]"));
		
		JLabel lblBoton1 = new JLabel("Boton 1:");
		contentPane.add(lblBoton1, "cell 2 1");
		
		JLabel lblRes1 = new JLabel("");
		contentPane.add(lblRes1, "cell 3 1");
		
		JLabel lblBoton2 = new JLabel("Boton 2:");
		contentPane.add(lblBoton2, "cell 7 1");
		
		JLabel lblRes2 = new JLabel("");
		lblRes2.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblRes2, "cell 8 1");
		
		JButton btnBoton1 = new JButton("Boton 1");
		contentPane.add(btnBoton1, "cell 2 3");
		contentPane.add(btnBoton1, "cell 9 1");
		btnBoton1.addActionListener(new ActionListener() {
			int veces=0;
			public void actionPerformed(ActionEvent e) {
				veces++;
				lblRes1.setText(veces+" veces.");
			}
		});
		
		
		JButton btnBoton2 = new JButton("Boton 2");
		contentPane.add(btnBoton2, "cell 7 3");
		contentPane.add(btnBoton2, "cell 10 1");
		btnBoton2.addActionListener(new ActionListener() {
			int veces=0;
			public void actionPerformed(ActionEvent e) {
				veces++;
				lblRes2.setText(veces+" veces.");
			}
		});
		
	}

}
