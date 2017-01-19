package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.com.liboke.girl.fileGirl;

public class cleanTextLister implements ActionListener {
	public void actionPerformed(ActionEvent arg0) {
		do_mnNewMenu_actionPerformed(arg0);
	}
	protected void do_mnNewMenu_actionPerformed(ActionEvent arg0) {
		fileGirl.getFilegirl().getTextarea().setText("");
	}
}
