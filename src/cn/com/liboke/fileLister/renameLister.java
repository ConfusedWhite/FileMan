package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.girl.fileGirl;

public class renameLister implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		do_rdbtnmntmNewRadioItem_2_actionPerformed(e);
	}
	protected static void do_rdbtnmntmNewRadioItem_2_actionPerformed(ActionEvent e) {
		fileGirl window = fileGirl.getFilegirl();
		window.getObtain().setSelected(false);
		window.getCopy().setSelected(false);
		window.getDelete().setSelected(false);
		glogalConstantMan.model = "rename";
	}
}
