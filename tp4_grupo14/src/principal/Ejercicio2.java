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
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Ejercicio2 extends JFrame {
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	float nota1 = 0;
	float nota2 = 0;
	float nota3 = 0;
	
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
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
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
		lblNota1.setBounds(42, 35, 53, 14);
		panel_1.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(42, 60, 53, 14);
		panel_1.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setBounds(42, 85, 53, 14);
		panel_1.add(lblNota3);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(42, 110, 32, 14);
		panel_1.add(lblTps);
		
		JComboBox comboBoxTP = new JComboBox();
		comboBoxTP.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBoxTP.setBounds(169, 107, 86, 20);
		panel_1.add(comboBoxTP);
		
		JFormattedTextField frmtdtxtfldNota1 = new JFormattedTextField();
		frmtdtxtfldNota1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent nt1) {
		        char num = nt1.getKeyChar();
		        if (!Character.isDigit(num) && num != '.') {
		        	nt1.consume();  
		        }
		        
		    }
		});
		frmtdtxtfldNota1.setBounds(169, 32, 86, 20);
		panel_1.add(frmtdtxtfldNota1);
		
		JFormattedTextField frmtdtxtfldNota2 = new JFormattedTextField();
		frmtdtxtfldNota2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent nt2) {
				char num = nt2.getKeyChar();
		        if (!Character.isDigit(num) && num != '.') {
		        	nt2.consume();  
		        }
 
			}
		});
		frmtdtxtfldNota2.setBounds(169, 57, 86, 20);
		panel_1.add(frmtdtxtfldNota2);
		
		JFormattedTextField frmtdtxtfldNota3 = new JFormattedTextField();
		frmtdtxtfldNota3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent nt3) {
				char num = nt3.getKeyChar();
		        if (!Character.isDigit(num) && num != '.') {
		        	nt3.consume();  
		        }
			}
		});
		frmtdtxtfldNota3.setBounds(169, 82, 86, 20);
		panel_1.add(frmtdtxtfldNota3);
		JLabel label = new JLabel("Notas del estudiante");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.BLACK);
		label.setBackground(Color.BLACK);
		label.setBounds(41, 290, 105, 14);
		panel.add(label);
		
		btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nota1 = 0;
                nota2 = 0;
                nota3 = 0;
                try {
                    nota1 = Float.parseFloat(frmtdtxtfldNota1.getText());
                    nota2 = Float.parseFloat(frmtdtxtfldNota2.getText());
                    nota3 = Float.parseFloat(frmtdtxtfldNota3.getText());
                } catch (NumberFormatException ex) {
                    
                    return;
                }
                float suma = nota1 + nota2 + nota3;
                float promedio = suma / 3;
                txtPromedio.setText(Float.toString(promedio));
                
                String condicion = (String) comboBoxTP.getSelectedItem();
                if ("Desaprobado".equals(condicion)) {
                    txtCondicion.setText("Desaprobado");
                } else if (nota1 < 6 || nota2 < 6 || nota3 < 6) {
                    txtCondicion.setText("Desaprobado");
                } else if (nota1 >= 6 && nota1 < 8 && 
                           nota2 >= 6 && nota2 < 8 && 
                           nota3 >= 6 && nota3 < 8 && 
                           "Aprobado".equals(condicion)) {
                    txtCondicion.setText("Regular");
                } else if (nota1 >= 8 && nota2 >= 8 && nota3 >= 8 && "Aprobado".equals(condicion)) {
                    txtCondicion.setText("Promocionado");
                }
                else {
                    txtCondicion.setText("Manda mail");
                }
            }
        });
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nota1 = 0;
                nota2 = 0;
                nota3 = 0;
                frmtdtxtfldNota1.setText("");
                frmtdtxtfldNota2.setText("");
                frmtdtxtfldNota3.setText("");
                txtPromedio.setText("");
                txtCondicion.setText("");
                
                
			}
		});
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), Color.CYAN, Color.CYAN, Color.CYAN));
		panel_2.setBounds(31, 297, 289, 116);
		panel.add(panel_2);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(42, 35, 72, 14);
		panel_2.add(lblPromedio);
		
		
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(42, 60, 72, 14);
		panel_2.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(158, 32, 97, 20);
		panel_2.add(txtPromedio);
		
		
		txtCondicion = new JTextField();
		txtCondicion.setColumns(10);
		txtCondicion.setBounds(158, 57, 97, 20);
		panel_2.add(txtCondicion);
		
		
	
	}

public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
}
