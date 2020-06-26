package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		List<Animal> farm = new ArrayList<Animal>();
		Cow cowI = new Cow();
		Cow cowII = new Cow();
		Pig pigI = new Pig();
		Pig pigII = new Pig();
		Sheep sheep = new Sheep();
		Chicken chicken = new Chicken();
		farm.add(cowI);
		farm.add(cowII);
		farm.add(pigI);
		farm.add(pigII);
		farm.add(sheep);
		farm.add(chicken);
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}

}
