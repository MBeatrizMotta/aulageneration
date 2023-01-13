package POO;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	public Pessoa(String nome, String endereco, String cpf, int telefone, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	

	public Pessoa() {
		super();
		
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void validarCpf() {
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		}
		else
		{
			System.out.println("\n--CPF Válido!!!");
		}
	}
		
		package POO;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado(String nome,String endereco,String cpf,int telefone,int idade,
			int codigoSetor,float salarioBase,float imposto) {
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+
				"\nTelefone: "+getTelefone()+"\nEndereço:"+getEndereco()+"\nCódigo do setor: "+codigoSetor+
				"\nSalário base: "+salarioBase+"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+imposto);
		
	}
	
	public void calcularSalario() {
		double salario_total = salarioBase - (salarioBase *(imposto/100));
		System.out.println("\nO salário líquido a ser recebido pelo empregado "+getNome()+" é igual a: "+salario_total);
	}

}