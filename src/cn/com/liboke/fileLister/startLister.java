package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.com.liboke.man.fileMan;
import cn.com.liboke.man.processMan;

public class startLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			do_btnNewButton_actionPerformed(e);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) throws InterruptedException {
		new processMan();
	}
}
