package Array_With_Recursion;

public class Check_Digit {
	public static boolean check (int[] arr,int target)
	  {
	      return check(arr,0,target);

	  }
	  public static boolean check (int[] arr,int idx,int target)
	  {		//base case
	      if(idx==arr.length) return false; // idx pointer sob kota array search kore array er baire jodi chole jay
	      									// then ultimately false hbe bcz tar search complete and kono target element pay ni
	      //self work
	      if(arr[idx] == target) return true;// current index e targeted element a6e ki nei.
	      //recursive work
	      return check(arr,idx+1,target); //idx+1 theke end obdi targeted element check kor6e.

	  }
	public static void main(String[] args) {
		 int[] arr = {12,89,56,72,36,74};
		    int target = 100;
		   System.out.println(check(arr,target));

	}

}
