class FactoryMain{
	public static void main(String[] args) {
		MyClass.factory().printer();
		MyClass m1=MyClass.factory();
		m1.x=20;
		MyClass m2=MyClass.factory();
		System.out.println(m1.x+" "+m2.x);
	}
}