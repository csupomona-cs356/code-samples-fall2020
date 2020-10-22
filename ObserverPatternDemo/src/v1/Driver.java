package v1;

public class Driver {

	public static void main(String[] args) {
		ESPNWebsite espn = new ESPNWebsite();
		PolyPost polyPost = new PolyPost();
		LAPoll la = new LAPoll();
		NBAGame game1 = new NBAGame();
		
		la.attach(polyPost);
		game1.attach(espn);
		game1.attach(polyPost);
		
		
		la.setName("Election 2020");
		la.setPercent("52% vs 46%");
		la.setPercent("51% vs 48%");		
		game1.setName("LAK vs BOS");			
		game1.setScore("2:0");		
		la.setPercent("51% vs 49%");
		game1.setScore("2:2");		
		la.setPercent("51% vs 50%");
		game1.setScore("4:2");				
		game1.setScore("80:102");
		game1.detach(polyPost);		
		game1.setScore("88:112");
	}

}
