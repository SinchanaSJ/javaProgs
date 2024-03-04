package tyss.collections;

public class RemoveMultipleSpaceWithSingleSpace {

	public static void main(String[] args) {
		String s="hchdc   iugcgdc ihsdch   iodhciodc   oihlk";
		String st=s.replaceAll("\\s+"," ");
		System.out.print(st);
	}

}
