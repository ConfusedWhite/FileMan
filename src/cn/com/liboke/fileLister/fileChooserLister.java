package cn.com.liboke.fileLister;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

public class fileChooserLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser fd = new JFileChooser();
		fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fd.showOpenDialog(null);  
		File f = fd.getSelectedFile();  
		if(f != null){
			inputAddressGirl.getInputAddressGirl().getTextfield().setText(f.getAbsolutePath()+"\\");
		} 
	}

}
