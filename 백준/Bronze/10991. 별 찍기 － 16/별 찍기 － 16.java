import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			for(int k=1; k<N-i; k++) {				
				System.out.print(" ");				
			}
			for(int j=0; j<2*i+1; j++) {	
				if(j%2!=0) {
					System.out.print(" ");	
				}else {
					System.out.print("*");	
				}
							
			}
			
			System.out.println();
		}

	}

}
