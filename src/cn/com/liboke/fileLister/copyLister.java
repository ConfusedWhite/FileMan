package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.girl.fileGirl;

public class copyLister implements ActionListener {
	public copyLister() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		do_rdbtnmntmNewRadioItem_1_actionPerformed(e);
	}
	protected static void do_rdbtnmntmNewRadioItem_1_actionPerformed(ActionEvent e) {
		fileGirl window = glogalConstantMan.filegilr;
		window.getObtain().setSelected(false);
		window.getRename().setSelected(false);
		window.getDelete().setSelected(false);
		JRadioButtonMenuItem jr = (JRadioButtonMenuItem)e.getSource();
		if(jr.isVisible()){
			glogalConstantMan.model = "copy";
		}else{
			glogalConstantMan.model = null;
		}
	}
}
