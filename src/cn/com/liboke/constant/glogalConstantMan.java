package cn.com.liboke.constant;

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.JTextArea;

import cn.com.liboke.girl.fileGirl;
import cn.com.liboke.girl.filterGirl;
import cn.com.liboke.girl.selectAddressGirl;
import cn.com.liboke.man.fileMan;

public class glogalConstantMan {

	public static File[] source = null; //操作目录
	public static File address = null; //复制的文件的地址
	
	public static String model = "";	//功能的选择
	
	public static boolean isChiled = true; //子目录开关
	public static boolean isFilter = false;//过滤器开关
	public static FilenameFilter filter = null;//过滤器
	
	public static final fileGirl filegilr = fileGirl.getFilegirl();//主窗口
	public static final filterGirl filtergirl = filterGirl.getFiltergirl();//过滤器窗口
	public static final selectAddressGirl selsectaddressgirl = selectAddressGirl.getSelectAddressGirl();//地址窗口（复制的文件的地址的串口）
	public static final fileMan fileman = fileMan.getFileMan();//管理者
	
	public static final JTextArea textareaContent = glogalConstantMan.filegilr.getTextarea();//输入框
	public static final JTextArea textareaFilter = glogalConstantMan.filtergirl.getTextarea();//过滤器的输入框
	
	public static boolean standbySwitchForFilter = false;//过滤器的备用开关
	
}
