package tyss.practice1;

 abstract class A21 {
	abstract public void demo();

	public A21() {
		super();
	}
	
}
/*abstract*/ class AbstClass1 extends A21{
	public static void main(String[] args) {
		AbstClass1 a = new AbstClass1();
		a.demo();
	}

	@Override
	public void demo() {
		System.out.println("hello");
	}
}
 //"ABSTRACT method" --> ABSTRACT class
 //"INHERITING" from ABSTRACT class --> ABSTRACT class (OR)"OVERRIDE" the abstract method of abstract class
 // ABSTRACT class can have CONSTRUCTOR