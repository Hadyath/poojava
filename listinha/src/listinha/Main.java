package listinha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente[] cliente = new Cliente[10];
		Gerenciador gerenciador = new Gerenciador(cliente);
		Scanner sc = new Scanner(System.in);
		int op = 0;

		do {

			System.out.println("1 para cadastrar");
			System.out.println("2 para listar");
			System.out.println("3 para sair");

			op = Integer.parseInt(sc.nextLine());

			switch (op) {

			case 1:
				gerenciador.criaPessoa();
				break;
			case 2:
				gerenciador.listarReverso();
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while (op != 3);

	}
}