package Tarefa_1;
import javax.swing.JOptionPane;
public class Algoritmo03 {
		public static void main (String args []) {
			
	double vlr, vlra,vlrd;		
		
         vlr = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do teclado: "));
         vlra = vlr + (vlr*0.1);
         vlrd = vlr - (vlr*0.1);
         
    JOptionPane.showMessageDialog(null," Valor com reajuste de 10%:  " + vlra);
    JOptionPane.showMessageDialog(null," Valor com desconto de 10%:  " + vlrd);
               			
		}

}
