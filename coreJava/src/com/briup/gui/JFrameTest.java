/**
 * 
 */
package com.briup.gui;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.FocusListener;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {

	public JFrameTest(String title) {
		setTitle(title);
		setSize(500,500);
		setLocation(400,150);
		setResizable(true);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JFrameTest jFrame = new JFrameTest("JFrameTest...");
		
	}

}
