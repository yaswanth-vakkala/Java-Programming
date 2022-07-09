package helloworld;
interface Abcd1
{
	void show();
}

public class Anonymous_cls_interface_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abcd1 obj = new Abcd1()
				{
			public void show()
			{
				System.out.println("anything me");
			}
				};//just like abstract
		obj.show();
	}
//advtanges are low memory consumption
}
