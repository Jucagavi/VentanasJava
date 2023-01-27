package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ejercicio06 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup grupoColores = new ButtonGroup();
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06 frame = new Ejercicio06();
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
	public Ejercicio06() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][]"));
		
		JLabel lblSelecciona = new JLabel("Selecciona un color");
		lblSelecciona.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSelecciona, "cell 1 0 3 1");
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		grupoColores.add(rdbtnAzul);
		rdbtnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				azul();
			}
		});
		contentPane.add(rdbtnAzul, "cell 1 2");
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, "cell 3 2 1 4,grow");
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		rdbtnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rojo();
			}
		});
		grupoColores.add(rdbtnRojo);
		contentPane.add(rdbtnRojo, "cell 1 3");
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verde();
			}
		});
		grupoColores.add(rdbtnVerde);
		contentPane.add(rdbtnVerde, "cell 1 4");
		
		JRadioButton rdbtnMagenta = new JRadioButton("Magenta");
		rdbtnMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				magenta();
			}
		});
		grupoColores.add(rdbtnMagenta);
		contentPane.add(rdbtnMagenta, "cell 1 5");
	}

	protected void magenta() {
		panel.setBackground(Color.MAGENTA);
	}

	protected void verde() {
		panel.setBackground(Color.GREEN);
	}

	protected void rojo() {
		panel.setBackground(Color.RED);		
	}

	protected void azul() {
		panel.setBackground(Color.BLUE);
	}
}
