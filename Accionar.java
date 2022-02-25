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
		    	       getRectangulo().setText("9");
		    	       }else{
		    	    	  getRectangulo().setText(getRectangulo().getText()+"9");
		    	    	    turno=false;
		    	            }
		    	            }
		                    }
		    	              if(e.getSource() == arreglo[12]) {	   
			    	            if(turno) {
			    	              if(getRectangulo().getText() == ""){ 
			    	                getRectangulo().setText("8");
			    	                }else{
			    	    	           getRectangulo().setText(getRectangulo().getText()+"8");
			    	    	             turno=false;
			    	                     }
			    	                     }
			                             }
		    	                           if(e.getSource() == arreglo[11]) {	   
		    			    	             if(turno) {
		    			    	               if(getRectangulo().getText() == ""){ 
		    			    	                 getRectangulo().setText("7");
		    			    	                 }else{
		    			    	    	            getRectangulo().setText(getRectangulo().getText()+"7");
		    			    	    	              turno=false;
		    			    	                      }
		    			    	                      }
		    			                              }
		    	                                        if(e.getSource() == arreglo[9]) {	   
		    	            		    	              if(turno) {
		    	            		    	                if(getRectangulo().getText() == ""){ 
		    	            		    	                  getRectangulo().setText("6");
		    	            		    	                  }else{
		    	            		    	    	             getRectangulo().setText(getRectangulo().getText()+"6");
		    	            		    	    	               turno=false;
		    	            		    	                       }
		    	            		    	                       }
		    	            		                               }
		    	                                                     if(e.getSource() == arreglo[8]) {	   
		    	                         		    	               if(turno) {
		    	                         		    	                 if(getRectangulo().getText() == ""){ 
		    	                         		    	                   getRectangulo().setText("5");
		    	                         		    	                   }else{
		    	                         		    	    	              getRectangulo().setText(getRectangulo().getText()+"5");
		    	                         		    	    	                turno=false;
		    	                         		    	                        }
		    	                         		    	                        }
		    	                         		                                }
		    	                                                                  if(e.getSource() == arreglo[7]) {	   
		    	                                      		    	                if(turno) {
		    	                                      		    	                  if(getRectangulo().getText() == ""){ 
		    	                                      		    	                    getRectangulo().setText("4");
		    	                                      		    	                    }else{
		    	                                      		    	    	              getRectangulo().setText(getRectangulo().getText()+"4");
		    	                                      		    	    	                turno=false;
		    	                                      		    	                        }
		    	                                      		    	                        }
		    	                                      		                                }
		    	                                                                          if(e.getSource() == arreglo[5]) {	   
		    	                                                   		    	        if(turno) {
		    	                                                   		    	      if(getRectangulo().getText() == ""){ 
		    	                                                   		    	    getRectangulo().setText("3");
		    	                                                   		    	  }else{
		    	                                                   		    	 getRectangulo().setText(getRectangulo().getText()+"3");
		    	                                                   		       turno=false;
		    	                                                   		       }
		    	                                                   		       }
		    	                                                   		       }
		    	                                                             if(e.getSource() == arreglo[4]) {	   
		    	                                                           if(turno) {
		    	                                                         if(getRectangulo().getText() == ""){ 
		    	                                                       getRectangulo().setText("2");
		    	                                                     }else{
		    	                                                   getRectangulo().setText(getRectangulo().getText()+"2");
		    	                                                 turno=false;
		    	                                                 }
		    	                        		    	         }
		    	                           	                     }
		    	                                               if(e.getSource() == arreglo[3]) {	   
		    	                                             if(turno) {
		    	                          		    	   if(getRectangulo().getText() == ""){ 
		    	                                         getRectangulo().setText("1");
		    	                                       }else{
		    	                                     getRectangulo().setText(getRectangulo().getText()+"1");
		    	                                   turno=false;
		    	                                   }
		    	                                   }
		    	                                   }
		    	                                 if(e.getSource() == arreglo[1]) {	   
		    	                               if(turno) {
		    	                             if(getRectangulo().getText() == ""){ 
		    	                           getRectangulo().setText("0");
		    	                         }else{
		    	                       getRectangulo().setText(getRectangulo().getText()+"0");
		    	                	 turno=false;
		    	                     }
		                             }
		   		                     }
		    	                   if(e.getSource() == arreglo[0]) {	   
		    	      	    	 if(turno) {
		    	               if(getRectangulo().getText() == ""){ 
		    	             getRectangulo().setText(",");
		    	           }else{
		    	         getRectangulo().setText(getRectangulo().getText()+",");
		    	       turno=false;
		    	       }
		    	       }
		    	       }
		    	     if(e.getSource() == arreglo[10]) {	   
	    	       getRectangulo().setText("");	    	     
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
