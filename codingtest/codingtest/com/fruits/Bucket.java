package codingtest.com.fruits;

public class Bucket {
	private String bananas;
	private String oranges;
	private String apples;
	private String lemons;
	private String peaches;

	public Bucket(String bananas, String oranges, String apples, String lemons, String peaches) {
		this.bananas = bananas;
		this.oranges = oranges;
		this.apples = apples;
		this.lemons = lemons;
		this.peaches = peaches;
	}
	public String getBananas() {
		return bananas;
	}
	public void setBananas(String bananas) {
		this.bananas = bananas;
	}
	public String getOranges() {
		return oranges;
	}
	public void setOranges(String oranges) {
		this.oranges = oranges;
	}
	public String getApples() {
		return apples;
	}
	public void setApples(String apples) {
		this.apples = apples;
	}
	public String getLemons() {
		return lemons;
	}
	public void setLemons(String lemons) {
		this.lemons = lemons;
	}
	public String getPeaches() {
		return peaches;
	}
	public void setPeaches(String peaches) {
		this.peaches = peaches;
	}




}
