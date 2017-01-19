package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.girl.fileGirl;

public class obtainLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		do_rdbtnmntmNewRadioItem_actionPerformed(e);
	}
	protected static void do_rdbtnmntmNewRadioItem_actionPerformed(ActionEvent e) {
		fileGirl window = fileGirl.getFilegirl();
		window.getCopy().setSelected(false);
		window.getRename().setSelected(false);
		window.getDelete().setSelected(false);
		glogalConstantMan.model = "obtain";
	}
}
