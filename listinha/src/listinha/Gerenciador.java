package listinha;

import java.util.Scanner;

public class Gerenciador {
	Scanner sc = new Scanner(System.in);
	

	Cliente[] vet;

	public Gerenciador(Cliente vCliente[]) {

		vet = vCliente;

	}



	public void criaPessoa() {

		int cont = 0;
		while (cont <= vet.length && vet[cont] != null) {

			cont++;

		}
		;

		if (cont < vet.length) {
			Cliente c = new Cliente();

			System.out.println("Cadastrando pessoa");
			System.out.println("Digite o nome");
			c.setNome(sc.nextLine());
			System.out.println("Digite a idade");
			c.setIdade(Integer.parseInt(sc.nextLine()));

			vet[cont] = c;

		} else {
			System.out.println("Memória cheia");
		}

	}

	public void listarPessoa() {
		for (int i = 0; i <= vet.length; i++) {
			imprimir(vet[i]);
			System.out.println("---------------");
		}

	}

	public void imprimir(Cliente c) {

		System.out.println("Nome : " + c.getNome());
		System.out.println("Idade : " + c.getIdade());

	}
	
	
	public void listarReverso() {
		for(int i = 10; i >= vet.length; i--) {
			imprimir(vet[i]);
			
		}
		
		
		
	}

}
