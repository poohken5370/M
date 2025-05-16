package helloworld;
import java.io.*;
public class Enzanshi08 {
	public static void main(String[] args)throws IOException{
		System.out.println("整数を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int x=Integer.parseInt(str);
		
		System.out.println("xの値は"+x+"です。");
	}

}
