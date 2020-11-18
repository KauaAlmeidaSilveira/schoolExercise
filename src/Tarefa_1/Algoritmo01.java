package Tarefa_1;
import javax.swing.JOptionPane;
public class Algoritmo01 {
		public static void main (String args []) {
		
	double cf;
		 
		cf = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Fábrica: "));
		cf = cf + (cf * 0.28) + (cf * 0.45);
        
	JOptionPane.showMessageDialog (null,"O valor total é: " + cf);
		
		
		}
        
}

