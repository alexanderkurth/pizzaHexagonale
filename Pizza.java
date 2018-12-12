package main;

public class Pizza {
	
	private int partAvantSaciété;
	private String type;

	public Pizza(int partAvantSaciété, String type) {
		this.type = type;
		this.partAvantSaciété = partAvantSaciété;
	}

	public int getPartAvantSaciété() {
		return partAvantSaciété;
	}

	public void setPartAvantSaciété(int partAvantSaciété) {
		this.partAvantSaciété = partAvantSaciété;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
