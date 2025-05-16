package helloworld;

public class Enzanshi03 {
	public static void main(String[] args) {
		
		int x=11;
		int y=22;
		System.out.println("x="+x+" y="+y+"と代入しました。");
		
		int z=x;
		x=y;
		y=z;
		
		System.out.println("x="+x+" y="+y+"へ入れ替えました。");
	}

}
