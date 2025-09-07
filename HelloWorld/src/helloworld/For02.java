package helloworld;
import java.io.*;

/**
 * このプログラムは「商品」「単価」「支払金額」を入力した後、、支払金額の不足有無と、全体の不足合計を出力するプログラムです。
 * @author みく
 */
public class For02
{
	/**
	 * mainメソッド
	 * 商品名、単価、支払金額を入力します。（３回）
	 * 商品名、単価と、支払金額の不足有無を確認して、出力します。
	 * 単価に対し、支払金額に不足があれば「支払金額不足」、不足がなければ「支払金過不足無し」と出力します。
	 * 最後に全体の不足合計を出力します。（単価合計 - 支払金額合計）
	 * @param args コマンドライン引数(このプログラムでは使用しません。)
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] name = new String[3];
		String[] price = new String[3];
		String[] payment = new String[3];
		
		int sum1 = 0;
		int sum2 = 0;
		int total = 0;
		for(int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "個目の商品を入力してください。");
			name[i] = br.readLine();
			
			System.out.println("単価を入力してください。");
			price[i] = br.readLine();
			sum1 += Integer.parseInt(price[i]);
			
			System.out.println("支払金額を入力してください。");
			payment[i] = br.readLine();
			sum2 += Integer.parseInt(payment[i]);
			
			total = sum2 - sum1;
		}
		for(int i = 0; i < name.length; i++) {
			int p = Integer.parseInt(price[i]);
			int pay = Integer.parseInt(payment[i]);
			
			if(pay - p > 0) {
				System.out.println(name[i] + ',' + price[i] + ',' + "支払金超過");
			}
			else if(pay - p == 0){
				System.out.println(name[i] + ',' + price[i] + ',' + "支払金過不足無し");
			}
			else{
				System.out.println(name[i] + ',' + price[i] + ',' + "支払金額不足");
			}
		}
		if(total >= 0) {
			System.out.println("不足金はありません。");
		}
		else {
			System.out.println("全体の不足金：" + -total + "円");
		}
	}
}
