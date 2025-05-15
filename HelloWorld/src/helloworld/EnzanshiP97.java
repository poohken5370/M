package helloworld;

public class EnzanshiP97 {
	public static void main(String[] args) {
		double dnum=160.5;
		System.out.println("身長は"+dnum+"です。");
		
		System.out.println("double型の変数に代入します。");
		int inum=(int)dnum;
		//大きい型から小さい型へ代入することはできません。
		//小さい型へと代入するには　int inum=(int)dnum;(9行目)のように変換する必要があります。
		//このように (int) の部分を「キャスト演算子」と呼びます。
		
		System.out.println("身長は"+inum+"です。");
	}

}
