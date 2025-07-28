package helloworld;
import java.io.*;

public class ForP152 {
	public static void main(String[] args)throws IOException{
		System.out.println("いくつ*を出力しますか。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for(int i = 1; i <= num; i++) {
			System.out.print("*"); //「println」だと改行して縦に入力された個数が出力されるので注意！改行しない場合は「print」
		}
	}
}
