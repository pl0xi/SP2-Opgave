public class DieselBil extends Bil{
	private boolean harPartikelFilter;
	private float kmPrL;

	public DieselBil(String regNr, int årgang, int antalDøre, String mærke, String model, boolean harPartikelFilter, float kmPrL) {
		super(regNr, årgang, antalDøre, mærke, model);
		this.harPartikelFilter = harPartikelFilter;
		this.kmPrL = kmPrL;
	}

	@Override
	public double beregnGrønEjerafgift() {
		int afgift = 0;

		if (kmPrL < 5) {
			afgift += 25730;
		} else if (kmPrL >= 5 && kmPrL < 10) {
			afgift += 8270;
		} else if (kmPrL >= 10 && kmPrL < 15) {
			afgift += 4190;
		} else if (kmPrL >= 15 && kmPrL < 20) {
			afgift += 2440;
		} else if (kmPrL >= 20 && kmPrL < 50) {
			afgift += 460;
		}

		if(!harPartikelFilter) {
			afgift += 1000;
		}

		return afgift;
	}

	public boolean isHarPartikelFilter() {
		return harPartikelFilter;
	}

	public void setHarPartikelFilter(boolean harPartikelFilter) {
		this.harPartikelFilter = harPartikelFilter;
	}

	public float getKmPrL() {
		return kmPrL;
	}

	public void setKmPrL(float kmPrL) {
		this.kmPrL = kmPrL;
	}

	@Override
	public String toString() {
		return "DieselBil{" + "harPartikelFilter=" + harPartikelFilter + ", kmPrL=" + kmPrL + '}';
	}
}
