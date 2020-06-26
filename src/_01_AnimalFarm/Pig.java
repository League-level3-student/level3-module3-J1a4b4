package _01_AnimalFarm;

public class Pig extends Animal{

	@Override
	void makeNoise() {
		System.out.println("Oink, I guess.");
	}

	@Override
	void eat() {
		System.out.println("The pig eats some apples.");
	}

}
