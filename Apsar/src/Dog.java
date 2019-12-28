
public class Dog extends Animal  {
	
	void eat()
	{
		System.out.println(super.name+"   "+"is eating");
		super.eat();
	}
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
	}

}
