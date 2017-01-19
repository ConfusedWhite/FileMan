package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;

import cn.com.liboke.constant.glogalConstantMan;

public class filtercheckLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		do_filterCheck_actionPerformed(e);
	}
	protected void do_filterCheck_actionPerformed(ActionEvent e) {
		JCheckBoxMenuItem check = (JCheckBoxMenuItem)e.getSource();
		glogalConstantMan.isFilter = check.isSelected();
	}
}
