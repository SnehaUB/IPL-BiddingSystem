
import java.util.ArrayList;

public class Player {
	private String playerName=" ";
	ArrayList<Integer> money = new ArrayList<Integer>();
	int  Price;
	int id=-999;
	int bidderCount=0;
  ArrayList<Bidder> bidderObject=new ArrayList<Bidder>();	
	
  public Player(String p)
	{
		playerName=p;
	}
  
  public void attach(Bidder a)
  {
		bidderObject.add(a);
  		 
  }
   
  public int [] getBidderAndPrice()
  {
	    int[] a =new int[2];
      a[0]= id;
      a[1]=Price;
      return a;
         
   }
   
   public void setBidderAndPrice(int bId, int bidPrice)
   {
	    this.id=bId;
      this.Price=bidPrice;
      if(id==-999)
      {
          id=bId;
      }
      else
      {
	       int j=0;
	       while((bidderObject.get(j).BId)!=id)
         {
               j++;
          }
         Bidder b=bidderObject.get(j);
         b.money=b.money -10;
 
       }
        
    	notifyy();
	
   }
   
   public void completeDeal(int bId, int bidPrice)
   {
      
       this.id=bId;
       this.Price=bidPrice;
       int j=0;
       while(bidderObject.get(j).BId!=bId)
       {
           j++;
       }
       Bidder b=bidderObject.get(j);
       b.money=b.money -bidPrice;
       
	     notifyDeal(); 
		
   }
   
   public void notifyy()
   {
	     Bidder b;
       for(int i=0;i<bidderObject.size();i++)
	     {
           
	       b=bidderObject.get(i);
	       b.updateBidding();
         
	     }

       System.out.println(" ");
  
   }

   public void notifyDeal()
   {
        Bidder b;
        System.out.println("Bid Winner");
        for(int i=0;i<bidderObject.size();i++)
	      {
        	 b=bidderObject.get(i);
	         b.updateFinalDeal();
	
         }
         
        System.out.println(" ");
   }

}
