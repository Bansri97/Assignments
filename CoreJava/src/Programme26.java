public class Programme26 {

	 public static int findSecondLargest(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("Array should have at least two elements");
	            return -1; 
	        }

	        int firstLargest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > firstLargest) {
	                secondLargest = firstLargest;
	                firstLargest = num;
	            } else if (num > secondLargest && num != firstLargest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 8, 15};
	        
	        int secondLargest = findSecondLargest(arr);

	        if (secondLargest != -1) {
	            System.out.println("Second largest element is: " + secondLargest);
	        }
	    }
}
