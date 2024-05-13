package _04_gui_from_scratch._3_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
    JButton button2 = new JButton();
	
	public void showButton() {
        
        frame.setVisible(true);
        button.setText("click me!");
        button2.setText("click me!");
        panel.add(button2);
        panel.add(button);
        frame.add(panel);
        frame.pack();
        button.addActionListener(this);
        button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button)) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if(buttonPressed.equals(button2)) {
			playSound("sawing-wood-daniel_simon.wav");
			System.out.println();
		}
		
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
	
	
	
	
	
}
