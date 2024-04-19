package Array_With_Recursion;
//return First Index if Target is present in array, otw return -1
public class Find_all_Index {
	
	  public static void findAllIdx (int[] arr,int idx,int target)
	  {		//base case
	      if(idx==arr.length) return; 
	      //self work
	      if(arr[idx] == target) System.out.println(idx);;
	      
	      //recursive work
	      findAllIdx(arr,idx+1,target); 

	  }
	public static void main(String[] args) {
		 int[] arr = {1,2,5,2,2,6};
		    int target = 2;
		   findAllIdx(arr,0,target);

	}

}
