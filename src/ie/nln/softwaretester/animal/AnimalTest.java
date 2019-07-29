package ie.nln.softwaretester.animal;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Leo", "White");
		Dog dog1 = new Dog("Lassie", "Brown & White");
		Bird bird1 = new Bird("TweetyPie", "Yellow");
		
		cat1.sleep();
		cat1.speak();
		
		dog1.sleep();
		dog1.speak();
		
		bird1.sleep();
		bird1.speak();
		bird1.fly();
		
		Animal cat2 = new Cat("Philomena", "Black");
		Animal dog2 = new Dog("Fido", "Grey");
		Animal bird2 = new Bird("Lucy", "Blue");
		
		cat2.sleep();
		cat2.speak();
		
		dog2.sleep();
		dog2.speak();
		
		bird2.sleep();
		bird2.speak();
		
		if(bird2 instanceof Bird) {
			Bird actualBird = (Bird) bird2;
			actualBird.fly();
			
			((Bird)bird2).fly();
		}
		
		makeAnimalSpeak(cat2);
		makeAnimalSpeak(dog1);
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(dog1);
		animals.add(cat1);
		animals.add(bird1);
		animals.add(dog2);
		animals.add(cat2);
		animals.add(bird2);
		
		for(Animal animal : animals) {
			animal.speak();
		}
		
	}
	
	private static void makeAnimalSpeak(Animal animal) {
		animal.speak();
	}
}
