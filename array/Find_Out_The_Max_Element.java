package array;

public class Find_Out_The_Max_Element {

	public static void main(String[] args) 
	{
		int [] arr = {1, 895, 256, 986, 756};
		int max = Integer.MIN_VALUE;
		for(int e:arr) 
		{
			if(e>max) 
			{
				max = e;
			}
			System.out.println(e);
			System.out.println();
			System.out.println("Checking the max......."+max);
		}
		System.out.println();
		System.out.println("Final Max Number is..."+max);

	}

}
