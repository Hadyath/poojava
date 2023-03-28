package ex2;

import java.util.Scanner;

public class Fichariofu {

	Scanner sc = new Scanner(System.in);
	Funcionario[] vet;

	public Fichariofu(Funcionario[] vFuncionario) {
		vet = vFuncionario;

	}

	public void criaFuncionario() {

		int cont = 0;

		while (cont < vet.length && vet[cont] != null) {
			cont++;

		}
		;

		if (cont < vet.length) {
			Funcionario f = new Funcionario();
			System.out.println("Cadastrando funcionário :");
			System.out.println("Digite o cpf do funcionário :");
			f.setCpf(sc.nextLine());
			System.out.println("Digite o nome do funcionário :");
			f.setNome(sc.nextLine());
			System.out.println("Digite o salário do funcionário :");
			f.setSalario(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o numero de indentidade do funcionário: ");
			f.setIdentidade(sc.nextLine());

			vet[cont] = f;
		}else
			System.out.println("Memória cheia");
		
	      

	}

	public void excluirFuncionario() {
		int pos;
		System.out.println("Digite a posição do funcionário que deseja excluir");
		pos = Integer.parseInt(sc.nextLine());
		if (verifica(pos, vet)) {
			vet[pos] = null;
		}

	}

	public void consultarFuncionario() {
		int pos;
		System.out.println("Digite a posição do funcionário que deseja consultar");
		pos = Integer.parseInt(sc.nextLine());
		if(verifica(pos, vet)) {
		System.out.println(vet[pos]);
		}
	}
	
			
	
	public void listarFuncionario() {
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
			System.out.println("----------------------------");
		}
		
		
	}
	
	public void alterarFuncionario() {
		int pos;
		System.out.println("Digite a posição do funcionário que deseja alterar");
		pos = Integer.parseInt(sc.nextLine());
		if(verifica(pos, vet)) {
			
			System.out.println("Cadastrando funcionário :");
			System.out.println("Digite o cpf do funcionário :");
			vet[pos].setCpf(sc.nextLine());
			System.out.println("Digite o nome do funcionário :");
			vet[pos].setNome(sc.nextLine());
			System.out.println("Digite o salário do funcionário :");
			vet[pos].setSalario(sc.nextFloat());
			System.out.println("Digite o numero de indentidade do funcionário: ");
			vet[pos].setIdentidade(sc.nextLine());
			
		}
		
		
	}

	public boolean verifica(int pos, Funcionario vet[]) {
		int rr = 0;

		if (pos < vet.length || pos >= vet.length) {
			System.out.println("Posição inválida, digite outra");
			rr++;

		} else if (vet[pos] == null) {
			System.out.println("Não existe funcionario na posição informada");
			rr++;
		}
		if (rr == 0) {
			return true;
		} else
			return false;

	}
	

}