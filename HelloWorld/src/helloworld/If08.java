package helloworld;
import java.io.*;

/**
 * @author みく
 * If08クラスは、血液型を入力すると占い結果が出てくるプログラムです。
 */
public class If08 {
	
	/**
	 * mainメソッド
	 * 血液型を入力すると占い結果が出力されます。
	 */
	public static void main(String[] args)throws IOException{
		System.out.println("血液型を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(str.equals("A")) {
			System.out.println("あなたは然るべきところではしっかりこなすよう努力しますが、深いこだわりがあるわけではありません。");
		}
		else if(str.equals("B")) {
			System.out.println("あなたはとても自由で自分の「好き」「好奇心」を貫きます。");
		}
		else if(str.equals("O")) {
			System.out.println("あなたはとてもおおらかで、自分だけのこだわりを持っています。");
		}
		else if(str.equals("AB")) {
			System.out.println("あなたは気分によって一人にしてほしいときと楽しいことをしたいときの差が激しいため、二重人格と呼ばれることがよくあります。");
		}
		else {
			System.out.println("正しく入力してください");
		}
	}
}
