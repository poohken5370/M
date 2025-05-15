package helloworld;

public class EnzanshiP97 {
	public static void main(String[] args) {
		double dnum=160.5;
		System.out.println("身長は"+dnum+"です。");
		
		System.out.println("double型の変数に代入します。");
		int inum=dnum;
		//このように、大きい型から小さい型へ代入することはできません。
		
		System.out.println("身長は"+inum+"です。");
	}

}
