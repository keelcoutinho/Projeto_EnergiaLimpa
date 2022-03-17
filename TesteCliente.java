package ProjetoEnergiaLimpa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteCliente {
	
	public static void main (String[] args) {	
		
		
				 
		
		Scanner scan = new Scanner(System.in);
		
		
		int verifica = 0;
		double novoValor = 0;
		String cpf = null, cnpj = null;
		int tipoPessoa;

				
		do
		{			
			JOptionPane.showMessageDialog(null,
					"\n Olá, Bem vindo ao programa: \n Energia, um Ciclo Responsável!");
				try

				{
					
					System.out.println("\n\n Informe o tipo de cliente: "
									 + "\n 1 - Pessoa Física"
									 + "\n 2 - Pessoa Jurídica");
					tipoPessoa = scan.nextInt();

					
					while(tipoPessoa > 2)
					{
						System.err.println("\n Opção inválida!\n");
						System.out.println("\n Informe novamente o tipo de cliente: "
										 + "\n 1 - Pessoa Física"
										 + "\n 2 - Pessoa Jurídica");
						tipoPessoa = scan.nextInt();
					}
					if (tipoPessoa == 1)
					{
						System.out.println("\n Informe o CPF do cliente: ");
						cpf = scan.next();
						
						for(int i = 0; i < cpf.length(); i++)
						{
							Character num = cpf.charAt(i);
							if (Character.isLetter(num))
							{
								throw new Exception();
							}
						}
					}
					else if (tipoPessoa == 2)
					{
						System.out.println("\n Informe o CNPJ do cliente: ");
						cnpj = scan.next();
						
						for(int i = 0; i < cnpj.length(); i++)
						{
							Character num = cnpj.charAt(i);
							if (Character.isLetter(num))
							{
								throw new Exception();
							}
						}
					}
					else
					{
						System.err.println("\n Opção inválida!");
						break;
					}

					
					System.out.println("\n Nome do cliente: ");
					scan.nextLine();
					String nome = scan.nextLine();
				
					for(int i = 0; i < nome.length(); i++)
					{
						Character letra = nome.charAt(i);
						if (Character.isDigit(letra))
						{
							throw new Exception();
						}
					}
			
					
					System.out.println("\n Informe o número de telefone: ");
					String telefone = scan.nextLine();
				
					for(int i = 0; i < telefone.length(); i++)
					{
						Character num = telefone.charAt(i);
						if (Character.isLetter(num))
						{
							throw new Exception();
						}
					}
					
					
					System.out.println("\n Informe o endereço: ");
					String endereco = scan.nextLine();
					
					
					System.out.println("\n Informe o número de Instalação: ");
					String numeroInstalacao = scan.nextLine();
					
					
					System.out.println("\n Informe o valor da fatura atual: ");
					double valorConta = scan.nextDouble();
			
					
					System.out.println("\n Informe a renda mensal do cliente: ");
					float renda = scan.nextFloat();
			
					
					System.out.println("\n Informe o peso do lixo Orgânico: ");
					double kgLixo = scan.nextDouble();
			
					
					Fisica fisica = new Fisica (nome, telefone, endereco, 
												numeroInstalacao, valorConta, kgLixo, cpf, renda);
			
					Juridica juridica = new Juridica (nome, telefone, endereco, 
												numeroInstalacao, valorConta, kgLixo, cnpj, renda);
					
					
					switch (tipoPessoa)
					{
					case 1:
						if(renda <= 1212)
						{
							novoValor = fisica.reducaoValor() - (fisica.reducaoValor()*0.05);
						}
						else
						{
							novoValor = fisica.reducaoValor();
						}
						break;
				
					case 2:
						novoValor = juridica.reducaoValor();
						break;
				
					default:
						System.out.print("\n Opção inválida!");
					}
					
					System.out.println("\nSelecione uma região para realizar a entrega do lixo: " + 
							"\n 1 - Zona Sul"
						  + "\n 2 - Zona Norte" 
						  + "\n 3 - Zona Leste" 
						  + "\n 4 - Zona Oeste");
					int regiao = scan.nextInt();
					
					
					while(regiao > 4)
					{
						System.err.println("\n Opção inválida!");
						System.out.println("\nSelecione novamente uma região para realizar a entrega do lixo: " + 
								"\n 1 - Zona Sul"
							  + "\n 2 - Zona Norte" 
							  + "\n 3 - Zona Leste" 
							  + "\n 4 - Zona Oeste");
						regiao = scan.nextInt();
					}
			
						
						System.out.print("\n--------------------------------------------------------------------------------\n");
						System.out.println("\n PONTOS DE COLETA NA SUA REGIÃO: ");
						
						if(regiao == 4)
						{
							List<String> ZonaOeste = new ArrayList<String>();
				
							ZonaOeste.add("\n Zona Oeste: ");
							ZonaOeste.add("\n\n Rua Roberto Bosch, n. 242 ");
							ZonaOeste.add("\n Rua Agrestina, n. 189");
							ZonaOeste.add("\n Rua Sales Gomes, n. 415");
							ZonaOeste.add("\n Praça. do Cancioneiro, n. 15");
				
							for (String oeste : ZonaOeste)
							{
								System.out.print(oeste);
							}
						}
				
						if(regiao == 3)
						{
							List<String> ZonaLeste = new ArrayList<String>();
					
							ZonaLeste.add("\n Zona Leste: ");
							ZonaLeste.add("\n\n Rua Manuel Alves da Rocha, n. 584");
							ZonaLeste.add("\n Av. Osvaldo Valle Cordeiro, n. 420");
							ZonaLeste.add("\n Rua Acácio Antunes, n. 89");
							ZonaLeste.add("\n Av. Aricanduva, n. 200");
					
							for (String leste : ZonaLeste)
							{
								System.out.print(leste);
							}
						}
					
						if(regiao == 2)
						{
							List<String> ZonaNorte = new ArrayList<String>();
						
							ZonaNorte.add("\n Zona Norte: ");
							ZonaNorte.add("\n\n Rua José Bernardo Pinto, n. 1480");
							ZonaNorte.add("\n Rua Eduardo Vicente Nasser, n. 519");
							ZonaNorte.add("\n Avenida Paulo Lincoln do Valle Pontin, n. 550");
							ZonaNorte.add("\n Rua Itaiquara, n. 237");
						
							for (String norte : ZonaNorte)
							{
								System.out.print(norte);
							}
						}
				
						if(regiao == 1)
						{
							List<String> ZonaSul = new ArrayList<String>();
							
							ZonaSul.add("\n Zona Sul: ");
							ZonaSul.add("\n\n Estrada do Alvarenga, n. 2475");
							ZonaSul.add("\n Rua Tereza Cristina, n. 10");
							ZonaSul.add("\n Av. Casemiro da Rocha, n. 1220");
							ZonaSul.add("\n Rua Mary Baida Salem, n. 01");
							
							for (String sul : ZonaSul)
							{
								System.out.print(sul);
							}
						}
						
						if(regiao>4)
						{
							System.err.println("\n Opção inválida!");
						}
						

			
					
					if (tipoPessoa == 1)
					{if(renda <=1212) {
						System.out.print("\n\n--------------------------------------------------------------------------------");
						fisica.imprimirInfo();
						System.out.print("\n Cliente de baixa renda, elegível para Desconto Social de mais 5%.");
						System.out.printf("\n\n RESULTADO: ");
						System.out.printf("\n\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", fisica.pesoLixo(kgLixo));
						System.out.printf("\n O novo valor da fatura de energia será de: R$%2.2f", novoValor);
						
					}else {
						System.out.print("\n\n--------------------------------------------------------------------------------");
						fisica.imprimirInfo();
						System.out.printf("\n\n RESULTADO: ");
						System.out.printf("\n\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", fisica.pesoLixo(kgLixo));
						System.out.printf("\n O novo valor da fatura de energia será de: R$%2.2f", novoValor);
					}}
					
					else if (tipoPessoa == 2)
					{
						System.out.print("\n\n--------------------------------------------------------------------------------");
						juridica.imprimirInfo();
						System.out.printf("\n\n RESULTADO: ");
						System.out.printf("\n\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", juridica.pesoLixo(kgLixo));
						System.out.printf("\n O novo valor da fatura de energia foi de: R$%2.2f", novoValor);
					}
			
						System.out.print("\n\n--------------------------------------------------------------------------------\n");
						System.out.println("\n Deseja inserir um novo cliente?"
										 + "\n 1 - Sim"
										 + "\n 2 - Não");
						verifica = scan.nextInt();
				}
				
				
				catch (Exception e)
				{
					System.err.println("\n Exception: "+e
									  +"\n"	
							          +"\n Campo preechindo incorretamente!!!"
									  +"\n Para o campo 'cpf' ou 'cnpj' é válido somente caracteres numéricos, por exemplo: 54321."
									  +"\n Para o campo 'nome' é válido somente caracteres alfabéticos, por exemplo: Maria."
									  +"\n Para o campo 'telefone' é válido somente caracteres numéricos, por exemplo: 12345.");



				}
			

		}
		while(verifica !=2);
		
		JOptionPane.showMessageDialog(null,
				"\n Obrigado por usar nosso programa!! \n Até a próxima!");
		System.exit(0);
	}
	
}
