package com.ClassMethods;

public class AllGlobleMembers {
	static int value=3;
	int num=45;//gloable variable
	void run() {
		System.out.println("Non static run method");
	}
	static void excute() {
		System.out.println("static excute method");
	}

	public static void main(String[] args) {
		
		int num=3;//local variable
		System.out.println("Local value: n="+num);
		System.out.println("==================");
		System.out.println("Gloable ststic value="+value);
		AllGlobleMembers.excute();
		System.out.println("==================");
		//object cration
		AllGlobleMembers object= new AllGlobleMembers();
		object.run();
		System.out.println("non ststic num="+object.num);
		
		
	}

}
