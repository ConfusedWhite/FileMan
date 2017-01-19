package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.com.liboke.boy.filterBoy;
import cn.com.liboke.boy.stringBoy;
import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.girl.fileGirl;
import cn.com.liboke.girl.filterGirl;
import cn.com.liboke.man.fileMan;
import cn.com.liboke.man.inspectBoy;
import cn.com.liboke.man.processMan;

public class okButtonForFiltergirl implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		do_okButton_actionPerformed(arg0);
	}
	protected void do_okButton_actionPerformed(ActionEvent arg0) {
		new processMan();
		glogalConstantMan.filtergirl.setVisible(false);
		
	}
}
