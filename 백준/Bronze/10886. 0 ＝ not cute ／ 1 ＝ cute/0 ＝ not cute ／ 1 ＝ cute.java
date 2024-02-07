
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
	    
		int yes=0;
		int no=0;
		for(int i=0; i<num; i++) {
			int a=sc.nextInt();
			if(a==0) {
				no++;
			}else {
				yes++;
			}
		}
		if(yes>no) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
		
     
       
	}

}
