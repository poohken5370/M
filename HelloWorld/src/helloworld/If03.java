package helloworld;
import java.io.*;

public class If03 {
	public static void main(String[] args)throws IOException{
		System.out.println("xとyの値を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		
		if(x>y)
			System.out.println("xはyより大きい");
		
		else if(x<y)
			System.out.println("xはyより小さい");
		
		
	}

}
