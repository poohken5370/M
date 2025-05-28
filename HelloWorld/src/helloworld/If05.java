package helloworld;
import java.io.*;

public class If05 {
	public static void main(String[] args)throws IOException{
		
	System.out.println("正の整数を入力してください。");
	
	
	BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
	
	String str=br.readLine();
	int num=Integer.parseInt(str);
	
	if(num % 2 == 0)
		System.out.println("偶数です。");
	
	else {
		System.out.println("奇数です。");
	
	}
	
	}
}
