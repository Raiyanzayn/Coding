package demo;

public class stockbuy {
	    public  static  int sort(int[] sellingprice) {

	          	int buyprice = Integer.MAX_VALUE;
	          	int maxprofit=0 ;
	          	for( int i=0 ; i<sellingprice.length ; i++) {
	          	if ( buyprice < sellingprice[i] ) {
	          		int profit = sellingprice[i] -buyprice;
	          		maxprofit = Math.max(maxprofit,profit );
	          		
	          	}  else {
	          		buyprice = sellingprice[i];
	          	}
	          	}
	    	return maxprofit ;
	    	
	    }   	
	    public static void main(String args[]){
	   int sellingprice[] =	{7,1,5,3,6,4};
	    	  System.out.println(sort(sellingprice));
	}
}

