package first_java_program;

public class Variables {
	public static void main(String[] args) {
		
		System.out.println( Byte.MAX_VALUE );
		System.out.println( Byte.MAX_VALUE + 1);
		
		byte byteNumberVariable = Byte.MAX_VALUE;
		byteNumberVariable = (byte) (byteNumberVariable + 1);
		
		System.out.println(byteNumberVariable);
		
		int intNumberVariable;		
		intNumberVariable = 50;
		System.out.println(intNumberVariable);
		
		double doubleNumberVariable = 3.14;
		System.out.println(doubleNumberVariable);
		
		float floatNumberVariable = 3.14F;
		
		byte firstNumber = 100;
		byte secondNumber = 110;
		byte thirdNumber = (byte) (firstNumber + secondNumber);
		System.out.println(thirdNumber);
		
		long hugeNumber = 3_000_000_000l;
		
		boolean yesOrNo = true;
		boolean yesOrNo2 = false;
		
		boolean isGreatThan = 3 > 1 ;
		System.out.println(isGreatThan) ; 
		
		char letter = 'a';
		System.out.println(letter);
		System.out.println(letter+1);
		System.out.println((char)(letter+1));
		
	}
}
