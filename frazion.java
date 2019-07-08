import java.io.*;

public class frazion implements Serializable {

	private int numeratore;
	private int denominatore;
	private transient String code;      //variabile transient,quindi non verrà serializzata
	frazion(){this.numeratore=1;
				this.denominatore=1;
				this.code="222";}
	
	frazion(int x,int y,String z){
		this.numeratore=x;
		this.denominatore=y;
		this.code=z;
	}
	
	frazion(int x){
		this.numeratore=x;
		this.denominatore=1;
	}
	
	frazion(String x){
		String[] c=x.split("/");
		this.numeratore=Integer.parseInt(c[0]);
		this.denominatore=Integer.parseInt(c[1]);
		
	}
	
	public double somma(frazion f) {
		
		double ris=0.0;
		
		if(this.denominatore==0 || f.denominatore==0) {
			throw new ArithmeticException();
		}
		int c,k,j;
		j=f.denominatore*this.denominatore;
		c=f.denominatore*this.numeratore;
		k=this.denominatore*f.numeratore;
		
		ris=c+k;
		
		return ris/j;
	}
	
	public double inter(frazion f) {
		
		try {
		return this.somma(f);
		}catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		
		frazion sa=new frazion(2,7,"54");
		frazion ss=new frazion("22/8");
		
		System.out.println("sa + ss = "+ss.inter(sa));
		System.out.println("Ora Salvo su file");
		
		try{
			FileOutputStream x=new FileOutputStream("Frazioni.dat");
			ObjectOutputStream xy= new ObjectOutputStream(x);
			xy.writeObject(ss);
			xy.writeObject(sa);
			xy.writeObject(ss);
			
			xy.close();
			x.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Serializzato correttamente");
		
		System.out.println("Ora deserializzo e leggo");
		
		try {
			FileInputStream b=new FileInputStream("Frazioni.dat");
			ObjectInputStream ba= new ObjectInputStream(b);
			frazion[] sx =new frazion[3];
			sx[0]=(frazion)ba.readObject();
			sx[1]=(frazion)ba.readObject();
			sx[2]=(frazion)ba.readObject();
			
			
			System.out.println("sx 1: "+ sx[0].denominatore+" e "+sx[0].numeratore+ " code "+sx[0].code);
			System.out.println("sx 2: "+ sx[1].denominatore+" e "+sx[1].numeratore+ " code "+sx[1].code);
			System.out.println("sx 3: "+ sx[2].denominatore+" e "+sx[2].numeratore+ " code "+sx[2].code);

			ba.close();
			b.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
