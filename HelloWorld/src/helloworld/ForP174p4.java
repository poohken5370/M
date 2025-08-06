package helloworld;

public class ForP174p4 {
	public static void main(String[] args) {
		//縦に5行
		for(int i = 1; i <= 5; i++) {
			//横にiの列分（つまり階段のようになる。縦の行が１のときは横も１）
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\t");
		}
	}

}
