package Tarefa_2;
import javax.swing.JOptionPane;

public class Algoritmo02 {

	public static void main(String[] args) {

		// Desenvolvaumalgoritmoquerecebaabaseealturadeumretângulo,calculeemostresuaárea,repita10vezescomvaloresdiferentes.
		
		int x = 0;

		while (x < 10) {

			double B = Double.parseDouble(JOptionPane.showInputDialog("Escreva a base do retângulo: "));

			double H = Double.parseDouble(JOptionPane.showInputDialog("Escreva a altura do retângulo: "));

			double area = B * H;

			JOptionPane.showMessageDialog(null, "Area do Retângulo: " + area);

			x++;

		}

	}

}
