class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<1000; i++) System.out.print(i+" ");
	}
}
class ThreadExtend{
	public static void main(String[] args) {
	new ThreadDemo().start();

	}
}