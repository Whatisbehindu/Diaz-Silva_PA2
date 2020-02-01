/* Data transfered as 4 digits.
 * Application will accept 4-numbered digit entered by user
 * This will pass through Encrypter class
 * 			Encrypter will add 7 and divide by 10 and replace each digit with remainder.
 * 			Swap first digit with third
 * 			Swap second digit with fourth
 * 			Returns encrypted number
 * Print encrypted number in main
 * Encrypted value will be decrypted in decrypt class
 * 			Encryption process is reversed
 * Print decrypted number in main*/
	
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		int data;
		System.out.println("Insert data numbers below");
		
		Scanner input = new Scanner(System.in);
		data = input.nextInt();
				
		data = Encrypter.encrypt(data);
		
		System.out.println("Encrypted data:");
		//If ensures the 0s will print as well
		if (data/1000 == 0) {
			System.out.printf("0");
			System.out.printf("%d\n", data);
		}
		else
			System.out.printf("%d\n", data);
		
		data = Decrypter.decrypt(data);
		
		System.out.println("Decrypted data:");
		//If ensures the 0s will print as well
		if (data/1000 == 0) {
			System.out.printf("0");
			System.out.printf("%d\n", data);
		}
		else
			System.out.printf("%d\n", data);
		
	}

}
