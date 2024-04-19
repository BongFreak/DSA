//Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
//Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
//For the given input, 
//552245
//the even digits are 2, 2 and 4 and if we take the sum of these digits it will come out to be 8(2 + 2 + 4) and similarly, 
//if we look at the odd digits, they are, 5, 5 and 5 which makes a sum of 15(5 + 5 + 5). 
//Hence the answer would be, 8(evenSum) <single space> 15(oddSum)

package fundamentals;
import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
        int n;
        n = sc.nextInt();
        int digit;
        int ev=0,odd=0;
        while(n>0)
        {
            digit=n%10;
            n=n/10;
            if(digit%2!=0) 
            {
                odd=odd+digit;
            }
            else 
            {
                ev=ev+digit;
            }
        }
      System.out.print(ev+" "+odd);  
	}


	}


