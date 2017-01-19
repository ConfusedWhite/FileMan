package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import cn.com.liboke.constant.glogalConstantMan;

public class menuLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		do_mntmNewMenuItem_2_actionPerformed(e);
	}
	/*
	 * 这个用来监听 子目录是否开启
	 */
	protected static void do_mntmNewMenuItem_2_actionPerformed(ActionEvent e) {
		JMenuItem jm = (JMenuItem)e.getSource();
		if(jm.getText().trim().equals("点击开启")){
			jm.setText("点击关闭");
			glogalConstantMan.isChiled=true;
		}
		else {
			jm.setText("点击开启");
			glogalConstantMan.isChiled=false;
		}
	}
}
