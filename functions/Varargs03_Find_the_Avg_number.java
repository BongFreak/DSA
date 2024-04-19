package functions;

public class Varargs03_Find_the_Avg_number 
{
	public static int avg(int...arr) 
	{
		int l = arr.length;
		int sum = 0;
		for(int e:arr) 
		{
			sum += e;
		}
		return sum/l;
	}

	public static void main(String[] args) 
	{
		System.out.println(avg(1,2,3,4,10));
		System.out.println(avg(1,2,3,4));
		System.out.println(avg(1,2,3,4,10,20));
	}

}
