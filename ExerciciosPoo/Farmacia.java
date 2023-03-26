package ExerciciosPoo;

public class Farmacia {

	String medicamentos;
	String esteticaCosmetica;
	String higieneInfantil;
	String higieneAtulto;
	String bebidas;
	
	public Farmacia(String medicamentos, String esteticaCosmetica, String higieneInfantil, String higieneAtulto,
			String bebidas) {
		super();
		this.medicamentos = medicamentos;
		this.esteticaCosmetica = esteticaCosmetica;
		this.higieneInfantil = higieneInfantil;
		this.higieneAtulto = higieneAtulto;
		this.bebidas = bebidas;
	}

	public void visualizar() {
		System.out.println("\nAlguns medicamentos disponiveis: "+medicamentos);
		System.out.println("Cosmeticos: "+esteticaCosmetica);
		System.out.println("Produtos de higiene infantil: "+higieneInfantil);
		System.out.println("Produtos de higiene adulta: "+higieneAtulto);
		System.out.println("Bebidas disponiveis: "+bebidas);
	}
	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getEsteticaCosmetica() {
		return esteticaCosmetica;
	}

	public void setEsteticaCosmetica(String esteticaCosmetica) {
		this.esteticaCosmetica = esteticaCosmetica;
	}

	public String getHigieneInfantil() {
		return higieneInfantil;
	}

	public void setHigieneInfantil(String higieneInfantil) {
		this.higieneInfantil = higieneInfantil;
	}

	public String getHigieneAtulto() {
		return higieneAtulto;
	}

	public void setHigieneAtulto(String higieneAtulto) {
		this.higieneAtulto = higieneAtulto;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}
	
	
}
