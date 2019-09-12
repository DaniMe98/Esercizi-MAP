
public class CloneExample implements Cloneable{

	public static void main(String[] args) {
		
		//shallow copy
		Studente studente=new Studente(676436,new Corso(1,"ASD"));
		Studente studente2=null;
		
		try {
			studente2=(Studente) studente.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		studente2.corso.Materia="Bio";
		
		System.out.println(studente2);
		
		//deep copy
		System.out.println(studente);
		
		
	}

}
