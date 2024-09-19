package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class Ejercicio1 extends JFrame {
	
	JLabel lblDatosIngre1 = new JLabel();
	
	
	public Ejercicio1() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Contactos ");
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(101, 102, 53, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(101, 127, 53, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setBounds(101, 157, 53, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechanac = new JLabel("Fecha de nacimiento:");
		lblFechanac.setBounds(101, 187, 117, 14);
		getContentPane().add(lblFechanac);
		
		JLabel lblDatosIngre = new JLabel("Los datos ingresados fueron: ");
		lblDatosIngre.setBounds(101, 260, 220, 20);
		getContentPane().add(lblDatosIngre);
		
		JFormattedTextField frmtdtxtfldNombre = new JFormattedTextField();
		frmtdtxtfldNombre.setBounds(228, 94, 140, 20);
		frmtdtxtfldNombre.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent nom1) {
		        char nom = nom1.getKeyChar();
		        if (!Character.isLetter(nom)) {
		        	nom1.consume();  
		        }
		   
		    }
		});
		getContentPane().add(frmtdtxtfldNombre);
		
		JFormattedTextField frmtdtxtfldApellido = new JFormattedTextField();
		frmtdtxtfldApellido.setBounds(228, 124, 140, 20);
		frmtdtxtfldApellido.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent ape1) {
		        char ape = ape1.getKeyChar();
		        if (!Character.isLetter(ape) ) {
		        	ape1.consume();  
		        }
		        
		    }
		});
		getContentPane().add(frmtdtxtfldApellido);
		
		JFormattedTextField frmtdtxtfldTelefono = new JFormattedTextField();
		frmtdtxtfldTelefono.setBounds(228, 154, 140, 20);
		frmtdtxtfldTelefono.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent tel1) {
		        char tel = tel1.getKeyChar();
		        if (!Character.isDigit(tel) ) {
		        	tel1.consume();  
		        }
		        
		    }
		});
		getContentPane().add(frmtdtxtfldTelefono);
		
		JFormattedTextField frmtdtxtfldFechaN = new JFormattedTextField();
		frmtdtxtfldFechaN.setBounds(228, 184, 140, 20);
		frmtdtxtfldFechaN.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent fecha1) {
		        char fecha = fecha1.getKeyChar();
		        if (!Character.isDigit(fecha) && fecha != '/') {
		        	fecha1.consume();  
		        }
		        
		    }
		});
		getContentPane().add(frmtdtxtfldFechaN);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(279, 214, 89, 30);
        getContentPane().add(btnMostrar);
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boolean allFieldsFilled = true;
                
                if (frmtdtxtfldNombre.getText().isEmpty()) {
                    frmtdtxtfldNombre.setBackground(Color.RED);
                    allFieldsFilled = false;
                } else {
                    frmtdtxtfldNombre.setBackground(Color.WHITE);
                }
                
                if (frmtdtxtfldApellido.getText().isEmpty()) {
                    frmtdtxtfldApellido.setBackground(Color.RED);
                    allFieldsFilled = false;
                } else {
                    frmtdtxtfldApellido.setBackground(Color.WHITE);
                }
                
                if (frmtdtxtfldTelefono.getText().isEmpty()) {
                    frmtdtxtfldTelefono.setBackground(Color.RED);
                    allFieldsFilled = false;
                } else {
                    frmtdtxtfldTelefono.setBackground(Color.WHITE);
                }
                
                if (frmtdtxtfldFechaN.getText().isEmpty()) {
                    frmtdtxtfldFechaN.setBackground(Color.RED);
                    allFieldsFilled = false;
                } else {
                    frmtdtxtfldFechaN.setBackground(Color.WHITE);
                }
                
                if (allFieldsFilled) {
                	
                	String datos="Nom y ape: " + frmtdtxtfldNombre.getText() + " " +frmtdtxtfldApellido.getText()
                	+ " - tel: " + frmtdtxtfldTelefono.getText() + " - Fecha " + frmtdtxtfldFechaN.getText();
                	lblDatosIngre1.setBounds(101, 275, 400, 40);
                	lblDatosIngre1.setText(datos);
                	getContentPane().add(lblDatosIngre1);
                	
                	 lblDatosIngre1.revalidate();
                     lblDatosIngre1.repaint();
                	                	                 	
                    frmtdtxtfldNombre.setText("");
                    frmtdtxtfldApellido.setText("");
                    frmtdtxtfldTelefono.setText("");
                    frmtdtxtfldFechaN.setText("");
                    
                    datos="";
                }
            }
        });
    }
public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
		}
	

