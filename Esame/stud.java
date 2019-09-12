import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class stud extends Thread {

	private int matricola;
	private String nome;
	private String cognome;
	private static List<es> esami=new ArrayList<es>();
	static Iterator<es> it=esami.iterator();
	stud(int x,String c, String y, ArrayList<es> s){
		matricola=x;
		nome=c;
		cognome=y;
		esami=s;
		Iterator<es> itr=s.iterator();
		it=itr;
	}
	
	public stud() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println(it.next());
	/*	try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		System.out.println(it.hashCode());
	}
	
	
	public void print() throws InterruptedException {
		
		
		System.out.println( "matricola : "+ this.matricola +"\ncognome : "+cognome+"\nnome :" +nome);
		while(it.hasNext()) {
			stud c=new stud();
			c.start();
			c.sleep(0);
			
		}
			
	}
	
}
