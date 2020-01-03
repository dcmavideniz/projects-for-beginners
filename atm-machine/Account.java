
public class Account {
	
	private int id = 0;
	private double bakiye = 0;
	
	Account(){
		
	}
	
	public Account(int id, double bakiye) {
		this.id = id;
		this.bakiye = bakiye;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public void cekilenPara(double miktar) {
		this.bakiye -= miktar;
	}
	public void yatirilanPara(double miktar) {
		this.bakiye += miktar;
	}

	
	
	
	

}
