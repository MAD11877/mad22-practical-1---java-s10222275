import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Integer: ");
    int num = in.nextInt();
	  while(num>0) {
	    int num2=num;
	    while(num2>0)
	    {
	    	System.out.print("*");
	    	num2=num2-1;
        
	    		
	    }
      num=num-1;
	    System.out.println("");
    }
    
  }
}
