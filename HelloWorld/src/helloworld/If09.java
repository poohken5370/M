package helloworld;
import java.io.*;

/**
 * @author みく
 * If09クラスは、投入金額を入力し、150円のドリンクを購入する場合の結果を出力するプログラムです。
 */
public class If09 {
	
	/**
	 * mainメソッド
	 * 150円のドリンクを購入しようとしています。
	 * 投入金額を入力すると、結果が出力されます。
	 */
	public static void main(String[] args)throws IOException{
		System.out.println("150円のドリンクを購入します。");
		System.out.println("投入金額を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int total = num - 150;
				
		if(total == 0) {
			System.out.println("おつりはありません。");
		}
		else if(total > 0) {
			System.out.println("おつりは" + total + "です。");
		}
		else if(total <= 0) {
			System.out.println("投入金額が" + (-total) + "円不足しています。");
		}
	}
}
