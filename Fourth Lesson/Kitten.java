
public class Kitten {
	public Kitten() {
	}
	
	int kittenAge;
	
	public Kitten(String name) {
		System.out.println("Name of kitten: " + name);
	}
	
	public void setAge(int age) {
		kittenAge = age;
	}
	
	public int getAge() {
		System.out.println("Kitten's age is " + kittenAge);
		return kittenAge;
	}
	
	public static void main(String[] args) {
		Kitten myKitten = new Kitten("Travis");
		myKitten.setAge(19);
		myKitten.getAge();
		Puppy myPuppy2 = new Puppy("Joe");
		myPuppy2.setAge(91);
		myPuppy2.getAge();
	}
}
