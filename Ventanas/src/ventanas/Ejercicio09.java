package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ejercicio09 extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;
	private final ButtonGroup GroupDemoneda = new ButtonGroup();
	private final ButtonGroup GroupAmoneda = new ButtonGroup();
	private JLabel lblResultado;
	private JRadioButton rdbtnEuros;
	private JRadioButton rdbtnDolares;
	private JRadioButton rdbtnYenes;
	private JRadioButton rdbtnAyenes;
	private JRadioButton rdbtnAeuros;
	private JRadioButton rdbtnAdolares;
	private double cambio;
	private JLabel lblRes;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio09 frame = new Ejercicio09();
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
	public Ejercicio09() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][62.00][][]", "[][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Conversión de monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel, "cell 1 1 6 1,alignx center,growy");
		
		JLabel lblNewLabel_1 = new JLabel("De:");
		contentPane.add(lblNewLabel_1, "cell 2 3");
		
		rdbtnDolares = new JRadioButton("Dolares");
		rdbtnDolares.setActionCommand("Dolares");
		GroupDemoneda.add(rdbtnDolares);
		contentPane.add(rdbtnDolares, "cell 3 3");
		
		rdbtnEuros = new JRadioButton("Euros");
		GroupDemoneda.add(rdbtnEuros);
		contentPane.add(rdbtnEuros, "cell 4 3");
		
		rdbtnYenes = new JRadioButton("Yenes");
		GroupDemoneda.add(rdbtnYenes);
		contentPane.add(rdbtnYenes, "cell 6 3");
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		contentPane.add(lblCantidad, "cell 1 5");
		
		textCantidad = new JTextField();
		contentPane.add(textCantidad, "cell 3 5 2 1,growx");
		textCantidad.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		contentPane.add(btnCalcular, "cell 4 6");
		
		JLabel lblAmoneda = new JLabel("A:");
		contentPane.add(lblAmoneda, "cell 2 8");
		
		rdbtnAdolares = new JRadioButton("Dolares");
		rdbtnAdolares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambio=1.20;
			}
		});
		GroupAmoneda.add(rdbtnAdolares);
		contentPane.add(rdbtnAdolares, "cell 3 8");
		
		rdbtnAeuros = new JRadioButton("Euros");
		rdbtnAeuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambio=1.30;
			}
		});
		GroupAmoneda.add(rdbtnAeuros);
		contentPane.add(rdbtnAeuros, "cell 4 8");
		
		rdbtnAyenes = new JRadioButton("Yenes");
		rdbtnAyenes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambio=1.40;
			}
		});
		GroupAmoneda.add(rdbtnAyenes);
		contentPane.add(rdbtnAyenes, "cell 6 8");
		
		lblResultado = new JLabel("Resultado:");
		contentPane.add(lblResultado, "cell 3 10");
		
		lblRes = new JLabel("");
		contentPane.add(lblRes, "cell 4 10");
		
		lblNewLabel_2 = new JLabel("€");
		contentPane.add(lblNewLabel_2, "cell 5 10");
	}

	protected void calcular() {
		
		if (textCantidad.getText()==null || textCantidad.getText().isBlank() ||
			textCantidad.getText()==null || textCantidad.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Debe introducir una cantidad.", 
					"Error", JOptionPane.WARNING_MESSAGE);
				return;
		}
		double cantidad = Double.parseDouble(textCantidad.getText());
		double deMoneda=0;
		double aMoneda=0;
		
		if (!GroupDemoneda.getSelection().getActionCommand().equals(
			GroupAmoneda.getSelection().getActionCommand())) {
			if (GroupDemoneda.getSelection().getActionCommand().equals("Dolares")) {
				deMoneda=1.20;
			} else if (GroupDemoneda.getSelection()==rdbtnAeuros) {
				deMoneda=1.10;
			} else if (GroupDemoneda.getSelection()==rdbtnAyenes) {
				deMoneda=1.30;
			}
			
			if ("rdbtnAdolares".equals(GroupAmoneda.getSelection())) {
				aMoneda=1.20;
			} else if (GroupDemoneda.getSelection().equals("rdbtnAeuros")) {
				aMoneda=1.10;
			} else if (GroupDemoneda.getSelection().equals("rdbtnAyenes")) {
				aMoneda=1.30;
			}
			cantidad=cantidad*cambio;
			lblRes.setText(""+cantidad);
		} else {
			JOptionPane.showMessageDialog(null, "Monedas deben ser distintas.", 
					"Error", JOptionPane.WARNING_MESSAGE);
		}	
	}
}
