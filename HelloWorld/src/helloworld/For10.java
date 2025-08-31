package helloworld;
import java.io.*;

public class For10 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] sub = new String[4];
		String[] num = new String[4];
		
		int sum = 0;
		for(int i = 0; i < sub.length; i++) {
			System.out.println((i + 1) + "教科目：");
			sub[i] = br.readLine();
			
			System.out.println(sub[i] + "の点数");
			num[i] = br.readLine();
			
			sum += Integer.parseInt(num[i]);
		}
		for(int i = 0; i < sub.length; i++) {
			System.out.println(sub[i] + ":" + num[i] + "点"); 
		}
		System.out.println("合計は" + sum + "点です。");
	}

}
