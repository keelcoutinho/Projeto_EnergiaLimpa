package ProjetoEnergiaLimpa;

public class Juridica extends Cliente implements Interface{

	private String cnpj;
	private float renda;
	
	public Juridica(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo, String cnpj, float renda) {
		super(nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		this.cnpj = cnpj;
		this.renda = renda;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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


	@Override
	public void imprimirInfo() 
	{
		System.out.printf("\n"
				+ "\n DADOS DO CLIENTE: "
				+ "\n\n Cliente: %s"
				+ "\n Telefone: %s"
				+ "\n Endereço: %s"
				+ "\n Número de Instalação: %s"
				+ "\n Valor da fatura: R$%2.2f"
				+ "\n Peso mensal do lixo: %2.0fkg",
				nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);

		
	}
	
	
}