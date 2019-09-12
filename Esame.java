package prep;

import java.io.Serializable;

public class Esame implements Serializable,Comparable {

	private String nome;
	private int voto;
	
	Esame(String xx,int x){
		
		this.nome=xx;
		this.voto=x;
		
	}
	
	public Esame() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return nome+": "+voto;
		
	}

	@Override
	public int compareTo(Object arg0) {
		Esame x=new Esame();
		x=(Esame) arg0;
		
		if(voto<x.voto) {
			return -1;
		}else if(voto>x.voto) {
			return 1;
		}else return 0;
			
	}

	
}
