package com.canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class CanvasExample {
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("Maze");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DCanvas dc = new DCanvas();
		dc.setSize(350, 350);
		dc.setBackground(Color.WHITE);
		
		Container contentPane = frame.getContentPane();
		contentPane.add(dc);

		frame.setSize(350, 350);
		frame.setVisible(true);
		
	}
	
}

class DCanvas extends Canvas {
	
	int len = 5;
	
	public void drawMaze(Graphics g, int x, int y){
		g.setColor(Color.BLACK);
		g.drawRect(x, y, len, len);
	}
}
