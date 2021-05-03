package javaGameBackend;

public class GameManager implements GameService {
	

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + game.getGameName()+" bought " );		
	}
	
	

}
