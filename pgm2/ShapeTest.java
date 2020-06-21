package polymorphism;

public class ShapeTest {

	public static void main(String[] args) {
		Shape sp=new Shape();
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		sp.draw();
		c.draw();
		t.draw();
		s.draw();
		sp.erase();
		c.erase();
		t.erase();
		s.erase();
	}

}
