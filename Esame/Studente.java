import java.util.*;
import java.io.*;
import java.lang.Comparable;

public class Studente {
	private int matricola;
	private String cognome;
	private String nome;
	private HashSet<Esame> esami =new HashSet<Esame>();
	private TreeSet<Esame> Tesami =new TreeSet<Esame>();
	

	
	public static Studente inserimento() throws NumberFormatException, IOException {
		Studente a=new Studente();
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader xd= new BufferedReader(x);
		
		System.out.println("\nmatricola: ");
		a.matricola=Integer.parseInt(xd.readLine());
		System.out.println("\ncognome: ");
		a.cognome=xd.readLine();
		System.out.println("\nnome: ");
		a.nome=xd.readLine();
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
				
				if(!a.equal(k,a.esami)) {
					
					a.esami.add(j);
				}
			}
			
		}
		a.ordinam();
		
		return a;
	}
	
	
	public void print() {
		System.out.println("nome : "+this.nome);
		System.out.println("cognome: " +this.cognome);
		System.out.println("matricola: "+this.matricola);
		Iterator<Esame> its=Tesami.iterator();
		
		Thread x=new t();
		while(its.hasNext()) {
			System.out.println("entrato");
			x.start();
		/*	Esame nuovo=new Esame();
			nuovo=its.next();
			
			System.out.println(nuovo.toString());
		*/
		
		}
		
	}
	
	
		
		
	public boolean equal(int k,HashSet<Esame> a) {
		Iterator<Esame> it=a.iterator();
		boolean ks=false;
		
		while(it.hasNext()) {
			
			Esame nuovo=new Esame();
			Esame nuovox=new Esame(k);
			nuovo=it.next();
			ks=nuovo.equals(nuovox);
			
	
		
		}
		
	
		return ks;


	}
	
	public void toTree() {
		
		Iterator<Esame> it=esami.iterator();
				
		while(it.hasNext()) {
			this.Tesami.add(it.next());
			
		}
		
	}

	
	public void ordinam() {
		this.toTree();
		Esame prova3=new Esame();
		Iterator<Esame> it=Tesami.iterator();
		Iterator<Esame> itr=Tesami.iterator();
		itr.next();
		while(it.hasNext()) {
			Esame prova1=it.next();
			while(itr.hasNext()) {
				Esame prova2= itr.next();
				if(prova1.compareTo(prova2)<0) {
					prova3=prova1;
					prova1=prova2;
					prova2=prova3;
				}
				
			}
						
		}
	}	
	
	class t extends Thread{

		TreeSet<Esame> ws=new TreeSet<Esame>();
		
		t(TreeSet<Esame> w){
			
			Iterator<Esame>it=w.iterator();
			while(it.hasNext()) {
				ws.add(it.next());
			}
		}
		
		
		public void run() {
		
		Esame nuovo=new Esame();
		nuovo=its.next();
		
		System.out.println(nuovo.toString());
		}
	}
	
	
}
