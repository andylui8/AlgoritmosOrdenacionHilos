	package plantillaAlgoritmos;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.EventQueue;
	import java.awt.GridLayout;
	import java.awt.event.MouseEvent;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

public class Marcos2  extends JFrame
{


		private JButton jButton1;
	    private JPanel jPanel1;
	    private JPanel jPanel2;
	    private JPanel jPanel3;

		int array1[];
		int array2[];
		int array3[];
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Marcos2 frame = new Marcos2();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		private void initComponents()
		{
	        
	        jPanel1 = new JPanel();
	        jPanel2 = new JPanel();
	        jPanel3 = new JPanel();
	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Ordenación de arrays numéricos");
	        setBackground(new java.awt.Color(204, 255, 204));

	        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 0, Short.MAX_VALUE)
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 112, Short.MAX_VALUE)
	        );



	        jButton1.setText("Ordenar");
	        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jButton1MouseClicked(evt);
	            }

				private void jButton1MouseClicked(MouseEvent evt) {
					HiloBurbuja hilo1= new HiloBurbuja(jPanel1, array1);
			        hilo1.start();
			         
			        HiloInsercion hilo2=new HiloInsercion(jPanel2, array2);
			        hilo2.start();
			        
			        HiloQuickShort hilo3=new HiloQuickShort(jPanel3, array3);
			        hilo3.start();
			        
					
				}
	        });
	        
	        
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(500, 500, 500)
	                .addComponent(jButton1)
	                .addContainerGap(513, Short.MAX_VALUE))
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );
	        
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(43, 43, 43)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(44, 44, 44)
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(45, 45, 45)
	                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(46, 46, 46)
	                .addComponent(jButton1)
	                .addContainerGap(169, Short.MAX_VALUE))
	        );

	        pack();
	        }
		
		
		public Marcos2() 
		{

		        initComponents();
		        this.jPanel1.setLayout(new GridLayout(1,20));

		        array1= new int[20];
		        
		        for (int i = 0; i < 20; i++)
		        {
		          array1[i]= (int)(Math.random()*100);  
		        }
		        
		        for (int i = 0; i < 20; i++) 
		        {   
		            JButton boton = new JButton(String.valueOf(array1[i]));
		            boton.setBackground(Color.white);
		            this.jPanel1.add(boton);   
		        }
		        
		        
		        this.jPanel2.setLayout(new GridLayout(1,20));

		        array2= new int[20];
		        
		        for (int i = 0; i < 20; i++)
		        {
		          array2[i]= (int)(Math.random()*100);  
		        }
		        
		        for (int i = 0; i < 20; i++) 
		        {   
		            JButton boton = new JButton(String.valueOf(array2[i]));
		            boton.setBackground(Color.white);
		            this.jPanel2.add(boton);   
		        }
		        
		        this.jPanel3.setLayout(new GridLayout(1,20));

		        array3= new int[20];
		        
		        for (int i = 0; i < 20; i++)
		        {
		          array3[i]= (int)(Math.random()*100);  
		        }
		        
		        for (int i = 0; i < 20; i++) 
		        {   
		            JButton boton = new JButton(String.valueOf(array3[i]));
		            boton.setBackground(Color.white);
		            this.jPanel3.add(boton);   
		        }
		        
		}

	}