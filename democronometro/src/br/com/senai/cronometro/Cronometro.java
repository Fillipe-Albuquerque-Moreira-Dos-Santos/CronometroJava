package br.com.senai.cronometro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cronometro implements ActionListener {
	

	JLabel jlab;
	long start; // contém a hora inicial em milissegundos
	
	//Criar os botões
	JButton btnStart = new JButton("Start");
	JButton btnStop = new JButton("Stop");
	
	public Cronometro() {

		JFrame jfrm = new JFrame("Senai - Escola Java");
		jlab = new JLabel ("Pressione Start para iniciar o tempo");
		//Add os ouvintes de ação
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(230,90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add botões dentro do container
		jfrm.add(btnStart);
		jfrm.add(btnStop);
		jfrm.add(jlab);
		jfrm.setVisible (true);
	}
	
	//contagemTempo = new JLabel ("00:00:00");
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		if (e.getActionCommand().equals("Start")) {
			start = cal.getTimeInMillis();
			jlab.setText("Cronômetro esta em execução");
		}else {
			jlab.setText("O tempo deccorido foi: " + (double) (cal.getTimeInMillis() - start)/1000);
		}
		
	}
	
}

