package functions;

public class Fahrenheit_To_Celsius 
{ 
	public static void printFahrenheitTable(int start, int end,int step)
	{
		for(int f= start;f<=end;f+=step)
		{
			int c= ((f-32)*5)/9;
        
			System.out.println(f+" "+c);
		}
	}
	

	public static void main(String[] args) 
	{
		 printFahrenheitTable(0, 100, 20);
	        
		

	}

}
