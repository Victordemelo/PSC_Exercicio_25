
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PSC_Exercicio_25 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidade = 2;
        int vetor[] = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:" + i));
        }

        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma = soma + vetor[i];
        }

        double media = soma / quantidade;
        JOptionPane.showInputDialog(null, "A soma é: " + soma + "\nA média é: " + media);
    }
}
