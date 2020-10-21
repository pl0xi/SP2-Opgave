abstract public class Bil {
	private int årgang, antalDøre;
	private String mærke, model, regNr;

	public Bil(String regNr, int årgang, int antalDøre, String mærke, String model) {
		this.regNr = regNr;
		this.årgang = årgang;
		this.antalDøre = antalDøre;
		this.mærke = mærke;
		this.model = model;
	}

	abstract public double beregnGrønEjerafgift();

	public String getRegNr() {
		return regNr;
	}

	public void setRegNr(String regNr) {
		this.regNr = regNr;
	}

	public int getÅrgang() {
		return årgang;
	}

	public void setÅrgang(int årgang) {
		this.årgang = årgang;
	}

	public int getAntalDøre() {
		return antalDøre;
	}

	public void setAntalDøre(int antalDøre) {
		this.antalDøre = antalDøre;
	}

	public String getMærke() {
		return mærke;
	}

	public void setMærke(String mærke) {
		this.mærke = mærke;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
