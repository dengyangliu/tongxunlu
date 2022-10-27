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

public class mainFrame2 extends JFrame implements ActionListener{
	public TextField text_1;
	public TextField text_2;
	public mainFrame2(){
		setTitle("删除记录");
		setSize(300,150);
		setLocation(600,400);
		setLayout(new GridLayout(3,2));
		text_1 = new  TextField();
		text_2 = new  TextField();
		Label lab_3 = new Label("请输入要删除的联系人姓名");
		Label lab_4 = new Label("是否删除成功");
		Button bt9 = new Button("确定"); 
		Button bt10 = new Button("清空"); 
		bt9.addActionListener(this);
		bt10.addActionListener(this);
		add(lab_3);add(text_1);
		add(lab_4);add(text_2);
		add(bt9);add(bt10);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bt = e.getActionCommand();
		if(bt.equals("确定")) {String[] copy = new String[1000];int i=0,a,t=0;
		String b;
		String fileName = "E:\\address.txt";
				try {
					BufferedReader in = new BufferedReader(new FileReader(fileName));
					b=in.readLine();
					while(b!=null) {
						if(b.equals(text_1.getText())){
							in.readLine();
							text_2.setText("成功");
							t=1;
						}
						else {
							i++;
							copy[i]=b;
						}
						b=in.readLine();
					}
					if(t==0) {text_2.setText("查找不到此人删除失败");}
					in.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				String 重写文件 = "E:\\address.txt";
				try{
					FileWriter writer = new FileWriter(重写文件);
					for(a=1;a<i+1;a++) {
						writer.write(copy[a]+"\r\n");
					}
					writer.close();
				}catch(IOException e1){}
		}
		if(bt.equals("清空")) {text_1.setText("");
		text_2.setText("");
		}
		
	}
	
}

