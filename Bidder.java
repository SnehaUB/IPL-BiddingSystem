

public class Bidder extends Observer {

	int BId,money;
        public Bidder(Player player,int BId, int money)
        {
	       this.player=player;
           this.BId=BId;
           this.money=money;
	
        }
     
	@Override
	public void updateBidding() {
         int x[]=player.getBidderAndPrice();
         System.out.println(BId + " : [" + x[0] + ", " + x[1] + "]" );
	
    
		
		
	}

	@Override
	public void updateFinalDeal() {
		 int d[]=player.getBidderAndPrice();
            System.out.println(BId + " : [" + money + ", " + d[0]  + "]");
		
	}

}
