package Calculadora;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Accionar extends Diseño{
	
	private int X,Y;
	private JButton[] arreglo= null;
	private boolean turno;
	private String  capNumero = "", operaciones="";
	private Double  mosNumero ;
	private Double  resultado;
	
	
   public Accionar() {
	   
	   this.arreglo= getBotones();
	   ventanaCerrar();
	   moverVentana();
	   moverVentana2();
	   presionarBoton();
   }	
   
   public void presionarBoton() {
	   
	   ActionListener presionar= new ActionListener() {	   
		   @Override  
		     public void actionPerformed(ActionEvent e) {
		       turno= true; 
	    	     for(int i=0; i< arreglo.length; i++) {
		    	   if(e.getSource() == arreglo[i]) {
		    	     if(turno) {	
		    		   switch(i){ 
		    		     case 13:  capNumero += "9";
		    				         getRectangulo().setText(capNumero);
		    			               break;
		    			 case 12:        capNumero += "8"; 
		    				               getRectangulo().setText(capNumero);
		    			                     break;
		    			 case 11:              capNumero += "7"; 
		    				                   getRectangulo().setText(capNumero);
		    			                       break;
		    			 case 9:                 capNumero += "6"; 
  				                                   getRectangulo().setText(capNumero);
			                                         break;
		    			 case 8:                       capNumero += "5"; 
  				                                         getRectangulo().setText(capNumero);
			                                               break;
		    			 case 7:                           capNumero += "4"; 
  				                                           getRectangulo().setText(capNumero);
			                                               break;
		    			 case 5:                         capNumero += "3"; 
  				                                       getRectangulo().setText(capNumero);
			                                         break;
		    			 case 4:                   capNumero += "2"; 
  				                                   getRectangulo().setText(capNumero);
			                                       break;
		    			 case 3:                 capNumero += "1"; 
  				                               getRectangulo().setText(capNumero);
			                                 break;
		    			 case 1:           capNumero += "0"; 
  				                         getRectangulo().setText(capNumero);
			                             break; 
		    			 case 17:  	   mosNumero = Double.parseDouble(capNumero);
	    	    		               getRectangulo2().setText(mosNumero + "/"); 
	    	    		             capNumero= "";
	    	    		           operaciones="Dividir";
	    	    	              break;
		    			 case 16:   mosNumero = Double.parseDouble(capNumero);
	    	    		              getRectangulo2().setText(mosNumero + "X");
	    	    		                capNumero= "";
	    	    		                  operaciones="Multiplicar";
	    	    		                    break;   
		    			 case 15: 	        mosNumero = Double.parseDouble(capNumero);
    		                                getRectangulo2().setText(mosNumero + "+");
  		                                    capNumero= "";
  		                                    operaciones="Sumar";
  		                                    break;   
		    			 case 14:     	      mosNumero = Double.parseDouble(capNumero);
    		                                     getRectangulo2().setText(mosNumero + "-");
  		                                           capNumero= "";
  		                                             operaciones="Multiplicar";
  		                                               break;   
		    			 case 10:  	                     mosNumero = Double.parseDouble(capNumero);
    		                                               getRectangulo2().setText("");
    		                                                 getRectangulo2().setText("");
  		                                                       capNumero= "";
  		                                                       turno= false;
  		                                                       break;   
		    			 case 6: //boton borrar uno por uno
		    			 case 0:	 capNumero = ","; 
		                             getRectangulo().setText(capNumero);
	                                 break;
		    			 case 2:	 
		    			 default: break;
		    			 }
		    		 }
		    	 }
		    	     if(e.getSource() == arreglo[2]) {
		    	    	 double mosNumero2;
		    	    	 if(operaciones.equals("")) {
		    	    		 getRectangulo2().setText(capNumero);
		    	    	 }else if(operaciones.equals("Dividir")) {	
		    	    		 mosNumero2 = Double.parseDouble(capNumero); 
		    	    	  		 resultado = (mosNumero / mosNumero2);
		    	    	  		 getRectangulo2().setText(String.format("% .1f/% .1f= %.2f ", mosNumero,mosNumero2,resultado));
		    	                   
		    	    	 }else  if(operaciones.equals("Multiplicar")) {	 	 
		    	    			 mosNumero2 = Double.parseDouble(capNumero); 
		    	    	  		 resultado = (mosNumero * mosNumero2);
		    	    	  		 getRectangulo2().setText(String.format("% .1f/% .1f= %.2f ", mosNumero,mosNumero2,resultado));
		    	    		 }else  if(operaciones.equals("Sumar")) {	 	 
		    	    			 mosNumero2 = Double.parseDouble(capNumero); 
		    	    	  		 resultado = (mosNumero + mosNumero2);
		    	    	  		 getRectangulo2().setText(String.format("% .1f/% .1f= %.2f ", mosNumero,mosNumero2,resultado));
		    	    		 }else  if(operaciones.equals("Restar")) {	 	 
		    	    			 mosNumero2 = Double.parseDouble(capNumero); 
		    	    	  		 resultado = (mosNumero - mosNumero2);
		    	    	  		 getRectangulo2().setText(String.format("% .1f/% .1f= %.2f ", mosNumero,mosNumero2,resultado));
		    	    		 }
		    	    		 }        
	    	       }
	               }
	             };
	   for(int i=0; i< arreglo.length; i++) {
	   arreglo[i].addActionListener(presionar);
	   }
   }
   
   public void ventanaCerrar() {
	   
	   MouseListener cerrar= new MouseListener() {
		   @Override
		     public void mouseClicked(MouseEvent e ) {
			   System.exit(0);
		       }
		         @Override
		           public void mousePressed(MouseEvent e ) {}
                     @Override
		               public void mouseReleased(MouseEvent e) {}
                       @Override
                     public void mouseEntered(MouseEvent e) {
        	       getCerrarVentana().setBackground(new Color(1,215,251));
        	     getCerrarVentana().setForeground(Color.white);
                 }
               @Override
             public void mouseExited(MouseEvent e) {
           getCerrarVentana().setBackground(Color.white);
         getCerrarVentana().setForeground(new Color(1,115,251));
         }
	   };
	 getCerrarVentana().addMouseListener(cerrar);
     }
   
   public void moverVentana() {
	   
	   MouseListener mueve= new MouseListener() {
	     @Override
	       public void mouseClicked(MouseEvent e) {}
	        @Override
	          public void mousePressed(MouseEvent e) {
	            X= getX();   Y= getY();
	            }
	              @Override
		            public void mouseEntered(MouseEvent e) {}
	              @Override
		        public void mouseReleased(MouseEvent e) {}
	          @Override
	   	    public void mouseExited(MouseEvent e) {}  
	      };
        }
   
   public void moverVentana2() {
	   
	   MouseMotionListener escucha= new MouseMotionListener() {
	     @Override
		   public void mouseDragged(MouseEvent e) {
		     setLocation(e.getXOnScreen() - X, e.getYOnScreen() - Y);
		     }
		   @Override
		 public void mouseMoved(MouseEvent e) {}
	   };
	 getPanelSuperior().addMouseMotionListener(escucha);   
     }
}
