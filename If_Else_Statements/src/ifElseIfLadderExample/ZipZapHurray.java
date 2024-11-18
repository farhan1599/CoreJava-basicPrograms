/*
 * This program is for the following
 * If a given number is divisible by 3 then display "Zip"
 * If a given number is divisible by 5 then display "Zap"
 * If a given number is divisible by 3 and 5 then display "Hurray"
 * Otherwise, display "Done"
 */
package ifElseIfLadderExample;

import java.util.Scanner;

public class ZipZapHurray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println("hurray !");
		}
		else if (num%3==0) {
			System.out.println("zip");
		}
		else if (num%5==0) {
			System.out.println("zap");
			
		}
		else {
			System.out.println("done");
		}
		
	}

}
