package helloworld;

class A5
{
	public void show() {
		System.out.println("in A show");
	}
}
public class Anonymous_inner_cls_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 obj = new A5()
				{
			public void show()
			{
				System.out.println("in B show");
			}
				};
//This is an anonymous class as it has no name.we can aceheive same result by createing class B and overriding show method
//but instead we direclty write the show code while instantiating obj.				
//we create this class if it has only one time use and its sole purpose is to overriding the parent class.
			obj.show();
	}

}
