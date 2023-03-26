package ExerciciosPoo;

public class Produto {
	
	String console;
	Double chaveiros;
	String jogos;
	String joystick;
	String tabuleiro;
	
	public Produto(String console, Double chaveiros, String jogos, String joystick, String tabuleiro) {
		super();
		this.console = console;
		this.chaveiros = chaveiros;
		this.jogos = jogos;
		this.joystick = joystick;
		this.tabuleiro = tabuleiro;
	}

	public void visualizar() {
		System.out.println("\nConsoles disponiveis na loja: "+console);
		System.out.println("Quantidade de chaveiros decorativos: "+chaveiros);
		System.out.println("Jogos disponiveis na loja: "+jogos);
		System.out.println("Joysticks disponiveis para: "+joystick);
		System.out.println("Tabuleiros de jogos disponis na loja: "+tabuleiro);
	}
	
	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public Double getChaveiros() {
		return chaveiros;
	}

	public void setChaveiros(Double chaveiros) {
		this.chaveiros = chaveiros;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public String getJoystick() {
		return joystick;
	}

	public void setJoystick(String joystick) {
		this.joystick = joystick;
	}

	public String getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	

}
