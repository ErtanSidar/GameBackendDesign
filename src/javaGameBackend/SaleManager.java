package javaGameBackend;

public class SaleManager {
	
	public void sell(Gamer gamer,Game game,Campaign campaign) {
		System.out.println(gamer.getFirstName()+" "+game.getGameName()+" "+campaign.getCampaignName() +"bought");
	}

}
