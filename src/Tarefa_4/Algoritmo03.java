package Tarefa_4;

import javax.swing.JOptionPane;

public class Algoritmo03 {

	public static void main(String[] args) {
		
		double[] vectA = new double [10];
	
		
		for ( int i = 0 ; i<=9; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		int A_par = 0;
		
		for ( int i = 0 ; i<=9; i++) {
			
			if (vectA[i] % 2 == 0) {
				
				A_par = A_par + 1;
				
			}
			
		}	
	
		int A_impar = 10-A_par;
		
		JOptionPane.showMessageDialog(null,"Tem " +A_par+ " numeros pares e " +A_impar+ " numeros impares no vetor A");
		
		double[] vectB = new double [10];
		
		for ( int i = 0 ; i<=9; i++) {
			
			vectB[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		int B_par = 0;
		
		for ( int i = 0 ; i<=9; i++) {
			
			if (vectB[i] % 2 == 0) {
				
				B_par = B_par + 1;
				
			}
			
		}
		
		int B_impar = 10-B_par;
		
		JOptionPane.showMessageDialog(null,"Tem " +B_par+ " numeros pares e " +B_impar+ " numeros impares no vetor B");	
		
		

	}

}
