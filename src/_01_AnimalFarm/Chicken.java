package _01_AnimalFarm;

public class Chicken extends Animal{

	@Override
	void makeNoise() {
		System.out.println("Cluck");
	}

	@Override
	void eat() {
		System.out.println("The chicken eats some McNuggets.  Wait a second...");
	}

}
