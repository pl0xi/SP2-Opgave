public class BenzinBil extends Bil{
	private float kmPrL;
	private int oktanTal;

	public BenzinBil(String regNr, int årgang, int antalDøre, String mærke, String model, float kmPrL, int oktanTal) {
		super(regNr, årgang, antalDøre, mærke, model);
		this.kmPrL = kmPrL;
		this.oktanTal = oktanTal;
	}

	@Override
	public double beregnGrønEjerafgift() {
		if (kmPrL < 5) {
			return 10470;
		} else if (kmPrL >= 5 && kmPrL < 10) {
			return 5500;
		} else if (kmPrL >= 10 && kmPrL < 15) {
			return 2340;
		} else if (kmPrL >= 15 && kmPrL < 20) {
			return 1050;
		} else if (kmPrL >= 20 && kmPrL < 50) {
			return 330;
		}

		return 0;
	}

	public float getKmPrL() {
		return kmPrL;
	}

	public void setKmPrL(float kmPrL) {
		this.kmPrL = kmPrL;
	}

	public int getOktanTal() {
		return oktanTal;
	}

	public void setOktanTal(int oktanTal) {
		this.oktanTal = oktanTal;
	}

	@Override
	public String toString() {
		return "BenzinBil{" + "kmPrL=" + kmPrL + ", oktanTal=" + oktanTal + '}';
	}
}
