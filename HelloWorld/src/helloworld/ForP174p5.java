package helloworld;
import java.io.*;

public class ForP174p5 {
	public static void main(String[] args)throws IOException{
		System.out.println("2以上の整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		//素数判定
		if(num <= 1) {
			System.out.println("2以上の整数を入力してください。");
		}
		else {
			boolean prime = true;
			for(int i = 1;i <= (int)Math.sqrt(num); i++) { //Math.sqrt（num）は√numまでしらべる。素数かどうか調べるにはその数の平方根まででOKだから！
				if(num % i == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println(num + " は素数です。");
			}
			else {
				System.out.println(num + " は素数ではありません。");
			}
		}
	}
}
