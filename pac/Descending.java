package Com.pac;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {32,54,21,6547,21,84,12,4,65,321,5,54,0,01,23,66};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
			System.out.println(" "+a[i]);
		}
	}

}
