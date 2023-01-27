package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio10 extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;
	private JLabel lblResultado;
	private double cambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 frame = new Ejercicio10();
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
	public Ejercicio10() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow 80][25.00,grow 20][grow][grow 80]", "[][27.00][][][27px][][][]"));
		
		JLabel lblNewLabel = new JLabel("Conversión de monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel, "cell 0 0 4 1,alignx center,growy");
		
		JLabel lblDe = new JLabel("De:");
		contentPane.add(lblDe, "cell 1 2,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dolares", "Euros", "Yenes"}));
		contentPane.add(comboBox, "cell 2 2,growx");
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		contentPane.add(lblCantidad, "cell 1 3,alignx trailing");
		
		textCantidad = new JTextField();
		contentPane.add(textCantidad, "cell 2 3,growx");
		textCantidad.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		contentPane.add(btnCalcular, "cell 2 5,alignx center");
		
		JLabel lblA = new JLabel("A:");
		contentPane.add(lblA, "cell 1 6,alignx trailing");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elegido = (String) comboBox_1.getSelectedItem();
//				System.out.println(elegido);
				if (elegido.equals("Dolares")) {
					cambio=1.20;
				} else if (elegido.equals("Euros")) {
					cambio=1.30;
				} else {
					cambio=1.40;
				}
			}
			
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dolares", "Euros", "Yenes"}));
		comboBox_1.setSelectedIndex(1);
		contentPane.add(comboBox_1, "cell 2 6,growx");
		
		JLabel lblRes = new JLabel("Resultado:");
		contentPane.add(lblRes, "cell 2 7");
		
		lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 3 7");
	}

	protected void calcular() {
		double cantidad;
		if (textCantidad.getText()==null || textCantidad.getText().isBlank() ||
			textCantidad.getText()==null || textCantidad.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Debe introducir una cantidad.", 
					"Error", JOptionPane.WARNING_MESSAGE);
				return;
		}
		cantidad = Double.parseDouble(textCantidad.getText());
		lblResultado.setText(""+cantidad*cambio);
		
	}

}
