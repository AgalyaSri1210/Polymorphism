package polymorphism;

public class FruitTest {

	public static void main(String[] args) {
		Fruit ft=new Fruit();
		System.out.println(ft.eat());
		Apple app=new Apple("Apple","sweet");
		Orange org=new Orange("Orange","sour");
		System.out.println(app.eat());
		System.out.println(org.eat());
		ft=new Apple("Apple","sweet");
		System.out.println(ft.eat());
	}
}
