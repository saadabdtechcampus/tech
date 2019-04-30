
public class node {
	private node next;
	private hotel data;
	
	node(hotel d){
		next = null;
		data = d;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}

	public hotel getData() {
		return data;
	}

	public void setData(hotel data) {
		this.data = data;
	}
	

}
