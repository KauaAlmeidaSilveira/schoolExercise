package Tarefa_3;
import javax.swing.JOptionPane;
public class Algoritmo01 {

	public static void main(String[] args) {
		

		for(int i = 1; i<=5; i++) {
			
			
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do a: "));
			
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do b: "));	
		
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do c: "));
		
		double delta = (b*b)-4*a*c;
		
		double bhaskara = (b*-1 + Math.sqrt(delta))/2*a;
		
		double bhaskara2 = (b*-1 - Math.sqrt(delta))/2*a;
		
		JOptionPane.showMessageDialog(null, "Valor x1: "+ bhaskara +" Valor x2: "+ bhaskara2);
		
		}
		
		
		
		
		
		
		
	}

}
