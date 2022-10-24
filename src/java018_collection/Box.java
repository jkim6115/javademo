package java018_collection;

public class Box<T> {
	private T data;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}
	
	public Box(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
