import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jbutton {

	public static void main(String[] args) {
		JFrame f=new JFrame("Button Example");  
	    final JTextField tf=new JTextField();  
	    tf.setBounds(20,100, 150,20);  
	    JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to Javatpoint.");  				
			}
		});
	    f.add(b);f.add(tf);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}
}
