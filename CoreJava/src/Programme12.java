
public class Programme12 {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4};  
	        int sum = 0;   
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        double average=sum/arr.length;
	        System.out.println("Average value of element is : "+average);  
	    }  
	
	}

