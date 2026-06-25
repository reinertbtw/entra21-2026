package Lista2;
import java.util.Scanner;
public class Lista2 {
	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		//exercicio10();
		//exercicio11();
		//exercicio12();
		//exercicio13();
		//exercicio14();
		//exercicio15();
		//exercicio16();
		//exercicio17();
		//exercicio18();
		//exercicio19();
		//exercicio20();
	}
	// Nível Básico: 
	static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}
		sc.close();
	}
	static void exercicio2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int x = sc.nextInt();
		
		System.out.println("Numero 2: ");
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.println(x + " é maior");
		} else {
			System.out.println(y + " é maior");
		}
		sc.close();
	}
	static void exercicio3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("Positivo");
		} else if (x < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Igual a 0");
		}
		sc.close();
	}
	static void exercicio4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		int x = sc.nextInt();
		
		if (x >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		sc.close();
	}
	static void exercicio5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade: ");
		int x = sc.nextInt();
		
		if (x >= 16) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Nao pode votar");
		}
		sc.close();
	}
	// Nível Intermediário: 
	static void exercicio6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int x = sc.nextInt();
		System.out.println("Numero 2: ");
		int y = sc.nextInt();
		System.out.println("Numero 3: ");
		int z = sc.nextInt();
		
		if (x > y && x > z) {
			System.out.println("O numero 1 é o maior");
		} else if ( x < y && y > z) {
			System.out.println("O numero 2 é o maior");
		} else {
			System.out.println("O numero 3 é o maior");
		}
		sc.close();
	}
	static void exercicio7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		int x = sc.nextInt();
		
		if (x <= 4) {
			System.out.println("Insuficiente");
		} else if (x <= 6) {
			System.out.println("Regular");
		} else if (x <= 8) {
			System.out.println("Bom");
		} else {
			System.out.println("Excelente");
		}
		sc.close();
	}
	static void exercicio8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lado 1: ");
		int x = sc.nextInt();
		System.out.println("Lado 2: ");
		int y = sc.nextInt();
		System.out.println("Lado 3: ");
		int z = sc.nextInt();
		
		if (x + y > z && x + z > y && y + z > x) {
			System.out.println("Forma um triangulo");
		} else {
			System.out.println("Nao forma um triangulo");
		}
		sc.close();
	}
	static void exercicio9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lado 1: ");
		int x = sc.nextInt();
		System.out.println("Lado 2: ");
		int y = sc.nextInt();
		System.out.println("Lado 3: ");
		int z = sc.nextInt();
		
		if (x == y && x == z) {
			System.out.println("Equilatero");
		} else if (x == y && x != z) {
			System.out.println("Isoceles");
		} else {
			System.out.println("Escaleno");
		}
		sc.close();
	}
	static void exercicio10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		String usuario1 = sc.nextLine();
		System.out.println("Senha: ");
		String senha1 = sc.nextLine();
		
		String usuario = "Lucas";
		String senha = "1611";
		
		if (usuario1.equals(usuario) && senha1.equals(senha)) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
		sc.close();
	}
	// Nível Avançado:
	static void exercicio11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) | ano % 400 == 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("Ano não é bissexto");
		}
		sc.close();
	}
	static void exercicio12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int x = sc.nextInt();
		System.out.println("Numero 2: ");
		int y = sc.nextInt();
		System.out.println("Operação: ");
		char z = sc.next().charAt(0);
		
		if (z == '+') {
			System.out.println(x + y);
		} else if (z == '-') {
			System.out.println(x - y);
		} else if (z == '*') {
			System.out.println(x * y);
		} else if (z == '/') {
			System.out.println(x / y);
		}
		sc.close();
	}
	static void exercicio13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salário: ");
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000) {
			imposto = 0;
		} else if (salario <= 3000) {
			imposto = (salario * 0.10);
		} else if (salario <= 5000) {
			imposto = (salario * 0.15);
		} else {
			imposto = (salario * 0.20);
		}
		double salarioLiquido = (salario - imposto);
		
		System.out.println("Imposto R$: " + imposto);
		System.out.println("Salario liquido: " + salarioLiquido);
		
		sc.close();
	}
	static void exercicio14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor da compra:");
		double valor = sc.nextDouble();
		double desconto;
		
		if (valor < 100) {
			desconto = 0;
		} else if (valor <=500) {
			desconto = (valor * 0.10);
		} else {
			desconto = (valor * 0.20);
		}
		
		double valorDesconto = (valor - desconto);
		System.out.println("O valor com desconto = " + valorDesconto);
		
		sc.close();
	}
	static void exercicio15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
	
		if (idade <= 12) {
			System.out.println("Você é uma Criança");
		} else if (idade <= 17) {
			System.out.println("Você é um Adolescente");
		} else if (idade <= 59) {
			System.out.println("Você é um Adulto");
		} else {
			System.out.println("Voce é um Idoso");
		}
		sc.close();
	}
	// Nível Desafio:
	static void exercicio16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double x = sc.nextDouble();
		System.out.println("Nota 2: ");
		double y = sc.nextDouble();
		System.out.println("Nota 3; ");
		double z = sc.nextDouble();
		
		double media = ((x + y + z)/3);
		System.out.println("Média: " + media);
		
		if (media <= 5) {
			System.out.println("Você foi Reprovado");
		} else if (media <= 6.9) {
			System.out.println("Você esta de Recuperação");
		} else {
			System.out.println("Você foi Aprovado!");
		}
		sc.close();
	}
	static void exercicio17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		double salario = sc.nextDouble();
		System.out.println("Informe o valor da parcela: ");
		double parcela = sc.nextDouble();
		double limite = (salario * 0.30);
		
		if (parcela <= limite) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Negado");
		}
		sc.close();
	}
	static void exercicio18() {
		Scanner sc = new Scanner(System.in);
		
		int numero = 8;
		System.out.println("Adivinhe o numero:");
		int resposta = sc.nextInt();
		
		if (resposta < numero) {
			System.out.println("Menor");
		} else if (resposta > numero) {
			System.out.println("Maior");
		} else {
			System.out.println("Acertou");
		}
		sc.close();
	}
	static void exercicio19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		double imc = (peso / (altura * altura));
		System.out.println("Seu IMC é: " + imc);
		
		if (imc <= 18.4) {
			System.out.println("Abaixo do Peso");
		} else if (imc <=24.9) {
			System.out.println("Peso Normal");
		} else if (imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}
		sc.close();
	}
	static void exercicio20() {
		  Scanner sc = new Scanner(System.in);
		  
		  String usuario = "Lucasd";
		  String senha = "2709";
		  int tentativas = 0;
		  
		  while (tentativas < 3) {
			  System.out.println("Informe usuario: ");
			  String usuario1 = sc.nextLine();
			  System.out.println("Informe senha: ");
			  String senha1 = sc.nextLine();
			  
			  if (usuario1.equals(usuario) && senha1.equals(senha)) {
				  System.out.println("Acesso autorizado!");
				  return;
			  } else {
				  tentativas ++;
				  System.out.println("Negado, tentativas restantes: " + (3 - tentativas));
			  }
			  sc.close();
		  }
		  System.out.println("Acesso bloqueado. Muitas tentativas");
	}
}
