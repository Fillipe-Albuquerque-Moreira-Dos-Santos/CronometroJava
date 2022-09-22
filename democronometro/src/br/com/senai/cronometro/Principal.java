package br.com.senai.cronometro;

import javax.swing.SwingUtilities;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				 Cronometro cro = new Cronometro();
			}
			
		}
		);
		

	}

}
