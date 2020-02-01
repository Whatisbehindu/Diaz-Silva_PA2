/* Instance variable is an int value
 * Constructor can be set to default as a new number will be placed in
 * Do math (7+ int digit divided by 10 and use remainder)'
 * 			Use division to seperate each digit since known 4 digits
 * Swap all the numbers
 * Return final int*/
public class Encrypter {
	
	public static int encrypt(int digit) {
		int a, b, c, d, temp;
		//Seperate the digits
		a = digit/1000; //Thousands
		b = (digit/100)%10;//Hundred
		c = (digit/10)%10%10;//Tens
		d = digit%10;//Unit
		//Math steps
		a = (a+7)%10;
		b = (b+7)%10;
		c = (c+7)%10;
		d = (d+7)%10;
		//Swap step using Temp when needed
		temp = a;
		a = c;
		c = temp;
		temp = b;
		b = d;
		d = temp;
		//return digit
		digit = a*1000+b*100+c*10+d;
		return digit;
	}
}
