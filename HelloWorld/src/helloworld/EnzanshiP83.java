package helloworld;

public class EnzanshiP83 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		
		b=++a;
		//↑のように前置インクリメント演算子を使うとａをインクリメントしてからｂに代入するという形になるので、実行結果は１
		//b=a++のようにすると、ｂにaを代入してからaをインクリメントするという形になるので、実行結果は０になる。
		System.out.println("代入後にインクリメントしたのでｂの値は"+b+"です。");
		
	}

}
