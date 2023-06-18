package myPkg;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1231,rev=0;
		int rem; 
		int cnum=num;
		while(num != 0)
		{
			rem = num%10;
			
			rev = rev * 10 + rem;
			
			num = num/10;
		}	
		System.out.println("rev="+rev);	
			
			boolean b;
			b=(cnum==rev);
			System.out.println(b);
			
			
	}

}
