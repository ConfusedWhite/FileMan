package cn.com.liboke.boy;

import java.io.File;
import java.io.FilenameFilter;

import cn.com.liboke.man.fileMan;
/*
 * obtainBoy��һ����ȡ�ļ����Ƶ�С�ӣ�  ���������Ŀ¼�������������ó�����ƥ����ļ�����
 */
public class obtainBoy {

	
	
	/*
	 * ����һ��Ŀ¼(ȷ���Ƿ������Ŀ¼����Ŀ¼)���Ӷ���ȡ���Ϲ���� �ļ����Ƽ����ַ���
	 * 
	 */
	private static String getString(File dir,boolean isChiled,FilenameFilter filter){
		String text = "["+stringBoy.space;
		File[] file = new fileBoy(isChiled,filter).getFileArray(dir);	
		if(file!=null){
			for (File file2 : file) {
				
				text+=file2.getName()+stringBoy.space;
			}
		}

		text+="]"+stringBoy.space;
		return text;
	}
	
	
	/*
	 * ����һ��Ŀ¼(ȷ���Ƿ������Ŀ¼����Ŀ¼)���Ӷ���ȡ���Ϲ���� �ļ����Ƽ����ַ���
	 * ��ʽ���£�
	 * 		������ļ�·��
	 * 		[...
	 * 			....�ļ�����
	 * 				    .....]
	 */
	public static String getFileName(File dir,boolean isChiled,FilenameFilter filter){
		if(dir==null)return "";
		fileBoy fileboy = new fileBoy(isChiled);
		
		String[] allFileName = new String[2];;
			if(dir.exists()){
				allFileName[0] = dir.getAbsolutePath()+stringBoy.space;
				allFileName[1] = getString(dir,isChiled,filter);
			}
		String filenameForString = "";
		for (String str1 : allFileName) {
			filenameForString+=str1;
		}
		return filenameForString;
	}
	
	
	
	/*
	 * ����һ��Ŀ¼���� (ȷ���Ƿ������Ŀ¼����Ŀ¼)���Ӷ���ȡ���Ϲ���� �ļ����Ƽ����ַ���
	 * ��ʽ���£�
	 * 		������ļ�·��
	 * 		[...
	 * 			....�ļ�����
	 * 				    .....]
	 */
	public static String getFileName(File[] dirArray,boolean isChiled,FilenameFilter filter){
		String text = "";
		for (File file : dirArray) {
			text+=getFileName(file, isChiled, filter);
		}
		return text	;
	}
	
	
	
	
	
	
	
}
