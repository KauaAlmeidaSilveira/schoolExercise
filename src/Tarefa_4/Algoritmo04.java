package Tarefa_4;

import javax.swing.JOptionPane;

public class Algoritmo04 {

	public static void main(String[] args) {
		
		double[] vectA = new double [15];
		
		double[] vectB = new double [15];
		
		for ( int i = 0 ; i<=14; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}

		for ( int i = 0 ; i<=14; i++) {
			
			vectB[i] = vectA[i]*vectA[i];
			
		}
	
		JOptionPane.showMessageDialog(null,"Valores do vetor B");
		
		for ( int i = 0 ; i<=14; i++) {
			
			JOptionPane.showMessageDialog(null,"O valor da posição " +i+ " é:" + vectB[i]);
			
		}
	
	
	
	}

}
