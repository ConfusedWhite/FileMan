package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.man.inspectBoy;
import cn.com.liboke.man.processMan;

public class sureAddressLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		glogalConstantMan.address = new File(glogalConstantMan.selsectaddressgirl.getTextField().getText());
		
		glogalConstantMan.standbySwitchForFilter = true;
		
		new processMan();
		glogalConstantMan.selsectaddressgirl.setVisible(false);
	}

}
