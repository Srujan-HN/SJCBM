package NewT;
class bank{
	private String name;
	private int balance;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setbalance(int balance) {
		this.balance=balance;
		
	}
	public int getbalance() {
		return balance;
	}
	void display() {
		System.out.println("Enter Account holder name:"+getname());
		System.out.println("Enter Account holder balance:"+getbalance());
		}
}

public class UseBank {

	public static void main(String[] args) {
		bank b= new bank();
		b.setname("Srujan");
		b.setbalance(2000);
		b.display();
		

	}

}
