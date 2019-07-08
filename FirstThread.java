import java.awt.Color;

import javax.swing.*;

public class FirstThread extends Thread{
   
	FirstThread(){
		count++;
		
		
	}
	int count=0;
	public void run(){
			while(count<50) {
				count++;
				try {
				Thread.sleep(500);
			System.out.println("x: "+count);
			
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			}
		
	
	public static void main(String[] args)  {
		Thread x=new Thread(new FirstThread());
		x.setPriority(NORM_PRIORITY);
		x.start();
	/*	JFrame f= new JFrame("Thread conta");
		f.setBounds(500,500,600,300);
		f.setVisible(true);
		JLabel label1=new JLabel("xddd");	
		f.add(label1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		f.getContentPane().setBackground(Color.green);
		label1.setText("Tira ");
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
		
		label1.setOpaque(true);
		label1.setBackground(Color.cyan);
		label1.setForeground(Color.red);
		label1.setText("zsaa ");	
*/		
	}

}
