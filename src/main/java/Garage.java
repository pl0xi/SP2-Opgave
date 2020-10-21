import java.util.ArrayList;

public class Garage {
	private ArrayList<Bil> biler = new ArrayList<Bil>();
	private String garageName;

	public void addCar(Bil bil) {
		biler.add(bil);
	}

	public double beregnGrønAfgiftForBilpark() {
		double samletAfgift = 0;

		for(Bil bil:biler) {
			samletAfgift += bil.beregnGrønEjerafgift();
		}

		return samletAfgift;
	}

	// UPDATE?
	@Override
	public String toString() {
		String txt = "";
		for(Bil bil:biler) {
			txt += bil.getMærke() + ", " + bil.getModel() + ", " + bil.getÅrgang() + "\n";
		}
		return "Garage:\n"  + txt;
	}
}
