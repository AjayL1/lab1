package lab1;

public class MaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {32,35657,47732,784,4745};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			System.out.println("maximum value is "+max);
		}
	}

}
