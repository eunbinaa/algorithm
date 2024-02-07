
import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=1;
		int count=0;
		String str=sc.next();
		String[] arr=str.split("");
		String[] arr2=new String[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			arr2[count]=arr[i];			
			count++;
		}		
       for(int i=0; i<arr.length; i++) {
    	   if(!arr[i].equals(arr2[i])) {		
    		   answer=0;
    		   break;
    	   }
       }
       System.out.println(answer);
	}

}
