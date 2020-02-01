/* Reverse encryption
 * Take the digits and seperate them similarly to encryption
 * Swap them to get them to the right spot
 * Digits 0-2 become 7-9 while 3-9 become 0-6
 * 		Pattern forms where domain exists between 0-9 so seperate the cases with Ifs
 * Return finished digits*/

public class Decrypter {

	public static int decrypt(int digit) {
		int a, b, c, d, temp;
		//Seperate the digits
		a = digit/1000; //Thousands
		b = (digit/100)%10;//Hundred
		c = (digit/10)%10%10;//Tens
		d = digit%10;//Unit
		//Swap step using Temp when needed
		temp = a;
		a = c;
		c = temp;
		temp = b;
		b = d;
		d = temp;
		//Math steps, Seperate cases where the domain can split
		if (a >= 7)
			a -=7;
		else
			a += 3;

		if (b >= 7)
			b -=7;
		else
			b += 3;

		if (c >= 7)
			c -=7;
		else
			c += 3;
		
		if (d >= 7)
			d -=7;
		else
			d += 3;
		//return digit
		digit = a*1000+b*100+c*10+d;
		return digit;		
	}
}
