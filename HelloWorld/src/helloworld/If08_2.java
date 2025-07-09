package helloworld;
import java.io.*;

/**
 * @author みく
 * If08_2クラスは、switch文で血液型占いを出力するプログラムです。
 */
public class If08_2 {
	
	/**
	 * mainメソッド
	 * 血液型を入力すると、占い結果が出力されます。
	 */
	public static void main(String[] args)throws IOException{
		System.out.println("血液型を入力してください。");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		switch (str) {
		case "A":
			System.out.println("あなたは然るべきところではしっかりこなすよう努力しますが、深いこだわりがあるわけではありません。");
			break;
		case "B":
			System.out.println("あなたはとても自由で自分の「好き」「好奇心」を貫きます。");
			break;
		case "O":
			System.out.println("あなたはとてもおおらかで、自分だけのこだわりを持っています。");
			break;
		case "AB":
			System.out.println("あなたは気分によって一人にしてほしいときと楽しいことをしたいときの差が激しいため、二重人格と呼ばれることがよくあります。");
			break;
		default:
			System.out.println("A / B / O / AB いずれかを正しく入力してください！");
	}
	}
}
