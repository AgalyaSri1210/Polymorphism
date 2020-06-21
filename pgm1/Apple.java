package polymorphism;

public class Apple extends Fruit{
	Apple(String name,String taste){
		super(name,0,taste);
	}
	public String eat(){
		return getName()+" is "+getTaste()+" in taste.";
	}
}
