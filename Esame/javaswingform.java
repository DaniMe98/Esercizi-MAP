
import java.awt.Container;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.*;


public  class javaswingform {
	
	static String[] nomicolonne={"codice","descrizione","voto"};
	static Object[][] o={{"1","ASD","21"},{"2","Programmazione","22"},{"3","MAP","23"}};
	static JFrame f=new JFrame("ex");
	static Container c=f.getContentPane();
	static JTextField j=new JTextField("");
	static JTextField js=new JTextField("     ");
	static JTextField jsn=new JTextField("     ");
	static JTable tabb= new JTable(o,nomicolonne);
	static JButton Button2=new JButton("clear");
	static boolean interruttore=false;
	
private static class seclic implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<es> esa=new ArrayList<es>();
		
		esa.add(new es(1,"ASD",21));
		esa.add(new es(2,"programmazione",22));
		esa.add(new es(3,"Map",23));

		int x=Integer.parseInt(j.getText());
		
		stud dani=new stud(x,js.getText(),jsn.getText(),esa);
		try {
			dani.print();
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
}





private static class trclic implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
		
	}
	
}


private static class clic implements ActionListener {
		@Override
	public void actionPerformed(ActionEvent e) {
			
			c.removeAll();
			JLabel ca=new JLabel("Matricola");
			c.add(ca);
			JLabel cs=new JLabel("Cognome");
			
			c.add(new JTextField("     "));
			
			c.add(cs);
			c.add(new JTextField("     "));
			JLabel csx=new JLabel("Nome");
			c.add(csx);
			c.add(new JTextField("     "));
		//	String[] nomicolonne={""};
			//Object[][] o={{""}};
			c.add(new JTable(o,nomicolonne));
			c.add(new JLabel());
			
			JButton Button1=new JButton("submit");
			JButton Button2=new JButton("clear");
			JButton Button3=new JButton("exit");
			
			
			c.add(Button1);
			c.add(Button2);
			c.add(Button3);
			
			Button1.addActionListener( new seclic() );
			Button2.addActionListener( new clic() );
			Button3.addActionListener( new trclic() );
			
			f.setSize(500,400);
			f.setVisible(true);
		
			}
	}

	public static void main(String[] args) {
		
		
		
		LayoutManager L= new GridLayout(6,2,15,15);
		
		c.setLayout(L);
		
		JLabel ca=new JLabel("	Matricola");
		c.add(ca);
		JLabel cs=new JLabel("	Cognome");
		
		 
		c.add(j);
		
		c.add(cs);
		c.add(js);
		JLabel csx=new JLabel("	Nome");
		c.add(csx);
		c.add(jsn);
		
		c.add(tabb);
		c.add(new JLabel());
		
		JButton Button1=new JButton("submit");
		JButton Button2=new JButton("clear");
		JButton Button3=new JButton("exit");
		
		Button2.setEnabled(false);
		
			if(interruttore)
				Button2.setEnabled(true);
		
		c.add(Button1);
		c.add(Button2);
		c.add(Button3);
		
		
		
		
		Button1.addActionListener( new seclic() );
		Button2.addActionListener( new clic() );
		Button3.addActionListener( new trclic() );
		f.setSize(500,400);
		f.setVisible(true);
		
		
		
		
		
		
	}
	
	
	

}
