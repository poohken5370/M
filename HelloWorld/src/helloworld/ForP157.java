package helloworld;

public class ForP157 {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) {
			System.out.println(i + "番目の繰り返しです。");
			i++; //左記のような条件を記入しないで実行すると、変化がないため、永遠にプログラムが終わらなくなってしまうので注意！
		}
		System.out.println("繰り返しが終わりました。");
	}
}
