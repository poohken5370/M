package helloworld;

import java.io.*;

public class Enzanshi09 {
	public static void main(String[] args)throws IOException{
		System.out.println("xの値をを入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int x=Integer.parseInt(str1);
		
		System.out.println("yの値をを入力してください。");
		String str2=br.readLine();
		int y=Integer.parseInt(str2);
		
		System.out.println("x + y = "+(x+y));
		System.out.println("x - y = "+(x-y));
		System.out.println("x * y = "+(x*y));
		System.out.println("x / y = "+(x/y));
		System.out.println("x % y = "+(x%y));
	}
	

}
