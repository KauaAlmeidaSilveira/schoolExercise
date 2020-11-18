package Tarefa_3;

import javax.swing.JOptionPane;

public class Algoritmo03 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de latas que deseja calcular a area externa: "));
		
		for (int i = 1; i<=x; i++) {
			
			double r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
			
			double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

			double pi = 3.14;
			
			double ab = pi*Math.pow(r, 2);
		
			double al = 2*pi*r*h;
		
			double at = 2*ab + al;
		
			JOptionPane.showMessageDialog(null, "Valor da area esxterna é de: "+ at);
		
		}
		
		
		
	}

}
