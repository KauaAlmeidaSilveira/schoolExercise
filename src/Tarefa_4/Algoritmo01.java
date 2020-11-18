package Tarefa_4;

import javax.swing.JOptionPane;

public class Algoritmo01 {

	public static void main(String[] args) {
		
		
		
		double[] vectA = new double [20];
		
		double[] vectB = new double [20];
		
		for (int i = 0; i<=19; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));	
			
		}
		
		for (int i = 0; i<=19; i++) {
			
			vectB[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));	
			
		}
		
		double[] vectC = new double [20];
		
		for (int i = 0; i<=19; i++) {
			
				vectC[i] = vectA[i] + vectB[i];
			
		}
		
		for (int i = 0; i<=19; i++) {
			
			JOptionPane.showMessageDialog(null,"A posição "+ i + " vale: "+ vectC[i]);
		
	}
	
		
		
	}

}
