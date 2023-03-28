package ex2;

import java.util.Scanner;

public class Fichariofi {

	Scanner sc = new Scanner(System.in);
	Funcionario[] vet;

	public Fichariofi(Funcionario[] fFilho) {

		vet = fFilho;

	}

	public void criaFilho() {
		int cont = 0;
		int pos;
		System.out.println("Qual funcionário deseja incluir esse filho?");
		pos = Integer.parseInt(sc.nextLine());
		if(vet[pos] == null) {
			System.out.println("Funcionário não existe, digite outro");
		} 
		else {
		while (cont < vet[pos].getFilhos().length && vet[pos].getFilhos()[cont] != null) {
			cont++;
		}
		;
		
		if (cont < vet.length) {

			Filho f = new Filho();
			System.out.println("Cadastrando filho");
			System.out.println("Digite o numero de CPF");
			f.setCpf(sc.nextLine());
			System.out.println("Digite o Nome");
			f.setNome(sc.nextLine());
			System.out.println("Digite o numero da certidão de nascimento");
			f.setNumCertNasc(sc.nextLine());
			System.out.println("Digite a data de nascimento");
			f.setDataNascimento(sc.nextLine());
			;

			vet[pos].getFilhos()[cont] = f;
		
		} else
			System.out.println("Memória cheia");
	}
	}
	
	public boolean verifica(int pos, Funcionario vet[]) {
		int rr = 0;

		if (pos < vet[pos].getFilhos().length || pos >= vet[pos].getFilhos().length) {
			System.out.println("Posição inválida, digite outra");
			rr++;

		} else if (vet[pos].getFilhos() == null) {
			System.out.println("Não existe filho na posição informada");
			rr++;
		}
		if (rr == 0) {
			return true;
		} else
			return false;
	}

	public void alterarFilho() {
		int pos;
		int posfilho;
		System.out.println("Digite a posição do funcionario");
		pos = Integer.parseInt(sc.nextLine());
		System.out.println("Digite a posição do filho que deseja alterar");
		posfilho = Integer.parseInt(sc.nextLine());
		if (verifica(pos, vet)) {

			System.out.println("Alterando filho :");
			System.out.println("Digite o nome do filho :");
			vet[pos].getFilhos()[posfilho].setNome(sc.nextLine());
			;
			System.out.println("Digite a data de nascimento do filho :");
			vet[pos].getFilhos()[posfilho].setDataNascimento(sc.nextLine());
			System.out.println("Digite o CPF do filho :");
			vet[pos].getFilhos()[posfilho].setCpf(sc.nextLine());
			System.out.println("Digite o numero da certidão de nascimento ");
			vet[pos].getFilhos()[posfilho].setNumCertNasc(sc.nextLine());

		}

	}

	public void excluirFilho() {
		int pos;
		int posfilho;
		System.out.println("Digite a posição do funcionário");
		pos = Integer.parseInt(sc.nextLine());
		System.out.println("Digite a posição do filho que deseja excluir");
		posfilho = Integer.parseInt(sc.nextLine());
		if (verifica(pos, vet)) {
			vet[pos].getFilhos()[posfilho] = null;
		}

	}

}
