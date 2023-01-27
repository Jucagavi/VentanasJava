package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class EjercicioTabla1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioTabla1 frame = new EjercicioTabla1();
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
	public EjercicioTabla1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][][][174.00]", "[grow][][][][][grow][][grow][]"));
		
		tabla = new JTable();
		tabla.setToolTipText("");
		contentPane.add(tabla, "cell 0 0 4 9,grow");
		
		JLabel lblNombre = new JLabel("Nombre");
		contentPane.add(lblNombre, "cell 5 1,alignx trailing");
		
		textNombre = new JTextField();
		contentPane.add(textNombre, "cell 6 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		contentPane.add(lblTelefono, "cell 5 2,alignx trailing");
		
		textTelefono = new JTextField();
		contentPane.add(textTelefono, "cell 6 2,growx");
		textTelefono.setColumns(10);
		
		JButton btnAñadir = new JButton("Añadir");
		contentPane.add(btnAñadir, "cell 6 4,alignx center");
		
		JButton btnEliminar = new JButton("Eliminar");
		contentPane.add(btnEliminar, "cell 6 6,alignx center");
		
		JButton btnSalir = new JButton("Salir");
		contentPane.add(btnSalir, "cell 6 8,alignx center");
	}

}
