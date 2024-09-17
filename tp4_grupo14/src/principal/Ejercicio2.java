package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Ejercicio2 extends JFrame {
	private JTextField txtNota;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField textField;
	private JTextField textField_1;
	
	public Ejercicio2(){

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Promedio ");
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(361, 102, 89, 43);
		panel.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(361, 156, 89, 43);
		panel.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(361, 210, 89, 43);
		panel.add(btnSalir);
		
		JLabel lblNotasDelEstudiante = new JLabel("Notas del estudiante");
		lblNotasDelEstudiante.setVerticalAlignment(SwingConstants.TOP);
		lblNotasDelEstudiante.setForeground(new Color(0, 0, 0));
		lblNotasDelEstudiante.setBackground(new Color(0, 0, 0));
		lblNotasDelEstudiante.setBounds(41, 65, 105, 14);
		panel.add(lblNotasDelEstudiante);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), Color.CYAN, Color.CYAN, Color.CYAN));
		panel_1.setBounds(31, 72, 289, 181);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(42, 35, 32, 14);
		panel_1.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(42, 60, 32, 14);
		panel_1.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setBounds(42, 85, 32, 14);
		panel_1.add(lblNota3);
		
		txtNota = new JTextField();
		txtNota.setBounds(169, 29, 86, 20);
		panel_1.add(txtNota);
		txtNota.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(169, 54, 86, 20);
		panel_1.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(169, 79, 86, 20);
		panel_1.add(txtNota3);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(42, 110, 32, 14);
		panel_1.add(lblTps);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(169, 107, 86, 20);
		panel_1.add(comboBox);
		
		JLabel label = new JLabel("Notas del estudiante");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.BLACK);
		label.setBackground(Color.BLACK);
		label.setBounds(41, 290, 105, 14);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), Color.CYAN, Color.CYAN, Color.CYAN));
		panel_2.setBounds(31, 297, 289, 116);
		panel.add(panel_2);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(42, 35, 55, 14);
		panel_2.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(42, 60, 55, 14);
		panel_2.add(lblCondicion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(169, 29, 86, 20);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 57, 86, 20);
		panel_2.add(textField_1);
		
		
	
	}

public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
}
