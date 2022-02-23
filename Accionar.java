package Calculadora;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Accionar extends Diseño{
	
	private int X,Y;
	
   public Accionar() {
	   
	   ventanaCerrar();
	   moverVentana();
	   moverVentana2();
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
