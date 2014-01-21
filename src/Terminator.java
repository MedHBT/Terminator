
public class Terminator {
	protected int numSerie ;
	
	
	public Terminator(int numSerie){
		this.numSerie = numSerie ;
	}
	public void sePresente(){
		System.out.println("Je suis un terminator, mon numero de serie est: " + numSerie) ;
	}
	public void termine(){
		System.out.println(" Vous etes termine ! ") ;
	
	}
	public int getNumSerie(){
		return numSerie ;
		}

}
