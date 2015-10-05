
public class HelloWorld {

	public static void main(String[] args) {

		String mystring = "12234-";

		String aStr[] = mystring.split("-");
		
		if(aStr.length > 1)

			System.out.println(aStr[0] + "  :: " + aStr[1]);
		else
			System.out.println(aStr[0]);

	}
}
