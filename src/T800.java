
public class T800 extends Terminator {
	private boolean gentil ;
	public T800(int numSerie){
	   super(numSerie) ;
	this.gentil = true ;
	}
	public void termine(){
		if (gentil)
			System.out.println("Hasta la vista Baby ") ;
		else
			super.termine() ;
	}
	public void setGentil(boolean gentil){
		this.gentil = gentil ;
	}

}
