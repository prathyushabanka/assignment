package assignment2;

public class PascalTriangle {
       public static void main(String[] args) {
    	 int row=5;int c=1,b;
    	 for(int i=0;i<row;i++) 
    	 {
    		 for(b=1;b<-row-i;b++) 
    		 System.out.print(" ");
    		 for(int j=0;j<=i;j++)
    		 {
    			 if(j==0 || i==0)
    				 c=1;
    			 else
    				 c=c *(i-j+1)/j;
    			 System.out.print(" "+c);
    		 }
    		 System.out.println();
    			 
    				 
    		 }
    			 
    		 
    	   }
       }

