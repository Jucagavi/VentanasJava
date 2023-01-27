package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Multiplicar extends JFrame {

	private JPanel contentPane;
	private JTextField txtnumero1;
	private JTextField txtnumero2;
	private JLabel txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Multiplicar frame = new Multiplicar();
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
	public Multiplicar() {
		setTitle("Multiplicar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][]"));
		
		JLabel lblNumero1 = new JLabel("Numero 1:");
		contentPane.add(lblNumero1, "cell 1 1");
		
		txtnumero1 = new JTextField();
		contentPane.add(txtnumero1, "cell 3 1,growx");
		txtnumero1.setColumns(10);
		
		JLabel lblNumero2 = new JLabel("Numero 2:");
		contentPane.add(lblNumero2, "cell 1 3");
		
		txtnumero2 = new JTextField();
		contentPane.add(txtnumero2, "cell 3 3,growx");
		txtnumero2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		contentPane.add(lblResultado, "cell 1 5");
		
		txtresultado = new JLabel();
		contentPane.add(txtresultado, "cell 3 5,growx");
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtnumero1.getText()==null || txtnumero1.getText().isBlank() ||
					txtnumero2.getText()==null || txtnumero2.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Introducir solo numeros.", 
												"Error", JOptionPane.WARNING_MESSAGE);
					return;
				}
				double n1 = Double.parseDouble(txtnumero1.getText());
				double n2 =Double.parseDouble(txtnumero2.getText());
				txtresultado.setText(Double.toString(n1*n2));
			}
		});
		contentPane.add(btnNewButton, "cell 0 8 4 1,alignx center,aligny bottom");
	}

}
