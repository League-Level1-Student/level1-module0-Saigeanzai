package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x= 40;
int y= 230;
int birdYVelocity = -10;
int gravity = 1;
int pipeX = 200;
int pipex2 = 200;
int upperPipeHeight = (int) random(100, 400);
int lowerPipeHeight = (int) random(100,400);
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        size (800, 600);
        teleportPipes();
    }

    @Override
    public void draw() {
    	background(163, 210, 211);
    	fill(238,231, 154);
    	stroke(93, 168, 184);
    	ellipse(x, birdYVelocity, 40, 40);
    	 birdYVelocity+=3;
    	 gravity+=5;
    	// birdYVelocity= -5;
    	 fill(243, 194, 118);
    	 rect(pipeX, lowerPipeHeight, 40, 600);
pipeX -= 5;
    		teleportPipes(); 
    		fill(243, 194, 118);
    		rect(pipex2, 0, 40, upperPipeHeight);
    		teleportUpperPipes();
    		pipex2 -= 5;
    		
    		int pipeGap = 145;
    		lowerPipeHeight = upperPipeHeight + pipeGap;
    		
    		
    		
    	 }
    
    public void mousePressed() {
    	birdYVelocity -= 130;
    }
    public void teleportPipes() {
    	if (pipeX==0) {
    		pipeX=+ 800;
    	} 
    	int upperPipeHeight = (int) random(100, 400);

}
    public void teleportUpperPipes() {
    	
		if (pipex2==0) {
			pipex2+=800;
			Random rand = new Random();
	    	upperPipeHeight = rand.nextInt(400);
		}
		
			
	    	
		
	}
    boolean intersectsPipes() { 
        if (birdYVelocity < upperPipeHeight && x > pipeX && x < (pipeX+40)){
           return true; }
       else if (birdYVelocity>lowerPipeHeight && x > pipeX && x < (pipeX+40)) {
           return true; }
       else { return false; }
}


    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
