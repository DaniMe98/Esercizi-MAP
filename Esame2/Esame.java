import java.lang.*;
import java.util.Comparator;
public class Esame implements Comparable{
	//public static Comparator compareTo;
	private int codice;
	private String nome;
	private int voto;
	
	
	Esame(){
		
	}
	
	Esame(int k){
		this.codice=k;
	}
	
	Esame(int g,String c,int v){
		this.codice=g;
		this.nome=c;
		this.voto=v;
	}
	
	
	public String toString() {
		return this.nome+": "+this.voto;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice != other.codice)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		int result;
		Esame x=(Esame) o;
		if(this.voto>x.voto) {
			result=-1;
		}else if(this.voto<x.voto) {
			result=1;
		}else {
			result=0;
		}
		
		
		return result;
	}
		
	
	
	
}
