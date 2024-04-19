package pattern;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n) 
		{
			int sp=1;
			while(sp<=n-i+1) 
			{
				System.out.print(sp);
				sp++;
				
			}
			int inc=1;
			while(inc<=i-1) 
			{
				System.out.print("*");
				inc++;
			}
			int de=n+i;
			while(de>=1) 
			{
				System.out.print("*");
				de--;
			}
			int dec=n;
			while(dec>=1) 
			{
				System.out.print(dec);
				dec--;
			}
			
			System.out.println();
			i++;
					
		}



}
}
	  
	
	


