package helloworld;
import java.io.*;

/**
 * @author みく
 * If06クラスは、「正の偶数」「正の奇数」「負の偶数」「負の奇数」「正でも負でもない偶数」のいずれかを出力するプログラムです。
 */
public class If06 {
	
	/**
	 * mainメソッド
	 * @param args コマンドライン引数（このプログラムでは使用しません）
	 * 「正の偶数」「正の奇数」「負の偶数」「負の奇数」「正でも負でもない偶数」のいずれかをコンソールに出力します。
	 */
	public static void main(String[] args)throws IOException{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("正の偶数です。");
		}
		else if(num > 0 && num % 2 != 0) {
			System.out.println("正の奇数です。");
		}
		else if(num < 0 && num % 2 == 0) {
			System.out.println("負の偶数です。");
		}
		else if(num < 0 && num % 2 != 0) {
			System.out.println("負の奇数です。");
		}
		else if(num == 0) {
			System.out.println("正でも負でもない偶数です。");
		}
	}
}
