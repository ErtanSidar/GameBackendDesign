package javaGameBackend;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1= new Gamer(1, "Ertan", "Sidar","123456", "1997");
		Gamer gamer2= new Gamer(2, "Hakan", "Bahþiþ","456789", "1998");
		
		GamerManager gamerManager= new GamerManager();
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gamerManager.delete(gamer2);
		
		Game game1 = new Game(01,"PES2020",500.0);
		Game game2 = new Game(02,"CALL OF DUTY",550.0);
		
		GameManager  gameManager = new GameManager();
		gameManager.sell(game1, gamer2);
		
		
		
		
		

	}

}
