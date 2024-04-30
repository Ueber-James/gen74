package vetoresMatriz;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Inicialização da matriz 3x3
        int[][] matriz = new int[3][3];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibição da Diagonal Principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Exibição da Diagonal Secundária
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }

        // Soma dos elementos da Diagonal Principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("\n\nSoma dos elementos da Diagonal Principal: " + somaDiagonalPrincipal);

        // Soma de todos os elementos da matriz
        int somaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + somaTotal);
    

	}

}
