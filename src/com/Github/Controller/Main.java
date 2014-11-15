package com.Github.Controller;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

public class Main 
{
	public static final Dimension SCREEN_SIZE=Toolkit.getDefaultToolkit().getScreenSize();
	public static final double SCREEN_WIDTH=SCREEN_SIZE.getWidth();
	public static final double SCREEN_HEIGHT=SCREEN_SIZE.getHeight();
	
	public static void main(String[] args)
	{
		MainFrame frame=new MainFrame();
		frame.init();
		frame.showFrame();
	}
	
	public static Point getULPoint(int Width, int Height)
	{
		return new Point((int) SCREEN_WIDTH/2-Width/2, (int) SCREEN_HEIGHT/2-Height/2);
	}
}
