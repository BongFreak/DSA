package Array_With_Recursion;
//return First Index if Target is present in array, otw return -1
public class Find_First_Index {
	public static int findIdx (int[] arr,int target)
	  {
	      return findIdx(arr,0,target);

	  }
	  public static int findIdx (int[] arr,int idx,int target)
	  {		//base case
	      if(idx==arr.length) return -1; // idx pointer sob kota array search kore array er baire jodi chole jay
	      									// then ultimately false hbe bcz tar search complete and kono target element pay ni
	      //self work
	      if(arr[idx] == target) return idx;// current index e targeted element a6e ki nei.
	      
	      //recursive work
	      return findIdx(arr,idx+1,target); //idx+1 theke end obdi targeted element check kor6e.

	  }
	public static void main(String[] args) {
		 int[] arr = {12,89,56,72,36,74};
		    int target = 72;
		   System.out.println(findIdx(arr,target));

	}

}
