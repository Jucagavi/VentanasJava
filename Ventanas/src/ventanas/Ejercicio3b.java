package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

public class Ejercicio3b extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota1;
	private JLabel lblRes;
	private JLabel lblAprobado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3b frame = new Ejercicio3b();
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
	public Ejercicio3b() {
		setTitle("CALCULO DE PROMEDIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][99.00,grow][][grow][][grow]", "[32.00][][][][][][][]"));
		
		JLabel lblCalcularPromedio = new JLabel("CALCULAR PROMEDIO");
		lblCalcularPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcularPromedio.setForeground(Color.WHITE);
		lblCalcularPromedio.setOpaque(true);
		lblCalcularPromedio.setBackground(new Color(0, 0, 0));
		contentPane.add(lblCalcularPromedio, "cell 1 0 6 1,grow");
		
		JLabel lblNombre = new JLabel("Nombre:");
		contentPane.add(lblNombre, "cell 1 1,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 2 1 5 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota1:");
		lblNota1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNota1, "cell 1 2,alignx right");
		
		txtNota1 = new JTextField("");
		contentPane.add(txtNota1, "flowx,cell 2 2,growx");
		
		JLabel lblNota2 = new JLabel("Nota2:");
		contentPane.add(lblNota2, "cell 3 2,alignx trailing");
		
		txtNota2 = new JTextField();
		contentPane.add(txtNota2, "cell 4 2,growx");
		txtNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota3:");
		contentPane.add(lblNota3, "cell 5 2,alignx trailing");
		
		txtNota3 = new JTextField();
		contentPane.add(txtNota3, "cell 6 2,growx");
		txtNota3.setColumns(10);
			
		JLabel lblPromedio = new JLabel("Promedio:");
		contentPane.add(lblPromedio, "cell 1 6");
		
		lblRes = new JLabel("");
		contentPane.add(lblRes, "cell 2 6 5 1");
		
		JLabel lblResultado = new JLabel("Resultado:");
		contentPane.add(lblResultado, "cell 1 7");
		
		JButton btnCalcular = new JButton("Calcular");
		contentPane.add(btnCalcular, "flowx,cell 0 4 7 1,alignx right");
		
		lblAprobado = new JLabel("");
		contentPane.add(lblAprobado, "cell 2 7 5 1");
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
	}

	protected void calcular() {
		double suma=Double.parseDouble(txtNota1.getText())
				+Double.parseDouble(txtNota2.getText())
				+Double.parseDouble(txtNota3.getText());
			lblRes.setText(String.format("%.2f",suma/3));
		if (suma/3>=5) {
			lblAprobado.setForeground(Color.black);
			lblAprobado.setText("Has aprobado la asignatura");
		} else {
			lblAprobado.setForeground(Color.red);
			lblAprobado.setText("Toca recuperar.");
		}
	}
}
