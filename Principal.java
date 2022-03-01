package Calculadora;

import javax.swing.JFrame;

public class Principal extends Accionar{
	
	public static  void main(String args[]) {
	
		Principal pantalla= new Principal();
		
		pantalla.setLayout(null);
		pantalla.setLocation(800,20);
		pantalla.setUndecorated(true);
		pantalla.setSize(350,500);
		pantalla.setVisible(true);
		pantalla.setResizable(true);
		pantalla.setTitle("Calculadora");
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} 
	
	

}
