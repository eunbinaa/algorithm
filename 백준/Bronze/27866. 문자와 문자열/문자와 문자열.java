import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받기   
		String st=br.readLine(); //입력받은 걸 변수에 저장
		int N=Integer.parseInt(br.readLine())-1; //숫자 입력받아서 -1하여 저장(인덱스 0 부터 시작하므로)
		System.out.println(st.charAt(N)); //charAt으로 N번째 글자 출력
	}

}
