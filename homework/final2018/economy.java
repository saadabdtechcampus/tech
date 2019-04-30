
public class economy extends room {
	private double promo;

	public economy(int rn, int nmb, int rpn, boolean isavail, double promo) {
		super(rn, nmb, rpn, isavail);
		this.promo = promo;
	}
	economy(economy e){
		super(e);
		promo = e.promo;
	}
	public double calculateBill() throws Exception {
		if(promo>rpn) {
			throw new Exception("promo greater than rpn");
		}
		return rpn-promo;
		
	}

}
