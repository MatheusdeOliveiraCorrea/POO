package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JDialog {

	//Threads
	private Thread thread1 = new Thread(); 
	
	
	
	
	//painel 
	private JPanel painel = new	JPanel(new GridBagLayout());
	
	
	// labels e textField 
	private JLabel labelHora = new JLabel("Time thread 1 (label) "); 
	private JTextField textFieldTempo = new JTextField();
	
	private JLabel labelHora2 = new JLabel("Time thread 2 (label) "); 
	private JTextField textFieldTempo2 = new JTextField();
	
	
	//botões
	private JButton botaoStart = new JButton("Start"); 
	private JButton botaoStop = new JButton("Stop");
	
	
	
	//Interfaces Runnable para criar as Threads 
	Runnable interfaceTempo1 = new Runnable() {
		
		@Override
		public void run() {

			while(0 == 0 ) { //infinito 
				
				textFieldTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(
								Calendar.getInstance().getTime() 
								)
						);
				
				
				
		//Thread sleep pra evitar mt uso do processador 
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				

				
			}//fim while
			
		}
	};
	
	Runnable interfaceTempo2 = new Runnable() {
		
		@Override
		public void run() {
						
		}
	};
	
	
	
	
	public Tela() {
		
		
		
		//para trabalhar com o posionamento dos objetos 
		GridBagConstraints grid = new GridBagConstraints();
		grid.insets = new Insets(5, 10, 5, 10);
		
		grid.gridx = 0; 
		grid.gridy = 0; 
		grid.gridwidth = 2; 
		
		
		//Configuração geral da Tela
		setTitle("Timer");
		setSize(new Dimension(400,320));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		//adcionando label na posição x,y = (0,0) 
		labelHora.setPreferredSize(new Dimension(200, 20));
		painel.add(labelHora, grid); //adiciona ao painel
		
		//adcionando textfield na posição x,y = (0,1)
		textFieldTempo.setPreferredSize(new Dimension(200,25));
		textFieldTempo.setEditable(false);
		grid.gridy++; 
		painel.add(textFieldTempo, grid);  //adiciona ao painel
		
		
		//adcionando label na posição x,y = (0,2) 
		labelHora2.setPreferredSize(new Dimension(200,25));
		grid.gridy++;
		painel.add(labelHora2, grid);  //adiciona ao painel
		
		
		//adcionando TextField na posição x,y = (0,3) 
		textFieldTempo2.setPreferredSize(new Dimension(200,25));
		textFieldTempo2.setEditable(false);
		grid.gridy++;
		painel.add(textFieldTempo2, grid); //adiciona ao painel
		
		
		//botoes
		grid.gridwidth = 1;
		grid.anchor = GridBagConstraints.WEST;
		
		
		        //botao Start 
		botaoStart.setPreferredSize(new Dimension(92,25));
		grid.gridy++;
		painel.add(botaoStart, grid); //adiciona ao painel
		
		
				//botao Stop
		botaoStop.setPreferredSize(new Dimension(92,25));
		grid.gridx++;
		painel.add(botaoStop , grid);  //adiciona ao painel
		
		
		//Executa o click do botão
		
		botaoStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1 = new Thread(interfaceTempo1);
				thread1.start();
				
				
			}
		});
		
		botaoStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				thread1.stop();
				
			}
		});
		
		
		
		
		
		
		add(painel, BorderLayout.CENTER);
		setVisible(true);	//torna visivel 
		
	}
	
	
}
