package Tarefa_2;
import javax.swing.JOptionPane;
public class Algoritmo01 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo que leia 10 medidas diferentes em centímetros e apresente quantos metros,decímetros e milímetros há nesta medida.
		
		int x = 0;
		
		do {
		
		double medidaCm = Double.parseDouble(JOptionPane.showInputDialog("Escreva uma medida em cm: "));
		
		double metros = medidaCm/100;
		
		double decimetro = medidaCm/10;
		
		double milimetro = medidaCm*10;
		
		JOptionPane.showMessageDialog(null,"Em metros: "+ metros);
	
		JOptionPane.showMessageDialog(null,"Em decímetros: "+ decimetro);
	 
		JOptionPane.showMessageDialog(null,"Em milímetros: "+ milimetro);
		
		x++;
	
		}while(x<10);
	
	
	}

}
