package helloworld;
import java.io.*;

public class For04
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("個数を入力してください。");
		
		String str =br.readLine();
		int count = Integer.parseInt(str);
		
		for(int i = 0; i < count; i++) {
			System.out.print(i % 10); // 0～9を繰り返し表示
		}
	}
}
