package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Ejercicio11 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnAcepto;
	private JRadioButton rdbtnNoacepto;
	private final ButtonGroup Grupo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio11 frame = new Ejercicio11();
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
	public Ejercicio11() {
		setTitle("Panel de Scroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][260.00,grow][]", "[][][][94.00,grow][][][]"));
		
		JLabel lblTitulo = new JLabel("Aceptar las condiciones del servicio");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblTitulo, "cell 1 1");
		
		JLabel lblNewLabel = new JLabel("Acuerdo de licencia");
		contentPane.add(lblNewLabel, "cell 1 2");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 3,grow");
		
		JTextPane txtpnElPresenteContrato = new JTextPane();
		txtpnElPresenteContrato.setText("El presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.\r\nEl presente contrato vincula a las dos partes.");
		scrollPane.setViewportView(txtpnElPresenteContrato);
		
		rdbtnAcepto = new JRadioButton("Aceptar condiciones del servicio");
		Grupo.add(rdbtnAcepto);
		contentPane.add(rdbtnAcepto, "cell 1 4");
		
		rdbtnNoacepto = new JRadioButton("No aceptar");
		Grupo.add(rdbtnNoacepto);
		contentPane.add(rdbtnNoacepto, "cell 1 5");
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				siguiente();
			}
		});
		contentPane.add(btnSiguiente, "cell 1 6,alignx center");
	}

	protected void siguiente() {
		if (rdbtnAcepto.isSelected()){
			JOptionPane.showMessageDialog(null, "Pasa por caja....","Mensaje",1);
		}
		else {
			if (JOptionPane.showConfirmDialog(null, "Estas seguro?","Mensaje",1)==0) {
				JOptionPane.showMessageDialog(null, "La proxima vez será.","Mensaje",1);
			} else {
				JOptionPane.showMessageDialog(null, "Pasa por caja....","Mensaje",1);
			}
	
		}
	}

}
