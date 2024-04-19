package forloop;
import java.util.Scanner;
public class TermOfAP {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,no=1; //count = kota Ap number print korte hbe, no = Natural number like,1,2,3,4,5,6
        while(count<n)
        {
            int a = 3*no+2;
            if(a%4!=0)
            {
                System.out.print(a+" ");
                count++;

            }
            no++;
            

        }

	}

}
