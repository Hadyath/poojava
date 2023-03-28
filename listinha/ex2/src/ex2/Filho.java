package ex2;

public class Filho {
	
	private String cpf;
	private String nome;
	private String numCertNasc;
	private String dataNascimento;
	
	public Filho(String cpf, String nome, String numCertNasc, String dataNascimento) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.numCertNasc = numCertNasc;
		this.dataNascimento = dataNascimento;
	}
	
	public Filho() {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumCertNasc() {
		return numCertNasc;
	}

	public void setNumCertNasc(String numCertNasc) {
		this.numCertNasc = numCertNasc;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Filho [cpf=" + cpf + ", nome=" + nome + ", numCertNasc=" + numCertNasc + ", dataNascimento="
				+ dataNascimento + "]";
	}
	

}
