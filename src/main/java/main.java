import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {
	private static Garage garage1 = new Garage();
	public static void main(String[] args) {
		Bil car1 = new BenzinBil("BD 21 422", 2011, 5, "Audi", "RS6", 19, 95);
		Bil car2 = new DieselBil("AB 57 723", 2019, 5, "BMW", "320D", true, 24);
		Bil car3 = new ElBil("CC 11 823", 2020, 5, "Tesla", "Model 3", 75, 580, 160);

		garage1.addCar(car1);
		garage1.addCar(car2);
		garage1.addCar(car3);

		System.out.println(garage1);
		System.out.println("Samlet afgift: " + garage1.beregnGrønAfgiftForBilpark());
	}

	@Override
	public void start(Stage primaryStage) {

	}
}
