import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lab {

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		Studente studente= inserimento();
		System.out.println("fine inserimento\n");
		
		studente.print();
		System.out.println("fine programma\n");

	}

	private static Studente inserimento() throws NumberFormatException, IOException {
		
		
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader xd= new BufferedReader(x);
		
		System.out.println("\nmatricola: ");
		int amatr=Integer.parseInt(xd.readLine());
		System.out.println("\ncognome: ");
		String acognome=xd.readLine();
		System.out.println("\nnome: ");
		String anome=xd.readLine();
		HashSet<Esame> aesami= new HashSet<Esame>();
		int k=9;
		
		while(k!=0) {
			System.out.println("codice esame:  ");
			k=Integer.parseInt(xd.readLine());
			if(k!=0 ) {
				int s;
				String xz;
				
				System.out.println("nome esame: ");
				xz=xd.readLine();
				System.out.println("voto esame: ");
				s=Integer.parseInt(xd.readLine());
				
				Esame j= new Esame(k,xz,s);
				
				aesami.add(j);
			}
			
		}
		
		Studente a=new Studente(amatr,acognome,anome,aesami);
		
		a.toTree();
		return a;
	}

	
	
	

}
