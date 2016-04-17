import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.lang.*;

public class AuctionStage {

	public static void main(String[] input) throws Exception{
		
           String player;
           String temp[];
           int le1=0;
           int le2=0;
   	       int count=0;
   	       BufferedReader reader=null;
	         Player playerObject;
           String line=null;
	         Scanner sn= new Scanner(System.in);
  	      
  		     player=sn.next();
		       count++;
		       playerObject=new Player(player);
  		     String l1 = sn.next();
  		     int len1=Integer.parseInt(l1);
  		     le1=len1;
		       count=0;
  		     System.out.println("Bidding starts for player "+ player);
  		        
  		     while( count<le1)
  		     {
  		        String delimiter=",";
  		        line=sn.next();
  		        temp=line.split(delimiter);
  		        count++;
              Bidder bidderObject= new Bidder(playerObject,Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
              playerObject.attach(bidderObject);
                            
  		     }
             		
			      String l2 = sn.next();
            int len2=Integer.parseInt(l2);
            le2=len2;
            count=0;
             		
            while(count<le2-1)
  		      {
  		         String delimiter=",";
  		         line=sn.next();
  		         temp=line.split(delimiter);
  		         count++;
			         playerObject.setBidderAndPrice(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
                            
            }

			      String delimiter=",";
  		      line=sn.next();
  		      temp=line.split(delimiter);
			      playerObject.completeDeal(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
                    
    
	}
      
      

}
