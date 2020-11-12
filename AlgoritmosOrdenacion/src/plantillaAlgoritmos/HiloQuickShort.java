package plantillaAlgoritmos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloQuickShort extends Thread
{
	  static JPanel panel;
	  int array[];
	  
	  public HiloQuickShort(JPanel panel, int[] array)
	  {
		        this.panel = panel;
		        this.array = array;
	  }
	  
		public void run()
		{
			//Metodo de quickShort
			quicksort(array,0,(array.length)-1);
				   
		}
		
		public static void quicksort(int array[],int ini, int fin	) {	 
		  int i=ini;         
		  int j=fin;
		  int eje = array[i+(j-i)/2];
		 
		  while(i <= j){                                                            
		     while(array[i]<eje) {
		    	 i++; 
		     }
		     while(array[j] >eje) {
		    	 j--;           
		     }
		     if (i <= j) {                                          
		         int aux= array[i];                   
		         array[i]=array[j];
		         ((JButton) panel.getComponent(i)).setText(String.valueOf(array[j]));
		         ((JButton) panel.getComponent(i)).setBackground(Color.lightGray);
		         array[j]=aux;
		         ((JButton) panel.getComponent(j)).setText(String.valueOf(aux));
		         ((JButton) panel.getComponent(j)).setBackground(Color.lightGray);
		         i++;
		         j--;
		         try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		     }
		   }
		   
		   
		   if(ini < j)
		      quicksort(array,ini,j);          
		   if(i < fin)
		      quicksort(array,i,fin);         
		}
}