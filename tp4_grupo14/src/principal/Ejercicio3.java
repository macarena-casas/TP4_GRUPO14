package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Ejercicio3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	
	public Ejercicio3() {
		
		setTitle("Seleccion multiple");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 328);
		getContentPane().setLayout(null);

		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 288);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(35, 23, 408, 44);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo ");
		lblNewLabel.setBounds(10, 11, 174, 14);
		panel_1.add(lblNewLabel);
		
		JRadioButton radioWindows = new JRadioButton("Windows");
		radioWindows.setBounds(176, 8, 89, 23);
		panel_1.add(radioWindows);
		
		JRadioButton radioMac = new JRadioButton("Mac");
		radioMac.setBounds(267, 8, 50, 23);
		panel_1.add(radioMac);
		
		JRadioButton radioLinux = new JRadioButton("Linux");
		radioLinux.setBounds(328, 7, 62, 23);
		panel_1.add(radioLinux);
		
		//Grupo de options
		ButtonGroup grupoRadios = new ButtonGroup();
		grupoRadios.add(radioWindows);
		grupoRadios.add(radioMac);
		grupoRadios.add(radioLinux);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(35, 78, 408, 98);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setBounds(30, 37, 143, 14);
		panel_2.add(lblNewLabel_1);
		
		JCheckBox checkProg = new JCheckBox("Programación");//corregir acento si es necesario
		checkProg.setBounds(191, 7, 117, 23);
		panel_2.add(checkProg);
		
		JCheckBox checkAdmin = new JCheckBox("Administración");//corregir acento si es necesario
		checkAdmin.setBounds(191, 33, 117, 23);
		panel_2.add(checkAdmin);
		
		JCheckBox checkDisGra = new JCheckBox("Diseño gráfico");//corregir acento si es necesario
		checkDisGra.setBounds(191, 60, 117, 23);
		panel_2.add(checkDisGra);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad de horas en el computador:");
		
		lblNewLabel_2.setBounds(48, 209, 239, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		
		textField.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent nt1) {
		        char num = nt1.getKeyChar();
		        if (!Character.isDigit(num)) {
		        	nt1.consume();  
		        }
		        if (num == '0' && textField.getText().isEmpty()) {
		            nt1.consume();  
		        }
		        
		    }
		});
		textField.setBounds(300, 207, 99, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String msjRadios =""; String msjChecks =""; String horas = textField.getText();
					if ( radioWindows.isSelected() ) msjRadios ="Windows"; //Recordar poner grupo de JRadioButons para seleccionar uno solo 
					if ( radioMac.isSelected() ) msjRadios ="Mac"; 
					if ( radioLinux.isSelected() ) msjRadios ="Linux"; 
					
					if ( checkProg.isSelected() ) msjChecks +=  "Programación - "; //corregir acento si es necesario
					if ( checkAdmin.isSelected() ) msjChecks +="Administración - "; //corregir acento si es necesario
					if ( checkDisGra.isSelected() ) msjChecks +="Diseño gráfico - "; //corregir acento si es necesario
					
					if(esNumerico( horas)== false) horas ="";
					
					if(msjRadios == "" || msjChecks =="" || horas =="")	validar(false);
					else {mostrarInfo(msjRadios, msjChecks, horas);
					
					grupoRadios.clearSelection();
					textField.setText("");
					checkProg.setSelected(false);
					checkAdmin.setSelected(false);
					checkDisGra.setSelected(false);
					
					
					}
					
				}catch(Exception e1) {
				}
			}

			private boolean esNumerico(String horas) {
				try {
					Float.parseFloat(horas);
					return true;
				}catch (NumberFormatException e) {
					return false;
				}
			}
			
		});
		btnAceptar.setBounds(321, 243, 89, 23);
		panel.add(btnAceptar);
		
		setLocationRelativeTo(null);  
	}
	
	private void validar(boolean bool) {
		if(!bool) {
			JOptionPane.showMessageDialog(this, "Ingrese los datos requeridos.", "Advertencia", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void mostrarInfo(String msjRadios, String msjChecks, String horas) {
			JOptionPane.showMessageDialog(this,  msjRadios + " - " + msjChecks  +  horas + " Hs", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void cambiarvisibilidad(boolean estado) {
			
			setVisible(true);
		}

}
