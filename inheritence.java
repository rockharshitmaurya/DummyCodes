class inheritence{
	private void p1(){
	System.out.println("private");	
	}
	public void p2(){
	System.out.println("public");	
	}
}
class child extends inheritence{
	public void p2(){
	System.out.println("p3");	
	}
}
class FactoryMethod{ //inhance 
	public static inheritence factory(){
		return (new child());
	}
}
class Imain{
	public static void main(String[] args) {
	//inheritence i=new inheritence();
		inheritence i=new child();
	i.p2();
	//child c=new child();
	//i.p2();
	//i.p3();
	}
}