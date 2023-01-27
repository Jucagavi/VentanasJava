package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio05 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio05 frame = new Ejercicio05();
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
	public Ejercicio05() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][]"));
		
		JLabel lblHobbies = new JLabel("Hoobies:");
		contentPane.add(lblHobbies, "cell 1 1");
		
		JLabel lblSeleccionado = new JLabel("Has seleccionado:");
		contentPane.add(lblSeleccionado, "cell 4 1");
		
		JCheckBox chckbxDeportes = new JCheckBox("Deportes");
		contentPane.add(chckbxDeportes, "cell 2 2");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 4 2 1 4,grow");
		
		JCheckBox chckbxTecnologia = new JCheckBox("Tecnología");
		contentPane.add(chckbxTecnologia, "cell 2 3");
		
		JCheckBox chckbxJuegos = new JCheckBox("Juegos");
		contentPane.add(chckbxJuegos, "cell 2 4");
		
		JCheckBox chckbxCocina = new JCheckBox("Cocina");
		contentPane.add(chckbxCocina, "cell 2 5");
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				if (chckbxDeportes.isSelected()) {
					textArea.setText("Deportes"+"\n");
				}
				if (chckbxTecnologia.isSelected()) {
					textArea.setText(textArea.getText()+"Tecnología"+"\n");
				}
				if (chckbxJuegos.isSelected()) {
					textArea.setText(textArea.getText()+"Juegos"+"\n");
				}
				if (chckbxCocina.isSelected()) {
					textArea.setText(textArea.getText()+"Cocina");
				}
			}
		});
		contentPane.add(btnComprobar, "cell 4 7");	
	}
}
