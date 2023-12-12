package _01_methods._1_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		// robot();
Random height = new Random();
		int small = 60;
		int large = 250;
		int medium = 120;
		
		for (int i = 0; i < 10; i++) {
			int size = height.nextInt(3);
			if (size==0) {
				drawSmall(small);
			}
			if (size==1) {
				drawMedium(medium);
			}
			if (size==2) {
				drawLarge(large);
			}
		}

	}

	public void drawSmall(int height) {
		
		rob.setRandomPenColor();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		rob.move(height);
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
		rob.move(height);
		rob.setPenColor(80, 138, 19);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
	}

	 void drawMedium(int height) {
		
		rob.setRandomPenColor();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		rob.move(height);
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
		rob.move(height);
		rob.setPenColor(80, 138, 19);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
	}

	 void drawLarge(int height) {
		
		rob.setRandomPenColor();
		rob.miniaturize();
		rob.penDown();
		rob.setSpeed(100);
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.setPenColor(80, 138, 19);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
	}
}
