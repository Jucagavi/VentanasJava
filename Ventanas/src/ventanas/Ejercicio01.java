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

public class Ejercicio01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01 frame = new Ejercicio01();
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
	public Ejercicio01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][]", "[][]"));
		
		JLabel lblHaspulsado = new JLabel("Has pulsado:");
		contentPane.add(lblHaspulsado, "cell 2 1");
		
		JLabel lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 3 1");
		
		JButton btnBoton1 = new JButton("Boton1");
		contentPane.add(btnBoton1, "cell 9 1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("Boton 1.");
			}
		});

		JButton btnBoton2 = new JButton("Boton2");
		contentPane.add(btnBoton2, "cell 10 1");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("Boton 2.");
			}
		});
	}
}
