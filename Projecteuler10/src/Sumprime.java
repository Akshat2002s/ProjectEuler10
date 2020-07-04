import java.util.*;
public class Sumprime {
	static boolean factor(int i) {
	for(int j=2; j<i; j++) {
		if (i%j==0)
				return false ;
			
		}return true;
}

	public static void main(String[] args) {
		int lim=10;
		int sum=0;
		int temp=2;
		int prime=0;
		boolean ans;
		//System.out.println(ans);
		while(temp<lim) {
			ans= factor(temp);
			if(ans==true) {
				prime=temp;
				sum= sum+prime;
				System.out.println(prime);
			}
			temp++;
		}
		System.out.println(sum);
			
		}
	}	
