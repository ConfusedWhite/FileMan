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
	 * ����������� ��Ŀ¼�Ƿ���
	 */
	protected static void do_mntmNewMenuItem_2_actionPerformed(ActionEvent e) {
		JMenuItem jm = (JMenuItem)e.getSource();
		if(jm.getText().trim().equals("�������")){
			jm.setText("����ر�");
			glogalConstantMan.isChiled=true;
		}
		else {
			jm.setText("�������");
			glogalConstantMan.isChiled=false;
		}
	}
}
