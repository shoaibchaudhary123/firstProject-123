package Set;

class Animal{
	public void fly() {
		System.out.println("I am flying");
	}
}
class bird extends Animal{
	public void Singing() {
		System.out.println("I am Singing");
		fly();
	}
}
public class InheritancePart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird ob=new bird();
		ob.Singing();
	}

}
