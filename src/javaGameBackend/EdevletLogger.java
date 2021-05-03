package javaGameBackend;

public class EdevletLogger extends BaseLogger{
	
	public boolean validate(Gamer gamer) {
		if(gamer.getFirstName().length()>0 && gamer.getNationalityId().length()==11) {
			return true;
		}else {
			return false;
		}
		
	}

}
