package JavaAssignment_PartC;

import java.util.ArrayList;
import java.util.List;

public class Number_Program  extends Thread{

	
	int start;
	int end ;
//	List<String> numberType  = new ArrayList<String>();
	
	String numberType;
	List<Integer> numberList =new ArrayList<Integer>();
	//numberType.add("EVEN");
	
	
	//<Integer> list
	
	Number_Program(String Type ,int start, int end )
	
	{
		
		this.numberType=null;
		numberType=Type;
		this.start=start;
		this.end=end;
		
		
		
	}
	
	public void run() {
		
		
		
	for (int i =this.start;i<=this.end; i++)
	{
		
		if (this.numberType=="EVEN") 
	{
		  if(i%2 == 0){
             
			  //EveN
			  numberList.add(i);
			  
          }
		  
	}
		
		if (this.numberType=="ODD") 
		{
			  if(i%2 != 0){
	             
				  //EveN
				  numberList.add(i);
				  
	          }
			  
		}	
		  
		 
		  
		  
	}
	
	}
	
	public void display() {
		
		
		   System.out.println("Enetr Rrange of Numbers \n");
		   System.out.println(this.start+"   "+ this.end + "\n");
		   
		if (this.numberType=="ODD") 
		{
			System.out.println("ODD Numbers in given range are \n");
		} else 
		
			System.out.println("ODD Numbers in given range are \n ");
		
		for (Integer object: this.numberList) {
		    System.out.println(object);
		}
		
		   System.out.println("\n");
		
	}
	
}
