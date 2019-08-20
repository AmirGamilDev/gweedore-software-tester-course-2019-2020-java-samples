package ie.nln.softwaretester.userinput;

public class InputTest {

	public static void main(String[] args) {
		
		String firstName = UserInputUtil.getString();
		String lastName = UserInputUtil.getString();
		int age = UserInputUtil.getNumber();
		String otherString = UserInputUtil.getString();
		int anotherNumber = UserInputUtil.getNumber();
		
		System.out.println(firstName + " " + lastName + " " + age + " " + otherString);
		System.out.println(anotherNumber);
	}
}
