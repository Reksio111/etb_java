package week_6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prime_Numbers {

	public static void main(String[] args) {
		Prime_Numbers tester=new Prime_Numbers();
	
		int [] arr = new int[500];
		for (int i = 0 ; i < arr.length; i++) 
		arr[i]=i;	

		
	
		System.out.println(tester.isPrime(6));
		tester.isPrimeArray(arr);
		
	
	}
	
	boolean isPrime(int n) {

	    //check if n is a multiple of 2 and is not equals to 1
	    if ( n % 2 == 0 || n == 1 ) 
	    	return false;
	    //if not, then just check the odds
	    for( int i=3; i*i<=n; i+=2 ) {
	        if( n % i == 0 )
	            return false;
	    }
	    return true;
	}
	public void isPrimeArray( int[] arr) {
	
		for (int i = 0 ; i < arr.length; i++) {
			if(isPrime(arr[i]))
		System.out.println(arr[i]);	
		}
		
	}
	
}
