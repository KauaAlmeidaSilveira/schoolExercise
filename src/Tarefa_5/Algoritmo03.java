package Tarefa_5;

import javax.swing.JOptionPane;

public class Algoritmo03 {

	public static void main(String[] args) {
		
	
		double[] vectA = new double [6];
		
		for ( int i = 0 ; i<=5; i++) {
			
			vectA[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectB = new double [6];
	
		for ( int i = 0 ; i<=5; i++) {
			
			vectB[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectC = new double [6];
		
		for ( int i = 0 ; i<=5; i++) {
			
			vectC[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		double[] vectD = new double [6];
		
		for ( int i = 0 ; i<=5; i++) {
			
			vectD[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
		
		double[] vectE = new double [6];
		
		for ( int i = 0 ; i<=5; i++) {
			
			vectE[i] = Double.parseDouble(JOptionPane.showInputDialog("Escreva o numero " + i +":" ));
			
		}
	
		int par = 0;
		
		double vlr = 0;
		
		for (int i = 0 ; i<=5 ; i++) {
			
			if((vectA[i]  % 2) == 0)  
			{
				vlr = vlr + vectA[i];
				par = par + 1; 
			} 
		}
	
		for (int i = 0 ; i<=5 ; i++) {
			
			if((vectB[i]  % 2) == 0)  
			{
				vlr = vlr + vectB[i];
				par = par + 1; 
			} 
		}
	
		for (int i = 0 ; i<=5 ; i++) {
			
			if((vectC[i]  % 2) == 0)  
			{ 
				vlr = vlr + vectC[i];
				par = par + 1; 
			} 
		}
	
	
		for (int i = 0 ; i<=5 ; i++) {
			
			if((vectD[i]  % 2) == 0)  
			{
				vlr = vlr + vectD[i];
				par = par + 1; 
			} 
		}
	
		for (int i = 0 ; i<=5 ; i++) {
			
			if((vectE[i]  % 2) == 0)  
			{
				vlr = vlr + vectE[i];
				par = par + 1; 
			} 
		}
	 
		JOptionPane.showMessageDialog(null,"Quantidade de pares: "+ par + " Soma dos pares: "+ vlr + " Média dos pares: "+ vlr/par);
		
		
	}

}
