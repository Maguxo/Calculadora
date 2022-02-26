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
	private String  capNumero = "";
	private Double  mosNumero;
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
		    	 if(e.getSource() == arreglo[13]) {	   
		    	   if(turno) {
		    	     if(getRectangulo().getText() == ""){ 
		    	         capNumero = "9";
		    	       }else{
		    	    	  capNumero += "9";
		    	    	    turno=false;
		    	            }
		    	              getRectangulo().setText(capNumero);
		    	            }
		                    }
		    	              if(e.getSource() == arreglo[12]) {	   
			    	            if(turno) {
			    	              if(getRectangulo().getText() == ""){ 
			    	                capNumero= "8";
			    	                }else{
			    	    	           capNumero += "8";
			    	    	             turno=false;
			    	                     }
			    	                       getRectangulo().setText(capNumero);
			    	                     }
			                             }
		    	                           if(e.getSource() == arreglo[11]) {	   
		    			    	             if(turno) {
		    			    	               if(getRectangulo().getText() == ""){ 
		    			    	                 capNumero= "7";   
		    			    	                 }else{
		    			    	                	 capNumero+= "7";
		    			    	    	              turno=false;
		    			    	                      }
		    			    	                        getRectangulo().setText(capNumero);
		    			    	                      }
		    			                              }
		    	                                        if(e.getSource() == arreglo[9]) {	   
		    	            		    	              if(turno) {
		    	            		    	                if(getRectangulo().getText() == ""){ 
		    	            		    	                	capNumero= "6";
		    	            		    	                  }else{
		    	            		    	                	  capNumero+= "6";
		    	            		    	    	               turno=false;
		    	            		    	                       }
		    	            		    	                         getRectangulo().setText(capNumero);
		    	            		    	                       }
		    	            		                               }
		    	                                                     if(e.getSource() == arreglo[8]) {	   
		    	                         		    	               if(turno) {
		    	                         		    	                 if(getRectangulo().getText() == ""){ 
		    	                         		    	                	capNumero= "5";
		    	                         		    	                   }else{
		    	                         		    	                	  capNumero+= "5";
		    	                         		    	    	                turno=false;
		    	                         		    	                        }
		    	                         		    	                         getRectangulo().setText(capNumero);
		    	                         		    	                        }
		    	                         		                                }
		    	                                                                  if(e.getSource() == arreglo[7]) {	   
		    	                                      		    	                if(turno) {
		    	                                      		    	                  if(getRectangulo().getText() == ""){ 
		    	                                      		    	                	capNumero= "4";
		    	                                      		    	                    }else{
		    	                                      		    	                    	capNumero+= "4";
		    	                                      		    	    	                turno=false;
		    	                                      		    	                        }
		    	                                      		    	                          getRectangulo().setText(capNumero);
		    	                                      		    	                        }
		    	                                      		                                }
		    	                                                                          if(e.getSource() == arreglo[5]) {	   
		    	                                                   		    	        if(turno) {
		    	                                                   		    	      if(getRectangulo().getText() == ""){ 
		    	                                                   		    	    capNumero= "3";
		    	                                                   		    	  }else{
		    	                                                   		    		capNumero+= "3";
		    	                                                   		       turno=false;
		    	                                                   		       }
		    	                                                   		     getRectangulo().setText(capNumero);	      
		    	                                                   		       }
		    	                                                   		       }
		    	                                                             if(e.getSource() == arreglo[4]) {	   
		    	                                                           if(turno) {
		    	                                                         if(getRectangulo().getText() == ""){ 
		    	                                                        	 capNumero= "2";
		    	                                                     }else{
		    	                                                    	 capNumero+= "2";
		    	                                                 turno=false;
		    	                                                 }
		    	                                                 getRectangulo().setText(capNumero);        
		    	                        		    	         }
		    	                           	                     }
		    	                                               if(e.getSource() == arreglo[3]) {	   
		    	                                             if(turno) {
		    	                          		    	   if(getRectangulo().getText() == ""){ 
		    	                          		    		 capNumero= "1";
		    	                                       }else{
		    	                                    	   capNumero+= "1";
		    	                                   turno=false;
		    	                                   }
		    	                          		   getRectangulo().setText(capNumero);
		    	                                   }
		    	                                   }
		    	                                 if(e.getSource() == arreglo[1]) {	   
		    	                               if(turno) {
		    	                             if(getRectangulo().getText() == ""){ 
		    	                            	 capNumero= "0";
		    	                             }else{
		    	                            	 capNumero+= "0";
		    	                	 turno=false;
		    	                     }
		    	                             getRectangulo().setText(capNumero);
		                             }
		   		                     }
		    	                   if(e.getSource() == arreglo[0]) {
		    	                	   if(turno) {
		    	      	    	 if(getRectangulo().getText() == capNumero) {
		    	             capNumero= ",";
		    	             
		    	      	    	 }else {
		    	      	    		 capNumero+=",";
		    	      	    	 }
		    	      	    	 turno= false;
		    	      	    	getRectangulo().setText(capNumero);
		    	                	   }
		    	       }
		    	     if(e.getSource() == arreglo[10]) {	  
		    	    	 if(turno) {
	    	       getRectangulo().setText("");
	    	       getRectangulo2().setText("");
                      		    	   
		    	    	 }turno= false;
		    	    	 turno= false;
		    	     }
		    	     if(e.getSource() == arreglo[17]) {
		    	    	 if(turno) {
		    	    		 mosNumero = Double.parseDouble(capNumero);
		    	    		 getRectangulo2().setText(mosNumero + "/");
		    	    		 capNumero= "";
		    	    		 turno= false;
		    	    	 }
		    	     }
		    	     if(e.getSource() == arreglo[16]) {
		    	    	 if(turno) {
		    	    		 mosNumero = Double.parseDouble(capNumero);
		    	    		 getRectangulo2().setText(mosNumero + "X");
		    	    		 capNumero= "";
		    	    		 turno= false;
		    	    	 }
		    	     }
		    	     if(e.getSource() == arreglo[15]) {
		    	    	 if(turno) {
		    	    		 mosNumero = Double.parseDouble(capNumero);
		    	    		 getRectangulo2().setText(mosNumero + "+");
		    	    		 capNumero= "";
		    	    		 turno= false;
		    	    	 }
		    	     }
		    	     if(e.getSource() == arreglo[14]) {
		    	    	 if(turno) {
		    	    		 mosNumero = Double.parseDouble(capNumero);
		    	    		 getRectangulo2().setText(mosNumero + "-");
		    	    		 capNumero= "";
		    	    		 turno= false;
		    	    	 }
		    	     }
		    	     if(e.getSource() == arreglo[2]) {
		    	    	 double mosNumero2;
		    	    	 if(turno) {
		    	    	 if(arreglo[17].getText()== "/") {
		    	    	  		 mosNumero2 = Double.parseDouble(capNumero); 
		    	    	  		 resultado = (mosNumero / mosNumero2);
		    	    	  		 getRectangulo2().setText(String.format("% .1f/% .1f= %.2f ", mosNumero,mosNumero2,resultado));
		    	    	  		 turno= false;
		    	    	 }
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
