import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int b=0; b<(2*N-1)-N-i; b++){
				System.out.print(" ");
					
			}
			
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
						
			System.out.println();
		}
		
	for(int i=1; i<N; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int b=0; b<(2*N)-2*i-1; b++){
				System.out.print("*");
					
			}
			
			System.out.println();
		}
		
	}

}
