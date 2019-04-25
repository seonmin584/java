package qqq;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class www extends JFrame{
	public www() {
	setTitle("Å×½ºÆ®");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.addMouseMotionEvent(new MyMouseMotionEvent());
	
	setSize(250, 250);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new www();
	}

}
