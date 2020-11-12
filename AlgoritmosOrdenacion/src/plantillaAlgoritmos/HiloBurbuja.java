package plantillaAlgoritmos;

import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloBurbuja extends Thread
{
	  static JPanel panel;
	  int array[];
	  
	  public HiloBurbuja(JPanel panel, int[] array)
	  {
		        this.panel = panel;
		        this.array = array;
	  }
		public void run()
		{	
			//Método de la burbuja
			int aux;
			for(int i = 0 ; i < array.length -1 ; i++) 
			{
				for (int j = 0 ; j < array.length - i - 1 ; j++) 
				{
					if(array[j+1]<array[j]) 
					{
						try {
						aux = array[j + 1];
						array[j+1] = array[j];
						((JButton) this.panel.getComponent(j+1)).setBackground(Color.red);
						((JButton) this.panel.getComponent(j+1)).setText(String.valueOf(array[j]));
						array[j] = aux;
						((JButton)this.panel.getComponent(j)).setText(String.valueOf(aux));
						((JButton) this.panel.getComponent(j)).setBackground(Color.red);
						sleep(100);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
}