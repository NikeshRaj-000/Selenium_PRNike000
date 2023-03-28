package Com.pac;

public class Arrays_prac0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = new int [10];
    a[0]=13;
    a[1]=14;
    a[2]=15;
    a[3]=16;
    a[4]=17;
    a[1]=18;
    a[6]=19;
    a[7]=20;
    a[5]=21;
    a[9]=24;
    
    System.out.println(a.length);
    System.out.println();
    System.out.println(a[1]);
    System.out.println();
    for (int i = 0; i< a.length; i++) {
    	
    	 System.out.println(a[i]);

    }     
	}
}
