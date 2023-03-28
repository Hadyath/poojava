package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario[] = new Funcionario[2];
		Fichariofu fichariofu = new Fichariofu(funcionario);
		Fichariofi fichariofi = new Fichariofi(funcionario);
		Scanner sc = new Scanner(System.in);

		int op = 0;
		int op1 = 0;
		int op2 = 0;

		do {
			System.out.println("1 - Menu funcionario");
			System.out.println("2 - Menu filho");
			System.out.println("3 - Sair");

			op = Integer.parseInt(sc.nextLine());
			switch (op) {

			case 1:
				do {
					System.out.println("1 - Cadastro de funcionario");
					System.out.println("2 - Alterar funcionario");
					System.out.println("3 - Exlucir funcionario");
					System.out.println("4 - Consultar funcionario");
					System.out.println("5 - Relatório dos funcionarios");
					System.out.println("6 - Sair");
					op1 = Integer.parseInt(sc.nextLine());
					switch (op1) {

					case 1:
						fichariofu.criaFuncionario();
						break;
					case 2:
						fichariofu.alterarFuncionario();
						break;
					case 3:
						fichariofu.excluirFuncionario();
						break;
					case 4:
						fichariofu.consultarFuncionario();
						break;
					case 5:
						fichariofu.listarFuncionario();
						break;
					case 6:
						System.out.println("Saindo do menu de funcionários");
						break;
					default:
						System.out.println("Opção inválida");

					}

				} while (op1 != 6);

				break;
			case 2:
				do {
					
					System.out.println("1 - Cadastro de filho");
					System.out.println("2 - Alterar filho");
					System.out.println("3 - Exlucir filho");
					System.out.println("4 - Sair");
					op2 = Integer.parseInt(sc.nextLine());
					
					switch(op2) {
					 

					case 1:
						fichariofi.criaFilho();
						break;
					case 2:
						fichariofi.alterarFilho();
						break;
					case 3:
						fichariofi.excluirFilho();
						break;
					case 4:
						System.out.println("Saindo do menu de filhos");
						break;
					default:
						System.out.println("Opção inválida");
					}
					
					
				}while(op2 != 4);
				break;
			case 3:
				System.out.println("Encerrando o programa");
				break;
			default:
				System.out.println("Opção inválida");

			}

		} while (op != 3);
		sc.close();
	}

}
