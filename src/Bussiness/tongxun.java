package Bussiness;

import UI.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;

import javax.swing.JFrame;

import UI.mainFrame1;
import UI.mainFrame2;
import UI.mainFrame3;
import UI.mainFrame4;

public class tongxun extends JFrame implements ActionListener{
	private TextField text_1;//单行文本输入（姓名）
	private TextField text_2;//单行文本输入（电话）
	private RandomAccessFile raf;
	
	public tongxun() {
		JFrame mainFrame = new JFrame("通讯录");
		mainFrame.setLocation(600,400);
		mainFrame.setSize(400,200);
		mainFrame.setLayout(null);
		
		Button bt1 = new Button("增加记录");
		mainFrame.add(bt1);
		bt1.setLocation(10,30);
		bt1.setSize(80,25);
		bt1.addActionListener(this);
		
		Button bt2 = new Button("删除记录");
		mainFrame.add(bt2);
		bt2.setLocation(120,30);
		bt2.setSize(80,25);
		bt2.addActionListener(this);
		
		Button bt3 = new Button("修改记录");
		mainFrame.add(bt3);
		bt3.setLocation(120,65);
		bt3.setSize(80,25);
		bt3.addActionListener(this);
		
		Button bt4 = new Button("查询记录");
		mainFrame.add(bt4);
		bt4.setLocation(10,65);
		bt4.setSize(80,25);
		bt4.addActionListener(this);
		
		Button bt5 = new Button("退出");
		mainFrame.add(bt5);
		bt5.setLocation(10,100);
		bt5.setSize(80,25);
		bt5.addActionListener(this);
		
		mainFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bt = e.getActionCommand();
		if(bt.equals("增加记录")) {mainFrame1 m = new mainFrame1();}
		if(bt.equals("删除记录")) {mainFrame2 m = new mainFrame2();}
		if(bt.equals("查询记录")) {mainFrame3 m = new mainFrame3();}
		if(bt.equals("显示所有记录")) {mainFrame4 m = new mainFrame4();}
		if(bt.equals("退出")) {System.exit(0);}
		
	}
	
}
