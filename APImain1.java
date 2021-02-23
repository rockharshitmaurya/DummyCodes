interface APIinterface{
	void printer();
}
class APIclass{
	void m(APIinterface ia){
		ia.printer();
	}
}
class Factory{
	public static APIclass factory(){
		return new APIclass();
	}
}
class APImain1{
	public static void main(String[] args) {
		APIclass ap = Factory.factory();
		ap.m(new MyClass());
	}
}
class MyClass implements APIinterface{	//Agreement
	public void printer(){
		System.out.println("printer method");
	}
}