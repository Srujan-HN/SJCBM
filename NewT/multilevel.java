package NewT;
class Grandfather{
	void knowledge() {
		System.out.println("have more knowledge and experience");
	}
}
class parents extends Grandfather{
	void knowledge() {
		System.out.println("less knowledge and experience compared to grandfather");

	}
}
class child extends parents{
	void knowledge() {
		System.out.println("less knowledge and experience compared to father");

	}
}

public class multilevel {

	public static void main(String[] args) {
		child c= new child();
		c.knowledge();
		parents p= new parents();
		p.knowledge();
		Grandfather g= new Grandfather();
		g.knowledge();
		
		
	
	}

}
