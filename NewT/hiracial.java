package NewT;
class vehical{
	void cost() {
		System.out.println("The prize vary depending upon vechicals");
	}
}
 class Bike extends vehical{
	 void cost() {
		 System.out.println("bike starting from 80000");
		 
	 }
	 
 }
 class Car extends vehical{
	 void cost() {
		 System.out.println("cars starting from 300000");
	 }
 }

public class hiracial {

	public static void main(String[] args) {
		 Car c= new Car();
		 c.cost();
		 Bike b= new Bike();
		 b.cost();
		

	}

}
