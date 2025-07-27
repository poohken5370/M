package helloworld;
import java.io.*;

/**
 * If02クラスは、x,yの値を入力し該当する条件を出力するプログラムです。
 * @author みく
 */
public class If02 {
	
	/**
	 * mainメソッド
	 * x,yを入力し、
	 * 1:x は y より小さく、かつ、x と y は共に偶数である。
	 * 2:x と y は等しく、かつ、負の数である。
	 * 3:x は y より小さい、または、x は偶数である。
	 * のいずれかに該当するものを出力します。
	 * @param args コマンドライン引数(このプログラムでは使用しません。)
	 */
	public static void main(String[] args)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("xの値を入力してください。");
		String str1 = br.readLine();
		int x = Integer.parseInt(str1);
		
		System.out.println("yの値を入力してください。");
		String str2 = br.readLine();
		int y = Integer.parseInt(str2);
		
		if(x < y && x % 2 == 0 && y % 2 == 0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		}
		else if(x == y && x < 0 && y < 0) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		}
		else if(x < y || x % 0 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}
		else {
			System.out.println("該当する条件はありません。");
		}
	}
}
