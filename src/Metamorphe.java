
public class Metamorphe extends Terminator {
	protected String description ;
	public Metamorphe(int numSerie){
		super(numSerie) ; 
		this.description = "rien" ;
		}
		public void seMetamorphose(String description){
		this.description = description ;
		}
		public void seDecrit(){
		System.out.println("Je suis un terminator metamorphe qui ressemble a " + description) ;
		}

}
