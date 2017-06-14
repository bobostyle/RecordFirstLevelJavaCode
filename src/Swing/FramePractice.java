package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Frame.java
 * 2016年5月11日下午11:38:53
 * @author cbb
 * TODO 创建一个窗体，属性java的swing包中一些函数的用法
 */
public class FramePractice extends JFrame{
	
     private static JButton button;
	 public FramePractice(){
		  button = new JButton("确定");  
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
				button.setName("取消");
				button.setBackground(getForeground());
				}
			}
		});
		
	}
}
