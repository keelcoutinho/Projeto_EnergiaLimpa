package ProjetoEnergiaLimpa;


public class Cliente {
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected String numeroInstalacao;
	protected double valorConta;
	protected double kgLixo;
	
	
	public Cliente(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numeroInstalacao = numeroInstalacao;
		this.valorConta = valorConta;
		this.kgLixo = kgLixo;
	}
	

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNumeroInstalacao() {
		return numeroInstalacao;
	}


	public void setNumeroInstalacao(String numeroInstalacao) {
		this.numeroInstalacao = numeroInstalacao;
	}


	public double getValorConta() {
		return valorConta;
	}


	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}


	public double getKgLixo() {
		return kgLixo;
	}


	public void setKgLixo(double kgLixo) {
		this.kgLixo = kgLixo;
	}
	
	
	
	public double pesoLixo(double kgLixo) 
	{
		double peso;
		peso = (kgLixo * 0.75);
		return peso;
	}
	
	
	
}



	
