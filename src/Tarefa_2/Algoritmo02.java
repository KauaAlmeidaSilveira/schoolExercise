package Tarefa_2;
import javax.swing.JOptionPane;

public class Algoritmo02 {

	public static void main(String[] args) {

		// Desenvolvaumalgoritmoquerecebaabaseealturadeumret�ngulo,calculeemostresua�rea,repita10vezescomvaloresdiferentes.
		
		int x = 0;

		while (x < 10) {

			double B = Double.parseDouble(JOptionPane.showInputDialog("Escreva a base do ret�ngulo: "));

			double H = Double.parseDouble(JOptionPane.showInputDialog("Escreva a altura do ret�ngulo: "));

			double area = B * H;

			JOptionPane.showMessageDialog(null, "Area do Ret�ngulo: " + area);

			x++;

		}

	}

}
