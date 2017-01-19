package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.girl.filterGirl;

public class canceButtonForFiltergirl implements ActionListener {
@Override
	public void actionPerformed(ActionEvent e) {
		do_cancelButton_actionPerformed(e);
	}
	protected void do_cancelButton_actionPerformed(ActionEvent e) {
		glogalConstantMan.filtergirl.setVisible(false);
	}
}
