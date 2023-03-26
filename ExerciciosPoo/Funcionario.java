package ExerciciosPoo;

public class Funcionario {
	
	String nome;
	String CPF;
	String cargo;
	String funcao;
	int anoEntrada;
	
	public Funcionario(String nome, String CPF, String cargo, String funcao, int anoEntrada) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.cargo = cargo;
		this.funcao = funcao;
		this.anoEntrada = anoEntrada;
	}
	
	public void visualizar() {
		System.out.println("\nNome do funcionário: "+nome);
		System.out.println("CPF do funcionário: "+CPF);
		System.out.println("Cargo do funcionário: "+cargo);
		System.out.println("Função do funcionário: "+funcao);
		System.out.println("Ano de contratação do funcionário: "+anoEntrada);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

}
