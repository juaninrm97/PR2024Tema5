package es.studium.Ejemplos;

import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class VentanaCerrar implements WindowListener
{
	
	Frame ventana = new Frame("Ventana que se cierra");
	
	public VentanaCerrar()
	{
		ventana.setLayout (new GridBagLayout());
		
		ventana.addWindowListener(this);
		
		ventana.setSize(270,220);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new VentanaCerrar();

	}
	@Override
	public void windowOpened(WindowEvent e) 
	{
		System.out.println("Opened / La ventana se abrió");

	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
		System.out.println("Se cerró");
	}
	@Override
	public void windowClosed(WindowEvent e) 
	{
		System.out.println("Se cerró, pero no te voy a ver");

	}
	@Override
	public void windowIconified(WindowEvent e) 
	{
		System.out.println("Se minimizó");

	}
	@Override
	public void windowDeiconified(WindowEvent e) 
	{
		System.out.println("Se restauró");	

	}
	@Override
	public void windowActivated(WindowEvent e) 
	{
		System.out.println("La ventana se activó");

	}
	@Override
	public void windowDeactivated(WindowEvent e) 
	{
		System.out.println("La ventana se desactivó");
		
	}
}
