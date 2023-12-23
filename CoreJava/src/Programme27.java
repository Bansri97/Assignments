abstract class Parent{
	abstract void message();
}

class one extends Parent{
	void message() {
		System.out.println("This is first subclass");
	}
}
class second extends Parent{
	void message() {
		System.out.println("this is second subclass");
	}
}
public class Programme27 {

	public static void main(String[] args) {
		one o=new one();
		second s=new second();
		
		o.message();
		s.message();
	}
}
