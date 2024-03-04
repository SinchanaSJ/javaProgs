package pattern;

import strings.OverrideMethod1;

public class OverrideMethod2 extends OverrideMethod1{

	public void test() {
		int a=20;
		System.out.println("OverrideMethod2");
		System.out.println(super.a);
		super.test();
	}
	public static void main(String[] args) {
		OverrideMethod2 m=new OverrideMethod2();
		m.test();
	}
}

