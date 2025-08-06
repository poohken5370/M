package helloworld;

public class ForP173p3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j +"  ");
			} //この一区切りで横の行のひとまとまり
			System.out.println("\t");
		} //この区切りで縦の行のひとまとまり
	}

}
