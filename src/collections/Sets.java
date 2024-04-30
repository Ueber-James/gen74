package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Sets {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        Set<Integer> valores = new HashSet<>();
        
        System.out.println("Digite 10 valores inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            valores.add(valor);
        }
        
        System.out.println("\nElementos da Collection Set:");
        Iterator<Integer> iterator = valores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        scanner.close();
	}

}
