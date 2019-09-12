package prep;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Studente implements Serializable{
		
		private int matricola;
		private String cognome;
		private String nome;
		private static TreeSet<Esame> esami= new TreeSet<Esame>();
		static Iterator<Esame> it=esami.iterator();
		
		public class tread extends Thread{
			public void run() {
				System.out.println(it.next());
			}
		}
		
		Studente(){
			
		}
		
		Studente(int x,String g,String h,TreeSet<Esame> m){
			
			this.matricola=x;
			this.nome=g;
			this.cognome=h;
			this.esami=m;			
			Iterator <Esame> its=m.iterator();
			it=its;
		}
		
		
		
		
		public void print() throws InterruptedException {
			
			System.out.println("matricola: "+this.matricola);
			System.out.println("cognome: "+this.cognome);
			System.out.println("nome: "+this.nome);
			
			System.out.println("\n esami sostenuti: ");
			//Collections.sort(esami);
			//Iterator<Esame> is=esami.iterator();
			//it=is;
			
			
			while(it.hasNext()) {
				tread x=new tread();
				x.start();
				Thread.sleep(200);
			}
			
		}
		
		
		
		
		
		
		
}
