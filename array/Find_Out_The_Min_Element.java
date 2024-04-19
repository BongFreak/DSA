package array;

public class Find_Out_The_Min_Element {

	public static void main(String[] args) 
	{

		int [] arr = {45, 89, 2568, 10006, 564,4582};
		int m = Integer.MAX_VALUE; // suppose 2568
		for(int e: arr) 
		{
			if(e<m) //45<2568 Y
			{
				m = e;
			}
			System.out.println(e);
			System.out.println();
			System.out.println("Checking the min..."+m);
		}
		System.out.println();
		System.out.println("Final min number is...."+m);

	}

}
