//inheritance using with super keyword
class A 
{
	int a;
	A(int i)
	{
		a=i;
	}
}
class B extends A
{
	private int b;
	B(int i,int j)
	{
		super(i);
		b=j;
	}
	void sum()
	{
		System.out.println("Answer is :"+(a+b));
	}
}
class A43
{
	public static void main(String []args)
	{
		B b1=new B(110,50);
		b1.sum();
	}
}