package ventanas;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio08 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblEscribe;
	private JTextField textPelicula;
	private JButton btnAñadir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio08 frame = new Ejercicio08();
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
	public Ejercicio08() {
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][][grow]", "[][][][][][]"));
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Apache", "Avatar", 
				"Piratas del Caribe", "Cluedo"}));
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		contentPane.add(lblPeliculas, "cell 5 0,alignx center");
		contentPane.add(comboBox, "cell 5 1,growx");
		
		lblEscribe = new JLabel("Escribe titulo de pelicula");
		contentPane.add(lblEscribe, "cell 0 2");
		
		textPelicula = new JTextField();
		contentPane.add(textPelicula, "cell 0 3,growx");
		textPelicula.setColumns(10);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadir();
			}
		});
		contentPane.add(btnAñadir, "cell 0 5,alignx center");
	}

	protected void añadir() {
			comboBox.addItem(textPelicula.getText());
			textPelicula.setText("");
	}
}
