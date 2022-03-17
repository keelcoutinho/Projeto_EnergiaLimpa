package ProjetoEnergiaLimpa;

public class Fisica extends Cliente implements Interface{
	
	private String cpf;
	private float renda;
	
	
	public Fisica(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo, String cpf, float renda) 
	{
		super(nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		this.cpf = cpf;
		this.renda = renda;
	}
	
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public float getRenda() {
		return renda;
	}


	public void setRenda(float renda) {
		this.renda = renda;
	}
	
	
	@Override
	public double reducaoValor()
	{
		getKgLixo();
		double desconto = valorConta - pesoLixo(kgLixo);
		return desconto;
	}

	// Desconto para pessoa física com até um salário mínimo
	public double reducaoValor2() {
		double desconto = (valorConta - pesoLixo(kgLixo)) - (valorConta - pesoLixo(kgLixo))*0.05;
		return desconto;
	}


	@Override
	public void imprimirInfo() 
	{
		System.out.print("\n\n--------------------------------------------------------------------------------");
		System.out.printf("\n"
				+ "\n DADOS DO CLIENTE: "
				+ "\n\n Cliente: %s"
				+ "\n Telefone: %s"
				+ "\n Endereço: %s"
				+ "\n Número de Instalação: %s"
				+ "\n Valor da fatura: R$%2.2f"
				+ "\n Peso mensal do lixo: %2.0fkg",
				nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		System.out.printf("\n\n RESULTADO: ");
		System.out.printf("\n\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", pesoLixo(kgLixo));
		System.out.printf("\n O novo valor da fatura de energia será de: R$%2.2f", reducaoValor());

		
	}
	
	// Pessoa física com até um salário mínimo
	public void imprimirInfo2() {
		System.out.print("\n\n--------------------------------------------------------------------------------");
		System.out.printf("\n"
				+ "\n DADOS DO CLIENTE: "
				+ "\n\n Cliente: %s"
				+ "\n Telefone: %s"
				+ "\n Endereço: %s"
				+ "\n Número de Instalação: %s"
				+ "\n Valor da fatura: R$%2.2f"
				+ "\n Peso mensal do lixo: %2.0fkg",
				nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		System.out.printf("\n\n RESULTADO: ");
		System.out.printf("\n\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", pesoLixo(kgLixo));
		System.out.printf("\n O novo valor da fatura de energia será de: R$%2.2f",reducaoValor2());
		
	}
	
	

}
