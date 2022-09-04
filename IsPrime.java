package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num =7;
         int count=0;
         for(int i =2;i<num;i+=1) {
        	 if(num % i ==0)
        	 {
        		 count =count +1;
        		 
        	 }
         }
         if(count != 0) 
        	 System.out.print("It is not a Prime number");
        	 
        else
        	System.out.println("It is a prime number");
        	 
        	 
         }
	}


