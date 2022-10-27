package UI;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

public class mainFrame4 extends JFrame{

	public TextField text_1;
	String s;
	public mainFrame4(){
		setTitle("显示所有记录");
		setSize(300,150);
		setLocation(600,400);
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String fileName = "E:\\address.txt";
		String line;
		int i;
		i = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			line=in.readLine();
			while(line!=null) {
				i=i+1;
				g.drawString("姓名："+line, 10, 40*i);
				g.drawString("电话："+in.readLine(), 140, 40*i);
				line=in.readLine();
			}
			in.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}


