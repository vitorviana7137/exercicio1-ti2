package ex01;
import java.util.*;

public class SomarDoisNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int soma = 0;
		System.out.println("Digite um numero: ");
		num1 = scanner.nextInt();
		System.out.println("Digite um numero: ");
		num2 = scanner.nextInt();
		soma = num1 + num2;
		System.out.println("Soma: " + soma);
		scanner.close();
	}

}
