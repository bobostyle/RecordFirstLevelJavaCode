package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Frame.java
 * 2016��5��11������11:38:53
 * @author cbb
 * TODO ����һ�����壬����java��swing����һЩ�������÷�
 */
public class FramePractice extends JFrame{
	
     private static JButton button;
	 public FramePractice(){
		  button = new JButton("ȷ��");  
		 button.setSize(100, 100);
	}
	public  static void main(String []args){
		  
		FramePractice frame = new FramePractice();
		frame.setSize(800,800);
		frame.add(button);
		frame.setVisible(true);
		frame.changeButtonStatus();
	}
	public void changeButtonStatus(){
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actionevent) {
				if(actionevent.getSource().equals(button)){
				button.setName("ȡ��");
				button.setBackground(getForeground());
				}
			}
		});
		
	}
}
