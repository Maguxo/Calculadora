package Calculadora;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Diseño  extends JFrame{

	private JPanel              panelPrincipal, panelSuperior, panelTeclado;
	private JLabel              cerrarVentana,  rectangulo2;
	private JTextField          rectangulo;
	private JButton[] arreglo=  null;
	
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
		panelPrincipal.setBounds(0,0,350,500);
		panelPrincipal.setBackground(new Color(155,155,155));
		this.getContentPane().add(panelPrincipal);
		
		panelSuperior= new JPanel();
		panelSuperior.setLayout(null);
		panelSuperior.setBounds(0,0,500,50);
		panelSuperior.setBackground(new Color(155,155,155));
		panelPrincipal.add(panelSuperior);
		
		panelTeclado= new JPanel();
		panelTeclado.setLayout(null);
		panelTeclado.setBounds(6,200,300,296);
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
		rectangulo.setHorizontalAlignment(JTextField.RIGHT);
		rectangulo.setForeground(Color.white);
		rectangulo.setOpaque(true);
		rectangulo.setFont(new Font("Lucida Fax", 160,34));
		panelPrincipal.add(rectangulo);
		
		rectangulo2= new JLabel();
		rectangulo2.setBounds(6,130,300,50);
		rectangulo2.setBackground(new Color(155,155,155));
		rectangulo2.setHorizontalAlignment(JLabel.LEFT);
		rectangulo2.setForeground(Color.ORANGE);
		rectangulo2.setOpaque(true);
		rectangulo2.setFont(new Font("Lucida Fax", 160,30));
		panelPrincipal.add(rectangulo2);
	}
	
	public void teclado() {
		
		panelTeclado.setLayout(new GridLayout(5,4,5,5));
		  arreglo= new JButton[18];
		    for(int i= arreglo.length-1; i>=0 ;i--) {
			      arreglo[i]= new JButton();
			        arreglo[i].setBackground(new Color(7,7,7));
			          arreglo[i].setFont(new Font("AR BERKLEY", Font.CENTER_BASELINE,24));
			            arreglo[i].setForeground(new Color(1,215,251));
	 		             arreglo[i].setOpaque(true);
			               if(arreglo[i] == arreglo[17]) {arreglo[17].setText("/"); arreglo[17].setBackground(new Color(51,51,51));}   
			                 if(arreglo[i] == arreglo[16]) {arreglo[16].setText("X"); arreglo[16].setBackground(new Color(51,51,51));}   
			            	   if(arreglo[i] == arreglo[15]) {arreglo[15].setText("+"); arreglo[15].setBackground(new Color(51,51,51));}   
			            	     if(arreglo[i] == arreglo[14]) {arreglo[14].setText("-"); arreglo[14].setBackground(new Color(51,51,51));}   
			            	       if(arreglo[i] == arreglo[13]) {arreglo[13].setText("9");}   
			            	         if(arreglo[i] == arreglo[12]) {arreglo[12].setText("8");}   
			            	           if(arreglo[i] == arreglo[11]) {arreglo[11].setText("7");}   
			            	             if(arreglo[i] == arreglo[10]) {arreglo[10].setText("C"); arreglo[10].setBackground(new Color(51,51,51));}   
			            	               if(arreglo[i] == arreglo[9]) {arreglo[9].setText("6");}   
			            	               if(arreglo[i] == arreglo[8]) {arreglo[8].setText("5");}   
			            	             if(arreglo[i] == arreglo[7]) {arreglo[7].setText("4");}   
			            	           if(arreglo[i] == arreglo[6]) {arreglo[6].setText("<x|");  arreglo[6].setBackground(new Color(51,51,51));}
			            	         if(arreglo[i] == arreglo[5]) {arreglo[5].setText("3");}   
			            	       if(arreglo[i] == arreglo[4]) {arreglo[4].setText("2");}   
			            	     if(arreglo[i] == arreglo[3]) {arreglo[3].setText("1");}   
			            	   if(arreglo[i] == arreglo[2]) {arreglo[2].setText("="); arreglo[2].setBackground(new Color(125,79,23));}   
			            	 if(arreglo[i] == arreglo[1]) {arreglo[1].setText("0");}   
			            if(arreglo[i] == arreglo[0]) {arreglo[0].setText("."); arreglo[0].setBackground(new Color(51,51,51));}   
			          panelTeclado.add(arreglo[i]);
		              }
	}
	public JLabel getCerrarVentana()   {return this.cerrarVentana;}
	public JPanel getPanelSuperior()   {return this.panelSuperior;}
	public JButton[] getBotones()      {return arreglo;}
	public JTextField getRectangulo()  {return this.rectangulo;}
	public JLabel getRectangulo2()  {return this.rectangulo2;}
    }
