package MeusProjetos;

import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("informe o primeiro salario: ");
		String valor1 = entrada.next().replaceAll(",", ".");
		
		System.out.print("informe o segundo salario: ");
		String valor2 = entrada.next().replaceAll(",", ".");
		
		System.out.print("informe o terceiro salario: ");
		String valor3 = entrada.next().replaceAll(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.println("A media dos salarios é: " + media);
		
		entrada.close();
	}
}
