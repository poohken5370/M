package helloworld;
import java.io.*;

public class ForP173p2 {
	public static void main(String[]args)throws IOException{
		System.out.println("テストの点数を入力してください。(0で終了)");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;  // 合計点を保存する変数
        int score = -1; // 最初のループに入るため、0以外の値で初期化

        while (score != 0) {
            System.out.print("点数を入力してください（終了するには0を入力）：");
            String str = br.readLine();
            score = Integer.parseInt(str);

            total += score;
        }

        System.out.println("合計点は：" + total + "点です。");
    }
}
