
public abstract class room implements rentable {
	private int rn;
	private int nmb;
	protected int rpn;
	private boolean isavail;
	
	public room(int rn, int nmb, int rpn, boolean isavail) {
		super();
		this.rn = rn;
		this.nmb = nmb;
		this.rpn = rpn;
		this.isavail = isavail;
	}
	room(room r){
		this(r.rn,r.nmb,r.rpn,r.isavail);
	}

	public int getNmb() {
		return nmb;
	}
	public boolean isavailable() {
		return isavail;
	}
	
	

}
