package plantillaAlgoritmos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloInsercion extends Thread
{
	  static JPanel panel;
	  int array[];
	  
	  public HiloInsercion(JPanel panel, int[] array)
	  {
		        this.panel = panel;
		        this.array = array;
	  }
	  
		public void run()
		{
			//Metodo de insercion


			int aux;		
			for (int p = 1; p < array.length; p++) 
			{
				aux = array[p];
				int j = p - 1;
				while ((j >= 0) && (aux < array[j])) 
				{
					array[j + 1] = array[j];
					((JButton) this.panel.getComponent(j+1)).setBackground(Color.green);
					((JButton) this.panel.getComponent(j+1)).setText(String.valueOf(array[j]));
					j--;
				}
				array[j + 1] = aux;
				((JButton) this.panel.getComponent(j+1)).setText(String.valueOf(aux));
				((JButton) this.panel.getComponent(j+1)).setBackground(Color.green);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
}
