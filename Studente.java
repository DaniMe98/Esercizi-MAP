import java.util.*;



public class Studente {
	private int matricola;
	private String cognome;
	private String nome;
	private HashSet<Esame> esami =new HashSet<Esame>();
	private static TreeSet<Esame> Tesami =new TreeSet<Esame>();
	static Iterator<Esame> its=Tesami.iterator();
	
	Studente(int x,String y,String h,HashSet<Esame> a){
		this.matricola=x;
		this.cognome=y;
		this.nome=h;
		this.esami=a;
	}

	
	
	
	
	public void print() throws InterruptedException {
		System.out.println("nome : "+this.nome);
		System.out.println("cognome: " +this.cognome);
		System.out.println("matricola: "+this.matricola);
		
		System.out.println("esami sostenuti:\n");
		
		 
		
		
		while(its.hasNext()) {
			Thread xy=new t();
			xy.start();
			Thread.sleep(200);
		
		
		}
		
	}
	
	
	
	public void toTree() {
		
		Iterator<Esame> it=esami.iterator();
				
		while(it.hasNext()) {
			Tesami.add(it.next());
			
		}
		its=Tesami.iterator();
	}

	
	class t extends Thread{

		TreeSet<Esame> ws=new TreeSet<Esame>();
		
	/*	t(TreeSet<Esame> w){
			
			Iterator<Esame>it=w.iterator();
			while(it.hasNext()) {
				ws.add(it.next());
			}
		}*/
		
		
		public void run() {
		
				System.out.println(its.next());
				
		
				
		}
	}
	
	
}
