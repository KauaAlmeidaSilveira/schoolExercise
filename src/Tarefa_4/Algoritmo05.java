package Tarefa_4;

import javax.swing.JOptionPane;

public class Algoritmo05 {

	public static void main(String[] args) {
		
		double[] vectA = new double [3];
		
		for ( int i = 0 ; i<=2; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectB = new double [3];
	
		for ( int i = 0 ; i<=2; i++) {
			
			vectB[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectC = new double [3];
		
		for ( int i = 0 ; i<=2; i++) {
			
			vectC[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double somaDiag1 = vectA[0] + vectB[1] + vectC[2];
		
		JOptionPane.showMessageDialog(null,"a soma dos elementos da diagonal principal: "+ somaDiag1);
		
		double somaDiag2 = vectA[2] + vectB[1] + vectC[0];
	
		JOptionPane.showMessageDialog(null,"a soma dos elementos da diagonal secundária: "+ somaDiag2);
		
		double somaElem1 = vectA[1] + vectB[1] + vectC[1];
		
		JOptionPane.showMessageDialog(null,"a soma dos elementos da linha 2: "+ somaElem1);
		
		double somaElem2 = vectC[0] + vectC[1] + vectC[2];
		
		JOptionPane.showMessageDialog(null,"a soma dos elementos da coluna 3: "+ somaElem2);
		
		double vezesColun2 = vectB[0] * vectB[1] * vectB[2];

		JOptionPane.showMessageDialog(null,"a multiplicação dos elementos da coluna 2: "+ vezesColun2);
		
		double vezesLinha3 = vectA[2] * vectB[2] * vectC[2];
		
		JOptionPane.showMessageDialog(null,"a multiplicação dos elementos da linha 3: "+ vezesLinha3);
		
		double somaTotal = vectA[0]+vectA[1]+vectA[2]+vectB[0]+vectB[1]+vectB[2]+vectC[0]+vectC[1]+vectC[2];
		
		JOptionPane.showMessageDialog(null,"a soma de todos os elementos: "+ somaTotal);
		
		double vezesTotal = vectA[0] * vectA[1] * vectA[2] * vectB[0] * vectB[1] * vectB[2] * vectC[0] * vectC[1] * vectC[2];
	
		JOptionPane.showMessageDialog(null,"a multiplicação de todos os elementos: "+ vezesTotal);
	}

}








