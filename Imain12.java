abstract class Parent{											
	void printer(){
		System.out.println("Parent");
	}
	// void caller(){
	// 	this.printer();
	// }
}
class child extends Parent{
	// void paint(){
	// 	super.caller();
	// }
		void printer(){
		System.out.println("Parent child");
		super.printer();
	}
}
class Imain2{
		public static void main(String[] args) {
			child n=new child();
			n.printer();

		}
} 