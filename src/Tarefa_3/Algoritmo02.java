package Tarefa_3;
import javax.swing.JOptionPane;

public class Algoritmo02 {

	public static void main(String[] args) {
		

		for(int i=1;i<=10;i++) {
			
			double r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));	
			
			double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
			
			double pi = 3;
			
			double volume = pi* Math.pow(r, 2)*h;
			
			JOptionPane.showMessageDialog(null, "O volume da circunferencia é de : "+ volume);
			
		}
		
		
		
		
		
	}

}
