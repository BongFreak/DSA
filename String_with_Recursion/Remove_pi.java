package String_with_Recursion;

public class Remove_pi {
	public static String replace(String s){
        //base case
		if(s.length()<=1) return s;
		
		//recursive work
        if(s.charAt(0)=='p' && s.charAt(1)=='i') { //1st r 2nd character jdi 'p' and 'i' hoy then 
        										   //'p''i' er jaygay 3.14 boshbe and next part e recursion call hbe
        	return "3.14" + replace (s.substring(2));// self work
        }
        else {
        return s.charAt(0)+replace(s.substring(1));// self work
        											//jdi 1st character p na hoy 
        											//then oi character ta print hbe + next part e recursion call hbe.
        }
	}
	public static void main(String[] args) {
		System.out.println(replace("xpipix"));

	}

}
