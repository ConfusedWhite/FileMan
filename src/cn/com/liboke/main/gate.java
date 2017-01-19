package cn.com.liboke.main;

import java.io.IOException;

import cn.com.liboke.man.fileMan;
/* FM  file management(文件管理)  
 * @cn.com.liboke.boy				底层功能
 * @cn.com.liboke.constant 			全局变量、常量
 * @cn.com.liboke.fileLister		事件监听者
 * @cn.com.liboke.girl				窗口界面
 * @cn.com.liboke.man				管理者的身份
 * @cn.com.liboke.main.gate.java	程序入口
 */
public class gate {
	public static void main(String[] args) throws IOException {
		//  Launch the application.
		fileMan f = fileMan.getFileMan();
		f.run();
	}
}
