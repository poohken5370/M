package helloworld;

/**
 * @author みく
 * Enzanshi03クラスは、2つの変数xとyの値を入れ替えるプログラムです。
 * 入れ替え前のxの値と、入れ替えた後のxの値を出力します。
 */
public class Enzanshi03 {
	
    /**
     * mainメソッド
     * 変数xに11、yに22を代入し、それをzを使って入れ替えます。
     * 入れ替え前と入れ替え後の値を出力します。
     * @param　args コマンドライン引数（このプログラムでは使用しません）
     */
    public static void main(String[] args) {
        
        int x = 11; // 最初のxの値
        int y = 22; // 最初のyの値

        System.out.println("x=" + x + "y=" + y + "と代入しました。");

        int z = x; // xの値を一時的に保存
        x = y;     // yの値をxに代入
        y = z;     // z（元のx）をyに代入

        System.out.println("x=" + x + "y=" + y + "へ入れ替えました。");
    }
}
