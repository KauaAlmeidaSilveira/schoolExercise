package Tarefa_2;
import javax.swing.JOptionPane;

public class Algoritmo03 {

	public static void main(String[] args) {

		// Crieumalgoritmoquereceba4notasbimestrais,de7alunosdiferentes,calculeeapresenteamédiaanualdecadaaluno.

		int x = 0;

		while (x < 7) {
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua nota do primeiro bimestre: "));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua nota do segundo bimestre: "));
			double n3 = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua nota do terceiro bimestre: "));
			double n4 = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua nota do quarto bimestre: "));

			double media = n1 + n2 + n3 + n4 / 4;

			JOptionPane.showMessageDialog(null, "Media dos Bimestres: " + media);
			
			x++;

		}

	}

}
