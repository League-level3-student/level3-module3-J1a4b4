package _01_AnimalFarm;

public class Cow extends Animal{

	@Override
	void makeNoise() {
		System.out.println("Moooo");
	}

	@Override
	void eat() {
		System.out.println("The cow eats some hay.");
	}

}
