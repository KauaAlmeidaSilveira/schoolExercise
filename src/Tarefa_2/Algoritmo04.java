package Tarefa_2;
import javax.swing.JOptionPane;

public class Algoritmo04 {

	public static void main(String[] args) {

		    int y = 0;
		    String senha;
			String x = "kaua";
			
			while (y < 3) 
			{
				senha = JOptionPane.showInputDialog(null, "Digite a senha: ");

				//if (x == senha) esse n�o funcionou pode me explicar o pq, por favor?
				if (x == senha.intern()) //achei esse na net, mas n�o sei qual a fun��o de .intern()
				{
					JOptionPane.showMessageDialog(null, "Senha correta");
					break;
			    }
				
			y++;
			}
	}

}
