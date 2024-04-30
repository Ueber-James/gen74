
import java.util.Scanner;

public class idade {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int idade;
	        int menoresDe21 = 0;
	        int maioresDe50 = 0;

	        System.out.println("Digite as idades das pessoas (digite uma idade negativa para encerrar):");

	        while (true) {
	            System.out.print("Idade: ");
	            idade = scanner.nextInt();

	            // Verifica se a idade é negativa para encerrar a leitura dos dados
	            if (idade < 0) {
	                break;
	            }

	            // Verifica se a idade é menor que 21 anos
	            if (idade < 21) {
	                menoresDe21++;
	            }

	            // Verifica se a idade é maior que 50 anos
	            if (idade > 50) {
	                maioresDe50++;
	            }
	        }

	        System.out.println("Total de pessoas com menos de 21 anos: " + menoresDe21);
	        System.out.println("Total de pessoas com mais de 50 anos: " + maioresDe50);
	    }

}
