
public class TestTerminator {

	public static void main(String[] args) {
		System.out.println("******");
		System.out.println("Test") ;
		System.out.println("******");
		
		Terminator t1 = new Terminator(1464800);
		T800 t2 = new T800(2);
		Metamorphe t3 = new Metamorphe(3);
		TX t4 = new TX(4, "un Transformers");
		t1.sePresente();
		t2.sePresente();
		t3.sePresente();
		t4.sePresente();
		t1.termine();
		t2.termine();
		t3.termine();
		t4.termine();
		t3.seDecrit();
		t4.seDecrit();
		t3.seMetamorphose("un T800");
		t4.seMetamorphose("une brute");
		t3.seDecrit();
		t4.seDecrit();
		t4.reprogramme(t2);
		t2.termine();
	}
	
	

}
