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
	private TextField text_1;//�����ı����루������
	private TextField text_2;//�����ı����루�绰��
	private RandomAccessFile raf;
	
	public tongxun() {
		JFrame mainFrame = new JFrame("ͨѶ¼");
		mainFrame.setLocation(600,400);
		mainFrame.setSize(400,200);
		mainFrame.setLayout(null);
		
		Button bt1 = new Button("���Ӽ�¼");
		mainFrame.add(bt1);
		bt1.setLocation(10,30);
		bt1.setSize(80,25);
		bt1.addActionListener(this);
		
		Button bt2 = new Button("ɾ����¼");
		mainFrame.add(bt2);
		bt2.setLocation(120,30);
		bt2.setSize(80,25);
		bt2.addActionListener(this);
		
		Button bt3 = new Button("�޸ļ�¼");
		mainFrame.add(bt3);
		bt3.setLocation(120,65);
		bt3.setSize(80,25);
		bt3.addActionListener(this);
		
		Button bt4 = new Button("��ѯ��¼");
		mainFrame.add(bt4);
		bt4.setLocation(10,65);
		bt4.setSize(80,25);
		bt4.addActionListener(this);
		
		Button bt5 = new Button("�˳�");
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
		if(bt.equals("���Ӽ�¼")) {mainFrame1 m = new mainFrame1();}
		if(bt.equals("ɾ����¼")) {mainFrame2 m = new mainFrame2();}
		if(bt.equals("��ѯ��¼")) {mainFrame3 m = new mainFrame3();}
		if(bt.equals("��ʾ���м�¼")) {mainFrame4 m = new mainFrame4();}
		if(bt.equals("�˳�")) {System.exit(0);}
		
	}
	
}
