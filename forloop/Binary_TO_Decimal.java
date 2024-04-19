package forloop;
import java.util.Scanner;
public class Binary_TO_Decimal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal=Integer.parseInt(binary,2);
        System.out.println(decimal);

	}

}
