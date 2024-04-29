package _04_gui_from_scratch._2_jack_in_the_box;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.applet.AudioClip;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class jack_in_the_box implements ActionListener {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	

	
	
	
	
	
         
	 
	 
	
	
	
	
	public void showButton() {
		// TODO Auto-generated method stub
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
	
	}
	public void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage(String fileName) {
	     try {
	          java.net.URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	
	
}
