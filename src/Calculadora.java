import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo à Calculadora! ");
		
		System.out.print("Digite o primeiro número ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Digite o operador (+, -, *, /) ");
		char operador = scanner.next().charAt(0);
		
		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		
		double resultado = 0;
		
		switch (operador) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			if (num2!= 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("Erro: Divisão por zero não é permitada! ");
				return;
			}
			break;
		default:
			System.out.println("Operador inválido!");
			return;
		}
		
		System.out.println("O resultado é: " + resultado);
	}

}
