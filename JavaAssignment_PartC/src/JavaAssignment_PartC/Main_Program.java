package JavaAssignment_PartC;

public class Main_Program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Number_Program th1 =new Number_Program("ODD",20,40);
		
		th1.start();
	
		Number_Program th2 =new Number_Program("EVEN",20,40);
		th2.start();
		
		
		th1.join();
		
		th2.join();
		
		
		th1.display();
		th2.display();
	}
//----------
}
