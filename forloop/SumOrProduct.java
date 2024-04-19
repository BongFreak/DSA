package forloop;
import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) 
	{{
		 Scanner sc= new Scanner(System.in);
		 int n = sc.nextInt();//input number
		 int c = sc.nextInt();//input choice
		 int sum=0,pro=1;
		 if(c==1)
		 {
			 for(int i =0;i<=n;i++)
			 {
				 sum=sum+i;
			 }
			 System.out.print(sum);
		 }
        if(c==2)
        {
            for(int i=1;i<=n;i++)
            {
                pro=pro*i;
            }
            System.out.print(pro);
			 
        }
        if(c>2)
        {
            System.out.print("-1");
        }
		

	}
		

	}

}
