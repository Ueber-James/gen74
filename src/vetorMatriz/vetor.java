package vetoresMatriz;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Inicialização do vetor com 10 números inteiros
        int[] vetor = {5, 12, 8, 23, 7, 16, 9, 4, 11, 20};

        System.out.println("Digite o número a ser pesquisado no vetor:");

        // Leitura do número a ser pesquisado
        int numero = scanner.nextInt();

        // Variável para armazenar a posição do número no vetor
        int posicao = -1;

        // Percorre o vetor para procurar o número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break; // Sai do loop se o número for encontrado
            }
        }

        // Exibe o resultado da pesquisa
        if (posicao != -1) {
            System.out.println("O número " + numero + " está na posição " + posicao + " do vetor.");
        } else {
            System.out.println("Não foi encontrado!");
        }

	}

}
