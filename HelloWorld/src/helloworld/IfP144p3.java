package helloworld;
import java.io.*;


public class IfP144p3 {
	public static void main(String[] args)throws IOException{
		System.out.println("2つの整数を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		if(num1 == num2) {
			System.out.println("2つの値は同じ値です。");
		}
		else if(num1 < num2) {
			System.out.println(num1+"より"+num2+"のほうが大きい値です。");
		}
		
	}

}
