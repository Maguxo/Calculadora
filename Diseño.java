package Calculadora;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Diseño  extends JFrame{

	private JPanel          panelPrincipal, panelSuperior, panelTeclado;
	private JLabel          cerrarVentana;
	private JTextField      rectangulo;
	private static JButton  arreglo[]= null;
	private static JButton  boton1, boton2,boton3, boton4, boton5, 
	                        boton6, boton7, boton8, boton9;
	public Diseño() {
		
		imagen();
		forma_Del_Cuerpo();
		teclado();
	}
	
	public void imagen() {
		Image logo= new ImageIcon(getClass().getResource("imagenes/calculadora.jpg")).getImage();
		  this.setIconImage(logo);
	}
	
	public void forma_Del_Cuerpo() {
	
		panelPrincipal= new JPanel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBounds(0,0,500,500);
		panelPrincipal.setBackground(new Color(155,155,155));
		this.getContentPane().add(panelPrincipal);
		
		panelSuperior= new JPanel();
		panelSuperior.setLayout(null);
		panelSuperior.setBounds(0,0,500,50);
		panelSuperior.setBackground(new Color(155,155,155));
		panelPrincipal.add(panelSuperior);
		
		panelTeclado= new JPanel();
		panelTeclado.setLayout(null);
		panelTeclado.setBounds(6,230,230,200);
		panelTeclado.setBackground(new Color(155,155,155));
		panelPrincipal.add(panelTeclado);
		
		cerrarVentana= new JLabel();
		cerrarVentana.setBounds(0,0,50,50);
		cerrarVentana.setText("X");
		cerrarVentana.setFont(new Font("AR BERKLEY", 6,24));
		cerrarVentana.setBackground(Color.white);
		cerrarVentana.setHorizontalAlignment(SwingConstants.CENTER);
		cerrarVentana.setVerticalAlignment(SwingConstants.CENTER);
		cerrarVentana.setOpaque(true);
		panelSuperior.add(cerrarVentana);
		
		rectangulo= new JTextField();
		rectangulo.setBounds(6,60,300,50);
		rectangulo.setBackground(Color.gray);
		rectangulo.setForeground(Color.white);
		rectangulo.setFont(new Font("Lucida Fax", 160,34));
		panelPrincipal.add(rectangulo);
	}
	
	public void teclado() {
		
		panelTeclado.setLayout(new GridLayout(3,3,5,5));
		  arreglo= new JButton[10];
		    for(int i= arreglo.length-1; i>=1 ;i--) {
			      arreglo[i]= new JButton();
			        arreglo[i].setText(""+i);
			          arreglo[i].setBackground(new Color(7,7,7));
			        arreglo[i].setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
			        arreglo[i].setForeground(Color.white);
			      arreglo[i].setOpaque(true);
			    panelTeclado.add(arreglo[i]);
		        }
		
		boton1= new JButton();
		boton1.setBounds(6,432,72,60);
		boton1.setText(",");
		boton1.setBackground(new Color(7,7,7));
		boton1.setForeground(Color.white);
		boton1.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
		boton1.setOpaque(true);
		panelPrincipal.add(boton1);
	
		boton2= new JButton();
		boton2.setBounds(84,432,72,60);
		boton2.setText("0");
		boton2.setForeground(Color.white);
		boton2.setBackground(new Color(7,7,7));
		boton2.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
		boton2.setOpaque(true);
		panelPrincipal.add(boton2);
	
		boton3= new JButton();
		boton3.setBounds(162,432,72,60);
		boton3.setText("=");
		boton3.setForeground(Color.white);
		boton3.setBackground(new Color(120,75,19));
		boton3.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
		boton3.setOpaque(true);
		panelPrincipal.add(boton3);
	    
		boton4= new JButton();
		boton4.setBounds(238,432,72,60);
		boton4.setText("+");
		boton4.setForeground(Color.white);
		boton4.setBackground(new Color(7,7,7));
		boton4.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
		boton4.setOpaque(true);
		panelPrincipal.add(boton4);
	    
		boton5= new JButton();
		boton5.setBounds(238,366,72,62);
		boton5.setText("-");
		boton5.setForeground(Color.white);
		boton5.setBackground(new Color(7,7,7));
		boton5.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,34));
		boton5.setOpaque(true);
		panelPrincipal.add(boton5);
	    
		boton6= new JButton();
		boton6.setBounds(238,299,72,62);
		boton6.setText("X");
		boton6.setForeground(Color.white);
		boton6.setBackground(new Color(7,7,7));
		boton6.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
		boton6.setOpaque(true);
		panelPrincipal.add(boton6);
	
		boton7= new JButton();
		boton7.setBounds(238,230,72,62);
		boton7.setText("/");
		boton7.setForeground(Color.white);
		boton7.setBackground(new Color(7,7,7));
		boton7.setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
		boton7.setOpaque(true);
		panelPrincipal.add(boton7);
 		
		
	}
	public JLabel getCerrarVentana() {
		return this.cerrarVentana;
	}
	public JPanel getPanelSuperior() {
		return this.panelSuperior;
	}
}
