package polymorphism;

public class Fruit {
	private String name;
	private int size;
	private String taste;
	Fruit(){}
	Fruit(String name,int size,String taste){
		this.name=name;
		this.size=size;
		this.taste=taste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String eat(){
		return "fruits are different in taste.";
	}
}
