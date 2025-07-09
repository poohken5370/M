package helloworld;
import java.io.*;

/**
 * @author みく
 * If07クラスは、中間試験の点数及び期末試験の点数を入力して合否を出力するプログラムです。
 */
public class If07 {
	
	/**
	 * mainメソッド
	 * 中間試験及び期末試験の点数を入力します。
	 * どちらも６０点以上の場合は「合格」
	 * 合計点数が１３０点以上の場合も「合格」
	 * 合計点数が１００点以上で、どちらかの試験が９０点以上であれば「合格」
	 * それ以外は不合格となります。
	 * @param args コマンドライン引数(このプログラムでは使用しません)
	 */
	public static void main(String[] args)throws IOException{
		System.out.println("中間試験の点数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int test1 = Integer.parseInt(str1);
		
		System.out.println("期末試験の点数を入力してください。");
		
		String str2 = br.readLine();
		int test2 = Integer.parseInt(str2);
		
		if(test1 >= 60 && test2 >= 60) {
			System.out.println("合格");
		}
		else if(test1 + test2 >= 130) {
			System.out.println("合格");
		}
		else if(test1 + test2 >= 100 && (test1 >= 90 || test2 >= 90)) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}	
	}
}
