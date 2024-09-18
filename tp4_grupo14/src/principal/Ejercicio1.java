package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio1 extends JFrame {

	public Ejercicio1() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Contactos ");
		
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(42, 50, 53, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(42, 80, 53, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(42, 110, 53, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechanac = new JLabel("Fecha Nac.");
		lblFechanac.setBounds(42, 140, 53, 14);
		getContentPane().add(lblFechanac);
		
		JLabel lblDatosIngre = new JLabel("Los datos ingresados fueron: ");
		lblDatosIngre.setBounds(32, 250, 180, 14);
		getContentPane().add(lblDatosIngre);
		
		JFormattedTextField frmtdtxtfldNombre = new JFormattedTextField();
		frmtdtxtfldNombre.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent nom1) {
		        char nom = nom1.getKeyChar();
		        if (!Character.isLetter(nom)) {
		        	nom1.consume();  
		        }
		        
		    }
		});
		frmtdtxtfldNombre.setBounds(169, 50, 140, 20);
		getContentPane().add(frmtdtxtfldNombre);
		
		JFormattedTextField frmtdtxtfldApellido = new JFormattedTextField();
		frmtdtxtfldApellido.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent ape1) {
		        char ape = ape1.getKeyChar();
		        if (!Character.isLetter(ape) ) {
		        	ape1.consume();  
		        }
		        
		    }
		});
		frmtdtxtfldApellido.setBounds(169, 80, 140, 20);
		getContentPane().add(frmtdtxtfldApellido);
		
		JFormattedTextField frmtdtxtfldTelefono = new JFormattedTextField();
		frmtdtxtfldTelefono.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent tel1) {
		        char tel = tel1.getKeyChar();
		        if (!Character.isDigit(tel) ) {
		        	tel1.consume();  
		        }
		        
		    }
		});
		frmtdtxtfldTelefono.setBounds(169, 110, 140, 20);
		getContentPane().add(frmtdtxtfldTelefono);
		
		JFormattedTextField frmtdtxtfldFechaN = new JFormattedTextField();
		frmtdtxtfldFechaN.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent fecha1) {
		        char fecha = fecha1.getKeyChar();
		        if (!Character.isDigit(fecha) && fecha != '/') {
		        	fecha1.consume();  
		        }
		        
		    }
		});
		frmtdtxtfldFechaN.setBounds(169, 140, 140, 20);
		getContentPane().add(frmtdtxtfldFechaN);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(220, 170, 89, 30);
		getContentPane().add(btnMostrar);
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	falta condicion si se muestra o no
                frmtdtxtfldNombre.setText("");
                frmtdtxtfldApellido.setText("");
                frmtdtxtfldTelefono.setText("");
                frmtdtxtfldFechaN.setText("");
             //   
                
                
			}
		});
		
		
		
		
	}///

public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
	
}
