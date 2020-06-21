package polymorphism;

public class ShapeTest {

	public static void main(String[] args) {
		Shape sp=new Shape();
		Triangle tri=new Triangle();
		Circle cir=new Circle();
		Square sqa=new Square();
		sp.draw();
		tri.draw();
		cir.draw();
		sqa.draw();
		sp.erase();
		tri.erase();
		cir.erase();
		sqa.erase();
	}

}
