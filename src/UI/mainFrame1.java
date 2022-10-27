package UI;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

public class mainFrame1 extends JFrame implements ActionListener{
	public TextField text_1;
	public TextField text_2;
	public mainFrame1(){
		setTitle("增加记录");
		setSize(300,150);
		setLocation(600,400);
		setLayout(new GridLayout(3,2));
		text_1 = new  TextField();
		text_2 = new  TextField();
		Label lab_1 = new Label("请输入联系人姓名");
		Label lab_2 = new Label("请输入联系人手机号码");
		Button bt7 = new Button("确定"); 
		Button bt8 = new Button("清空"); 
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		add(lab_1);add(text_1);
		add(lab_2);add(text_2);
		add(bt7);add(bt8);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bt = e.getActionCommand();
		if(bt.equals("确定")) {File addressbook = new File("E:\\address.txt");
				try {
					FileWriter raf = new FileWriter("E:\\address.txt");
					String s1 = text_1.getText();
					String s2 = text_2.getText();
					raf.write(s1+"\r\n");
					raf.write(s2+"\r\n");
					raf.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
		if(bt.equals("清空")) {text_1.setText("");
		text_2.setText("");
		}
		
	}
	
}
