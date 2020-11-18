package Tarefa_4;

import javax.swing.JOptionPane;

public class Algoritmo02 {

	public static void main(String[] args) {
		

		double[] vectA = new double [15];
		
		double[] vectB = new double [15];
		
		for (int i = 0; i<=14; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));	
			
		}
		
		for (int i = 0; i<=14; i++) {
			
			vectB[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));	
			
		}
		
		double[] vectC = new double [15];
		
		for (int i = 0; i<=14; i++) {
			
				vectC[i] = vectA[i] - vectB[i];
			
		}
		
		JOptionPane.showMessageDialog(null,"Resultado da subtração dos vetores A e B");
		
		for (int i = 0; i<=14; i++) {
			
			JOptionPane.showMessageDialog(null,"A posição "+ i + " vale: "+ vectC[i]);
		
	}
	
		double[] vectD = new double [15];
		
		for (int i = 0; i<=14; i++) {
			
			vectD[i] = vectA[i] * vectB[i];
		
	}
	
		JOptionPane.showMessageDialog(null,"Resultado da multiplicação dos vetores A e B");
	
		
		for (int i = 0; i<=14; i++) {
			
			JOptionPane.showMessageDialog(null,"A posição "+ i + " vale: "+ vectD[i]);
		
	}
		
		
	}

}
