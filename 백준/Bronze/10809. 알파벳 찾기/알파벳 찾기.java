

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String s=sc.next();
		String[] str= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] num=new int[str.length];
		for(int i=0; i<num.length; i++) {
			num[i]=-1;
			
		}
		
			for(int j=0; j<s.length(); j++) {
				for(int i=0; i<str.length; i++) {
				if(num[i]!=-1) {
					continue;
				}
				if(str[i].equals(String.valueOf(s.charAt(j)))){
					num[i]=j;			
					break;
				}
			}
		}
		for(int i : num) {
			System.out.println(i);
			
		}
	}

}
