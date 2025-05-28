package helloworld;
import java.io.*;

public class If02 {
	public static void main(String[] args)throws IOException{
		System.out.println("2つの整数を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		
		if(x > y)
			System.out.println("xが入力されました");
		
		else if(x < y)
			System.out.println("yが入力されました。");
		
		
	}
}
