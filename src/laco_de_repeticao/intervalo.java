
import java.util.Scanner;

public class intervalo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Digite o primeiro número do intervalo: ");
	            int num1 = scanner.nextInt();

	            System.out.println("Digite o último número do intervalo: ");
	            int num2 = scanner.nextInt();

	            
	            if (num1 >= num2) {
	                System.out.println("Intervalo inválido!");
	                continue; 
	            }

	            System.out.println("No intervalo entre " + num1 + " e " + num2 + ":");

	            boolean encontrado = false;
	            for (int i = num1; i <= num2; i++) {
	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println(i + " é múltiplo de 3 e 5");
	                    encontrado = true;
	                }
	            }

	            if (!encontrado) {
	                System.out.println("Nenhum múltiplo de 3 e 5 encontrado no intervalo.");
	            }

	            break; 
	        }
	    }
}
