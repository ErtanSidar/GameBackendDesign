package javaGameBackend;

public class Campaign {
	
	private int campaignId;
	private String campaignName;
	private double campaignDiscount;
	
	public Campaign (int campaignId, String campaignName, double campaignDiscount) {
		this.campaignId=campaignId;
		this.campaignName=campaignName;
		this.campaignDiscount=campaignDiscount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
	
	

}
