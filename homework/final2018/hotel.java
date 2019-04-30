
public class hotel {
	private String name;
	private String city;
	private floor[] arf;
	private int nbf;
	hotel(String n, String c, int s){
		name= n;
		city=c;
		arf = new floor[s];
		nbf=0;
	}
	
	public int totalaval() {
		int total=0;
		for(int i=0; i<nbf;i++) {
			try {
			total+=arf[i].getavailable();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return total;
		
	}

	public String getCity() {
		return city;
	}

}
