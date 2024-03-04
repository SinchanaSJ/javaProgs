package tyss.practice1;

public class IncrementingSpaceAdditionToEachCharacter {

	public static void main(String[] args) {
        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            for (int j = -1; j < i; j++) {
                System.out.print(" ");
            }
//            if (i < s.length() - 1) {
//                System.out.print(" ");
//            }
        }
    }
}
