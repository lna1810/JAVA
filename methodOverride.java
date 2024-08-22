
class Animal {
	public void display() {
		System.out.println("It is a dog");
	}
}
class dog extends Animal {
	public void display() {
		System.out.println("it is a golden dog");
	}
}
public class methodOverride {
	public static void main (String[] args) {
		dog d1 = new dog();
		d1.display();
	}

}
