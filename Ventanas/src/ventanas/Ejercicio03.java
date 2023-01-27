package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Ejercicio03 extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField textClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio03 frame = new Ejercicio03();
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
	public Ejercicio03() {
		setTitle("Iniciar Sesión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		contentPane.add(lblUsuario, "cell 2 1");
		
		textUsuario = new JTextField();
		contentPane.add(textUsuario, "cell 4 1,growx");
		textUsuario.setColumns(10);
		
		JLabel lblClave = new JLabel("Contraseña");
		contentPane.add(lblClave, "cell 2 3");
		
		textClave = new JPasswordField();
		contentPane.add(textClave, "cell 4 3,growx");
		textClave.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();	
			}
		});
		contentPane.add(btnAceptar, "cell 4 5");
	}
	
	protected void login() {
		String user = textUsuario.getText();
		String password = new String(textClave.getPassword());
		if (user==null || user.isBlank() ||
			password==null || password.isBlank()) {
				JOptionPane.showMessageDialog(null, "Debe rellenar los dos campos.", 
											"Error", JOptionPane.WARNING_MESSAGE);
				return;
		}		
	}
}
