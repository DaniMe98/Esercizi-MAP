import java.io.IOException;

public class Lab {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Studente studente= Studente.inserimento();
		System.out.println("fine inserimento\n");
		
		studente.print();
		System.out.println("fine programma\n");

	}

	

}
