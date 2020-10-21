public class ElBil extends Bil {
	private float batterikapacitetKWh, maxKm, whPrKm;

	public ElBil(String regNr, int årgang, int antalDøre, String mærke, String model, float batterikapacitetKWh, float maxKm, float whPrKm) {
		super(regNr, årgang, antalDøre, mærke, model);
		this.batterikapacitetKWh = batterikapacitetKWh;
		this.maxKm = maxKm;
		this.whPrKm = whPrKm;
	}

	public double beregnGrønEjerafgift() {
		double kmPrL = 100.0/(whPrKm/91.25);

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

	public float getBatterikapacitetKWh() {
		return batterikapacitetKWh;
	}

	public void setBatterikapacitetKWh(float batterikapacitetKWh) {
		this.batterikapacitetKWh = batterikapacitetKWh;
	}

	public float getMaxKm() {
		return maxKm;
	}

	public void setMaxKm(float maxKm) {
		this.maxKm = maxKm;
	}

	public float getWhPrKm() {
		return whPrKm;
	}

	public void setWhPrKm(float whPrKm) {
		this.whPrKm = whPrKm;
	}

	@Override
	public String toString() {
		return "ElBil{" + "batterikapacitetKWh=" + batterikapacitetKWh + ", maxKm=" + maxKm + ", whPrKm=" + whPrKm + '}';
	}
}
