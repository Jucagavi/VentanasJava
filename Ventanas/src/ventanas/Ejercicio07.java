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

public class Ejercicio07 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblSeleccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio07 frame = new Ejercicio07();
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
	public Ejercicio07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][]"));
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		contentPane.add(lblCiudad, "cell 4 1,alignx trailing");
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eleccion();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "Cabra", "Montilla", "Montalbán", "Montemayor"}));
		contentPane.add(comboBox, "cell 5 1,growx");
		
		JLabel lblSeleccionado = new JLabel("Has seleccionado:");
		contentPane.add(lblSeleccionado, "cell 4 5");
		
		lblSeleccion = new JLabel("");
		contentPane.add(lblSeleccion, "cell 5 5");
	}

	protected void eleccion() {
		String seleccionado = (String) comboBox.getSelectedItem();
		lblSeleccion.setText(seleccionado);	
	}

}
