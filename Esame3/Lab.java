package prep;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Lab implements Serializable{

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException,InterruptedException {
		Studente studente=inserimento();
		System.out.println("fine inserimento\n");
		
		String nomeFile="MyFile.txt";
		
		serializzazione(studente,nomeFile);
		
		studente=null;
		System.out.println("Contenuto variabile studente: "+studente);
		System.out.println("fine serializzazione \n");
		
		studente=deserializzazione(nomeFile);
		
		studente.print();
		
		System.out.println("\nfine programma");

	}

	private static void serializzazione(Studente studente, String nomeFile) throws IOException {
		
		FileOutputStream f=new FileOutputStream(nomeFile);
		ObjectOutputStream out=new ObjectOutputStream(f);
		
		out.writeObject(studente);
		
		
		
		
		
		
		
	}

	private static Studente inserimento() throws IOException {
		
		int matrx,votox;
		String nomx,cogx;
		String nomeEs="a";
		TreeSet<Esame> esx=new TreeSet<Esame>();
		
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(i);
		
		System.out.println("Matricola: ");
		matrx=Integer.parseInt(in.readLine());
		
		System.out.println("Nome: ");
		nomx=in.readLine();
		
		System.out.println("Cognome: ");
		cogx=in.readLine();
		
		while(!nomeEs.isEmpty()) {
				
			System.out.println("Nome esame: ");
			nomeEs=in.readLine();
			
			if(!nomeEs.isEmpty()) {
					
				System.out.println("Voto esame: ");
				votox=Integer.parseInt(in.readLine());
				
				esx.add(new Esame(nomeEs,votox));
				
			}
						
		}
		
		Studente a=new Studente(matrx,nomx,cogx,esx);
		return a;
	}


	private static Studente deserializzazione(String nomeFile) throws IOException, ClassNotFoundException {
		
		FileInputStream in=new FileInputStream(nomeFile);
		ObjectInputStream o=new ObjectInputStream(in);
		
		Studente a=new Studente();
		
		a=(Studente) o.readObject();
		
		return a;
	}
	
	
	
}
