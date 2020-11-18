package Tarefa_1;
import javax.swing.JOptionPane;
public class Algoritmo02 {
		public static void main (String args []) {
				
	double SF, VTV, NCV, VPCV, VLRTOTAL;
				
		NCV = Float.parseFloat(JOptionPane.showInputDialog("Número de carros que foram vendidos: "));  		
		VTV = Float.parseFloat(JOptionPane.showInputDialog("Valor total vendido: "));		
		SF = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));	
		VPCV = Float.parseFloat(JOptionPane.showInputDialog("Valor recebido por carro vendido: "));
		VLRTOTAL = SF + (VTV*0.05) + (NCV*VPCV);
			                

	JOptionPane.showMessageDialog(null," o resultado é: " + VLRTOTAL);
			 
	
		}

}