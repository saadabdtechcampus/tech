
public class floor {
	private int nf;
	private boolean isparking;
	private room[] arr;
	private int nbr;

	floor(int n, boolean i) {
		arr = new room[100];
		nf = n;
		isparking = i;
		nbr = 0;
	}
	floor(floor f){
		arr = new room[100];
		nf = f.nf;
		isparking = f.isparking;
		nbr = f.nbr;
		
		for(int i=0; i<nbr;i++) {
			try {
			addroom(f.arr[i]);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public void addroom(room r) throws Exception {
		if (isparking)
			throw new Exception("this floor is parking");
		else if (arr.length == nbr)
			throw new Exception("array is full");
		else {
			if (r instanceof economy) {
				arr[nbr++] = new economy((economy) r);
			}

		}
	}

	public int getavailable() throws Exception {
		if (isparking)
			throw new Exception("parking floor");
		int counter = 0;
		for (int i = 0; i < nbr; i++) {
			if (arr[i].isavailable()) {
				counter++;
			}
		}
		return counter;

	}

	public room cheapest() {
		room cheapest = null;
		for (int i = 0; i < nbr; i++) {
			if (arr[i] instanceof economy) {
				try {
					if (cheapest == null || arr[i].calculateBill() < cheapest.calculateBill()) {
						cheapest = arr[i];
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}
			}
		}
		return cheapest;
	}

}
