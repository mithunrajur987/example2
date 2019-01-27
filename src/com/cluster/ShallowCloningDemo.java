package com.cluster;


 
 class Hello{
	int a;
	int b;

	Hello(int a, int b) {
		System.out.println("Inside  const");
		this.a = a;
		this.b = b;
	}

	public Object clone() throws CloneNotSupportedException
	{
		Object e = super.clone();
		return e;
		//	return super.clone();
	}

}

 
 /**
  *  Cluster Software Solutions.
  *  (Mob:98451-31637/39
  *  www.clusterindia.com)
  */
public class ShallowCloningDemo {
	public static void main(String[] args) {
		try
		{
			Hello h1=new Hello(10,20);
			Hello h2;
			h2=(Hello)h1.clone();
			System.out.println(h1);
			System.out.println(h2);
			System.out.println("h1->" +h1.a+" "+h1.b);
			System.out.println("h2->" +h2.a+" "+h2.b);
			
		} 
		catch (CloneNotSupportedException e) 
		{
			System.out.println("Inside Exception " + e);
		}
	}
}
