
public class es {
	private int codice;
	private String descrizione;
	private int voto;
	
	
	es(int x,String y, int z){
		this.codice=x;
		this.descrizione=y;
		this.voto=z;
	}
	
	
	public String toString() {
				
		return descrizione+": "+voto;
		
	}
}
