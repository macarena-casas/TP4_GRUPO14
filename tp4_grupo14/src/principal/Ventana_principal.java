package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ventana_principal extends JFrame   {

	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	
	private JLabel titulo;
	
	public Ventana_principal() {
	 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Grupo 14: ");
		
		setLayout(null);
		
		titulo = new JLabel();
		titulo.setText("Grupo 14: ");
		titulo.setBounds(50, 20, 250, 90);
		getContentPane().add(titulo);
		
		boton1 = new JButton();
		boton1.setText("EJERCICIO 1");
		boton1.setBounds(150, 100, 150, 50);
		boton1.addActionListener(new Eventoboton1());
		getContentPane().add(boton1);

		boton2 = new JButton();
		boton2.setText("EJERCICIO 2");
		boton2.setBounds(150, 200, 150, 50);
		boton2.addActionListener(new Eventoboton2());
		getContentPane().add(boton2);

		boton3 = new JButton();
		boton3.setText("EJERCICIO 3");
		boton3.setBounds(150, 300, 150, 50);
		boton3.addActionListener(new Eventoboton3());
		getContentPane().add(boton3);

}
	
	public void cambiarvisibilidad(boolean estado) {
		
		setVisible(true);
	}
	
	class Eventoboton1  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Ejercicio1 ejercicio1 = new Ejercicio1();
			ejercicio1.cambiarvisibilidad(true);

		}
		
	}

	class Eventoboton2  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Ejercicio2 ejercicio2 = new Ejercicio2();
			ejercicio2.cambiarvisibilidad(true);

		}
		
	}
	
	class Eventoboton3  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Ejercicio3 ejercicio3 = new Ejercicio3();
			ejercicio3.cambiarvisibilidad(true);
	
		}
		
	}
	
}
