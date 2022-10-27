package UI;

import java.awt.Button;
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

public class mainFrame3 extends JFrame implements ActionListener{
	public String s3,s4;
	public TextField text_1;
	public TextField text_2;
	public mainFrame3(){
		setTitle("查询记录");
		setSize(300,150);
		setLocation(600,400);
		setLayout(new GridLayout(3,2));
		text_1 = new  TextField();
		text_2 = new  TextField();
		Label lab_1 = new Label("请输入要查找的联系人姓名");
		Label lab_2 = new Label("该联系人手机号码是");
		Button bt11 = new Button("确定"); 
		Button bt12 = new Button("清空"); 
		bt11.addActionListener(this);
		bt12.addActionListener(this);
		add(lab_1);add(text_1);
		add(lab_2);add(text_2);
		add(bt11);add(bt12);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bt = e.getActionCommand();
		if(bt.equals("确定")) {String fileName = "E:\\address.txt";
		String line;
				try {
					BufferedReader in = new BufferedReader(new FileReader(fileName));
					line=in.readLine();
					while(line!=null) {
						if(line.equals(text_1.getText())) {
							System.out.println("asdwd");
							s3=line;
							s4=in.readLine();
							text_1.setText(""+s3);
							text_2.setText(""+s4);
						}
						line=in.readLine();
					}
					in.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}	
		if(bt.equals("清空")) {text_1.setText("");
		text_2.setText("");
		}
	}

}

