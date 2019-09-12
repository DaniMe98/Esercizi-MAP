import java.util.*;

public class provaPila extends Thread {

	Exam h;
	static Stack<Exam> m=new Stack<>();
	
	public void run() {
		System.out.println(m.pop());
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		m.add(new Exam(3,"map",21));
		m.add(new Exam(4,"asd",22));
		m.add(new Exam(5,"pop",20));
		m.add(new Exam(6,"cac",25));
		
		while(!m.empty()) {
			provaPila x=new provaPila();
			x.start();
			//x.sleep(500);
		}
		
	
		
	}

}
