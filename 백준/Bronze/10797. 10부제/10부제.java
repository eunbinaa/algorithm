import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		int count=0;
		int car[]=new int[5];
		for(int i=0; i<5; i++) {
			car[i]=sc.nextInt();
		}
        for(int k=0; k<5; k++) {
        	if(car[k]==day) {
        		count+=1;
        	}
       
        }
        System.out.println(count);
	}

}
