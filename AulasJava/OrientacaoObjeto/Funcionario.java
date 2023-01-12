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
