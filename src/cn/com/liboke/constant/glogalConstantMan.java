package cn.com.liboke.constant;

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.JTextArea;

import cn.com.liboke.girl.fileGirl;
import cn.com.liboke.girl.filterGirl;
import cn.com.liboke.girl.selectAddressGirl;
import cn.com.liboke.man.fileMan;

public class glogalConstantMan {

	public static File[] source = null; //����Ŀ¼
	public static File address = null; //���Ƶ��ļ��ĵ�ַ
	
	public static String model = "";	//���ܵ�ѡ��
	
	public static boolean isChiled = true; //��Ŀ¼����
	public static boolean isFilter = false;//����������
	public static FilenameFilter filter = null;//������
	
	public static final fileGirl filegilr = fileGirl.getFilegirl();//������
	public static final filterGirl filtergirl = filterGirl.getFiltergirl();//����������
	public static final selectAddressGirl selsectaddressgirl = selectAddressGirl.getSelectAddressGirl();//��ַ���ڣ����Ƶ��ļ��ĵ�ַ�Ĵ��ڣ�
	public static final fileMan fileman = fileMan.getFileMan();//������
	
	public static final JTextArea textareaContent = glogalConstantMan.filegilr.getTextarea();//�����
	public static final JTextArea textareaFilter = glogalConstantMan.filtergirl.getTextarea();//�������������
	
	public static boolean standbySwitchForFilter = false;//�������ı��ÿ���
	
}
