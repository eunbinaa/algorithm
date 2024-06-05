import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0;
		int answer=0;
        
		for(int i=num; i<=num2; i++) {
			if(i==1) {
				continue;
			}
			for(int j=2; j<i; j++) {
				if(i!=1 && i%j==0) {
					sum++;
				}
				
			}
			if(sum==0) {
				list.add(i);
				answer+=i;
			}
			sum=0;
		}
		if(list.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(answer);
			System.out.println(list.get(0));
		}
	 
	 
	}
}