
public class PetNursery {
	public void describeAnimals() {
		Puppy p1 = new Puppy("Allen");
		System.out.println(p1.getClass());
		p1.setAge(15);
		p1.getAge();
		System.out.println();
		Kitten k1 = new Kitten("Yasha");
		System.out.println(k1.getClass());
		k1.setAge(9);
		k1.getAge();
	}
	
	public static void main(String[] args) {
		PetNursery nursery = new PetNursery();
		nursery.describeAnimals();
	}
}
