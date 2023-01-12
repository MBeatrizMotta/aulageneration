package Atividade3;



public class Automovel {
	
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	public Automovel() {
		super();
	}

		public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public void imprimirInfo() {
		
		System.out.println("\nNome: "+nomeProprietario+" possui um automóvel "+modelo+" com placa: "+placa+" e ano: "+ano);
	}

		
	
	
	
	
	

}


//segundo exercicio

package Atividade3;



public class Funcionario {
	
	private String nome; 
	private String cargo;
	private int idade;
	private float salario;
	private int bancoHoras;

	 

	public Funcionario(String nome, String cargo, int idade, float salario, int bancoHoras) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.bancoHoras = bancoHoras;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}
	
	 public void vizualizar() {
		System.out.println("Nome da contratada: " +getNome());
		 
		System.out.println("Cargo da contratada: " +getCargo());
		
		System.out.println("Idade da contratada: " +getidade());
		
		System.out.println("Salario da contratada: " +getSalario());
		
		System.out.println("Horas semanais: " +getBancoHoras());
		
	 }




}		
