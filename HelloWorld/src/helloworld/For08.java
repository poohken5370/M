package helloworld;
import java.io.*;

public class For08 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		//「田」などの1文字のみなら、char型を使う。
		//「田中」「こんにちは」などの文字列は、string型を使用する。
		String[] names = new String[4];
		String[] groups = new String[4];
		
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "人目の名前を入力してください。");
			names[i] = br.readLine();
		
			System.out.println((i + 1) + "人目の部署名を入力してください。");
			groups[i] = br.readLine();
		}
		System.out.println("\n---全員分を出力します---");
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ":" + names[i] + ":" + groups[i]);
		}
	}
}
