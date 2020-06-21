package polymorphism;

public class Orange extends Fruit{
	Orange(String name,String taste){
		super(name,0,taste);
	}
	public String eat(){
		return getName()+" is "+getTaste()+" in taste.";
	}
}
