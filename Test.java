// i apparently forgot how math works when it comes to remainders lol
// so this program was created for my dumbass
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {

		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() / 10 % 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("what is the remainder of " + num1 + " divided " + num2 + "? ");
		
		int answer = input.nextInt();
		
		input.close();
		System.out.println(num1 + " and " + num2 + " having a remainder of " + answer + " is " + (num1 % num2 == answer));
		System.out.println("the actual remainder is " + (num1 % num2));
	}

}
// franyatta