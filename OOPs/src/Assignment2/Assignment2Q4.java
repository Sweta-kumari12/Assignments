package Assignment2;
abstract class petanimal{
	
}
 abstract class animal{
	public abstract void sound();
}
class Dog extends animal{

	@Override
	public void sound() {
		System.out.println("Barking");
	}
	
}
class Lion extends animal{

	@Override
	public void sound() {
		System.out.println("Roaring");
		
	}
	
}
public class Assignment2Q4 {
	public static void main(String[] args) {
		Dog d=new Dog();
		Lion l=new Lion();
		d.sound();
		l.sound();
		
	}

}
