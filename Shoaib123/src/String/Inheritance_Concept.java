package String;

class Arthmatic{
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
}
class Adder extends Arthmatic{
	public int addAll(int x,int y) {
		return add(x,y);
	}
}
public class Inheritance_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a=new Adder();
		System.out.println("My Super Class name is: "+ a.getClass().getSuperclass().getName());
		System.out.println(a.add(10, 20));
	}

}
