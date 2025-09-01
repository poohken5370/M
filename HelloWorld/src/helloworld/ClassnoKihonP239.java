package helloworld;

//車のクラス
class CarP239
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	void showCar()
	{
		System.out.println("これから車の情報を表示します。");
		this.show();
	}
}
public class ClassnoKihonP239 
{
	public static void main(String[] args)
	{
		CarP239 car1;
		car1 = new CarP239();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
		
	}

}
