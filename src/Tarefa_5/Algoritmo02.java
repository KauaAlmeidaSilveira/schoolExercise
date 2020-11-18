package Tarefa_5;

import javax.swing.JOptionPane;

public class Algoritmo02 {

	public static void main(String[] args) {
		
		
		double[] vectA1 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectA1[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectB1 = new double [5];
	
		for ( int i = 0 ; i<=4; i++) {
			
			vectB1[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectC1 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectC1[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectD1 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectD1[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		double[] vectE1 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectE1[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		
		
		//FIM MATRIZ 1
		
		
		
		double[] vectA2 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectA2[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectB2 = new double [5];
	
		for ( int i = 0 ; i<=4; i++) {
			
			vectB2[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectC2 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectC2[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectD2 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectD2[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		double[] vectE2 = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectE2[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}

		
		//FIM MATRIZ 2
	
		
		
		double[] vectA3 = new double [5];
		
	
		double[] vectB3 = new double [5];
	
	
		double[] vectC3 = new double [5];
		
	
		double[] vectD3 = new double [5];
		
		
		double[] vectE3 = new double [5];
		
		
	
		
		//FIM MATRIZ 3
		
		
		for (int i = 0 ; i<=4 ; i++) {
		
			vectA3[i] = vectA1[i] * vectA2[i];

			vectB3[i] = vectB1[i] * vectB2[i];

			vectC3[i] = vectC1[i] * vectC2[i];

			vectD3[i] = vectD1[i] * vectD2[i];

			vectE3[i] = vectE1[i] * vectE2[i];
		
		}
	
	
			
			for(int i = 0; i<=4 ; i++) {
				
				JOptionPane.showMessageDialog(null,"Matriz A vezes matriz B: Linha 1, Coluna "+ i +": " + vectA3[i]);
				
				JOptionPane.showMessageDialog(null,"Matriz A vezes matriz B: Linha 2, Coluna "+ i +": " + vectB3[i]);
				
				JOptionPane.showMessageDialog(null,"Matriz A vezes matriz B: Linha 3, Coluna "+ i +": " + vectC3[i]);
				
				JOptionPane.showMessageDialog(null,"Matriz A vezes matriz B: Linha 4, Coluna "+ i +": " + vectD3[i]);
				
				JOptionPane.showMessageDialog(null,"Matriz A vezes matriz B: Linha 5, Coluna "+ i +": " + vectE3[i]);
			}
		
	
	
	}

}
