package Tarefa_5;

import javax.swing.JOptionPane;

public class Algoritmo01 {

	public static void main(String[] args) {
		

		double[] vectA = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectB = new double [5];
	
		for ( int i = 0 ; i<=4; i++) {
			
			vectB[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectC = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectC[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectD = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectD[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		double[] vectE = new double [5];
		
		for ( int i = 0 ; i<=4; i++) {
			
			vectE[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		double[] vectSL = new double [5];
		
		vectSL[0] = vectA[0] + vectB[0] + vectC[0] + vectD[0] + vectE[0];
		
		vectSL[1] = vectA[1] + vectB[1] + vectC[1] + vectD[1] + vectE[1];
		
		vectSL[2] = vectA[2] + vectB[2] + vectC[2] + vectD[2] + vectE[2];
		
		vectSL[3] = vectA[3] + vectB[3] + vectC[3] + vectD[3] + vectE[3];
		
		vectSL[4] = vectA[4] + vectB[4] + vectC[4] + vectD[4] + vectE[4];
		
		for(int i = 0; i<=4 ; i++) {
		
			JOptionPane.showMessageDialog(null,"Soma das linhas no vetor SL "+ i +": " + vectSL[i]);
		
		}
	
		double[] vectSC = new double [5];
	
		vectSC[0] = vectA[0] + vectA[1] + vectA[2] + vectA[3] + vectA[4];
		
		vectSC[1] = vectB[0] + vectB[1] + vectB[2] + vectB[3] + vectB[4];
		
		vectSC[2] = vectC[0] + vectC[1] + vectC[2] + vectC[3] + vectC[4];
		
		vectSC[3] = vectD[0] + vectD[1] + vectD[2] + vectD[3] + vectD[4];
		
		vectSC[4] = vectE[0] + vectE[1] + vectE[2] + vectE[3] + vectE[4];
	
	
		
		for(int i = 0; i<=4 ; i++) {
			
			JOptionPane.showMessageDialog(null,"Soma das colunas no vetor SC "+ i +": " + vectSC[i]);
		
		}
	}

}
