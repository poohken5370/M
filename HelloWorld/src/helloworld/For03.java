package helloworld;
import java.io.*;

public class For03 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[10];
		System.out.println("10回整数を入力してください。");
		
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			String str = br.readLine();
			num[i] = Integer.parseInt(str);
			sum += num[i];
		}
		int avg = sum / num.length; // 整数同士の割り算だから自動で小数点切り捨て
		System.out.println("平均: " + avg);

	}
}
