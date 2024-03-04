package collection.list;

public class EncapsDriver {

	public static void main(String[] args) {
		EncpasulationExample e1 = new EncpasulationExample("ABC",10);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		e1.setId(20);
		e1.setName("XYZ");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
	}

}
