package cn.com.liboke.man;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

import cn.com.liboke.constant.glogalConstantMan;
import cn.com.liboke.fileLister.cleanTextLister;
import cn.com.liboke.fileLister.copyLister;
import cn.com.liboke.fileLister.deleteLister;
import cn.com.liboke.fileLister.explainLister;
import cn.com.liboke.fileLister.menuLister;
import cn.com.liboke.fileLister.obtainLister;
import cn.com.liboke.fileLister.renameLister;
import cn.com.liboke.fileLister.startLister;
import cn.com.liboke.girl.fileGirl;
import cn.com.liboke.girl.filterGirl;

/*
 * fileman是个管理者，管理由boy提供的后台数据 然后让girl来显示界面
 */
public class fileMan {
	
	public static fileMan instance;
	public String error =  "";
	
	private  File address = null;
	
	private fileMan(){
		}

	
	public void setAddress(File address){
		this.address = address;
	}
	
	
	public static fileMan getFileMan(){		
		if(instance==null){
            synchronized(filterGirl.class){
                if(instance==null){
                    instance=new fileMan();
                }
            }
        }
        return instance;	
	}
	/*
	 * run方法启用来启动窗口主程序filegirl
	 */
	public void run(){
		try {
			fileGirl window = glogalConstantMan.filegilr;
			
			
			JMenuItem child = window.getMntmnewmenuitem2();		
			JMenuItem help = window.getExplain();
			JMenuItem cleanText = window.getCleanText();
			JButton start = window.getBtnnewbutton();
			JRadioButtonMenuItem Obtain = window.getObtain();
			JRadioButtonMenuItem copy = window.getCopy();
			JRadioButtonMenuItem rename = window.getRename();
			JRadioButtonMenuItem delete = window.getDelete();
			
			/*
			 * 管理监听器
			 */
			child.addActionListener(new menuLister());
			help.addActionListener(new explainLister());
			cleanText.addActionListener(new cleanTextLister());
			start.addActionListener(new startLister());
			Obtain.addActionListener(new obtainLister());
			copy.addActionListener(new copyLister());
			rename.addActionListener(new renameLister());
			delete.addActionListener(new deleteLister());
			
		} catch (Exception e) {
			error = e.toString();
		}	
		
		
	}
	
	
}
