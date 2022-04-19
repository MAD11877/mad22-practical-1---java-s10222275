import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    System.out.println("Enter quantity of numbers: "); 
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    List<Integer> l1 = new ArrayList<Integer>();//import list
	    List<Integer> l2 = new ArrayList<Integer>();//import list
	    List<Integer> l3 = new ArrayList<Integer>();//import list
	    l2=l1;

	    for (int i = 0;i<num;i++)
	      {
	        int num2 = in.nextInt();
	        l1.add(num2);
	        
	      }
	    for(int k = 0; k<l1.size();k++){
	    	int snum = l1.get(k);
	    	int count=0;
	    	for (int q=0;q<l1.size();q++) {
	    		if(snum==l1.get(q)) {
	    			count++;

	    		}
	    		
	    	
	    	}

	    	l3.add(count);
	    }
	    int maxnumber= Collections.max(l3);
	    int pos =0;
	    for(int h : l3) {
	    	if (h==maxnumber) {
	    		pos++;
	    		break;
	    	}
	    }
	    int ans = l1.get(pos);
	    System.out.println(ans);
	    
  }
}
