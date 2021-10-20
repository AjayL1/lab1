package lab1;

public class MinimumValue {
	public static int  minValue(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a[0];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,9,8,4,3,2};
		int b[]= {798,3898,2998,4898,423225,90};
		System.out.println("minimum value is "+minValue(a,6));
		System.out.println("minimum value is "+minValue(b,6));
	}

}
