package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.man.inspectBoy;

public class selsectAddressLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser jfc = new JFileChooser("Ñ¡ÔñÎÄ¼þ");
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfc.showOpenDialog(null);
		glogalConstantMan.selsectaddressgirl.getTextField().setText(jfc.getSelectedFile().getAbsolutePath()); 
	}

}
