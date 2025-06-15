package helloworld;
/**
 * @author みく
 * Enzanshi04クラスは、代入したxの値（7）を3倍にした値を代入＆表示し、その後その値を0.5倍の値で表示します。
 * 
 */
public class Enzanshi04 {
	/**
	 * mainメソッド
	 * xの値に7を代入します。
	 * xの値を3倍にした値をxに代入し、表示します。
	 * その値を0.5倍にした値を表示します。
	 */
	public static void main(String[] args) {
		int x = 7;
		x = x*3;
		System.out.println("xの値は" + x + "です。");
		
		System.out.println("xの値は" + ((double)x*0.5) + "です。");		
	}

}