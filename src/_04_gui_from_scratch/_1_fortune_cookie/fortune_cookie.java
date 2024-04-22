package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {

	
	
	
	JFrame frame = new JFrame();
	
	
        public void showButton() {
            System.out.println("Button clicked");  
            frame.setVisible(true);
            JButton button = new JButton();
            frame.add(button);
            frame.pack();
            button.addActionListener(this);
            
            
            
            
            
       }


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Woohoo!");
			
			  int rand = new Random().nextInt(5);
			if (rand==1) {
				JOptionPane.showMessageDialog(null, "fortune 1");	
		}
			if (rand==2) {
				JOptionPane.showMessageDialog(null, "fortune 2");	
		}
			if (rand==3) {
				JOptionPane.showMessageDialog(null, "fortune 3");	
		}
			if (rand==4) {
				JOptionPane.showMessageDialog(null, "fortune 4");	
		}
			if (rand==5) {
				JOptionPane.showMessageDialog(null, "fortune 5");	
		}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
