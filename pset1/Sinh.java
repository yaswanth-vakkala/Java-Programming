package lab;

class A
{
	int a;
	void show()
	{
		System.out.println("Base class a= "+a);
	}
}

class B extends A 
{
	int b;
	void print()
	{
		System.out.println("Derived class b= "+b);
		System.out.println("Derived class a= "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob = new B();
		ob.a = 12;
		ob.b = 13;
		ob.show();
		ob.print();
		
	}

}
