package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import cn.com.liboke.man.fileMan;

public class inputAddressLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		fileMan fileman = fileMan.getFileMan();
		String text =  inputAddressGirl.getInputAddressGirl().getTextfield().getText();
		if(text.length()==0){
			JOptionPane.showMessageDialog(new JPanel(),
					 "输入的地址不能为空", "系统信息", JOptionPane.INFORMATION_MESSAGE);
		}else {
				File file = new File(text);
				if(!(file.exists())){
					JOptionPane.showMessageDialog(new JPanel(),
							 "输入的地址不正确", "系统信息", JOptionPane.INFORMATION_MESSAGE);
				}else {
					fileman.setAddress(file);
			}
		inputAddressGirl.getInputAddressGirl().setVisible(false);
		
		}
	}

}
