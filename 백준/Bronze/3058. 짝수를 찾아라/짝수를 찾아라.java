import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		int[]array=new int[7];
		String[] a =new String[7];
		int sum=0;
		int small=0;
		for(int i=0; i<num; i++) {
			String s=br.readLine();
			a=s.split(" ");
			for(int j=0; j<7; j++) {
				array[j]=Integer.parseInt(a[j]);
				if(array[j]%2==0) {
					sum+=array[j];
				}
			}
			Arrays.sort(array);
			for(int j=0; j<array.length; j++) {
				if(array[j]%2==0) {
					small=array[j];
					break;
				}
			}
			sb.append(sum+" "+small+'\n');
			sum=0;
			small=0;
		}
	System.out.println(sb.toString());
	}
}