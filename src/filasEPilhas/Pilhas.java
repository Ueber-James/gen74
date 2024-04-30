package filasEPilhas;

import java.util.Scanner;
import java.util.Stack;

public class Pilhas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();
        
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair do programa");
            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nLivro adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Livros na Pilha:");
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    System.out.println();
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println(livroRetirado + " foi retirado da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
	}

}
