package _01_AnimalFarm;

public class Sheep extends Animal{

	@Override
	void makeNoise() {
		System.out.println("Baaaaaaaa");
	}

	@Override
	void eat() {
		System.out.println("The sheep eats some grass.");
	}

}
