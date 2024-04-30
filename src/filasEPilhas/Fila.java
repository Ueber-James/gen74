package filasEPilhas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Fila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<>();
        
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Sair do programa");
            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("\nCliente adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes na Fila:");
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    System.out.println();
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println(clienteChamado + " foi chamado!");
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
