package cn.com.liboke.boy;

import java.io.File;
import java.io.FilenameFilter;

import cn.com.liboke.man.fileMan;
/*
 * obtainBoy是一个获取文件名称的小子，  根据输入的目录和限制条件，得出所有匹配的文件名称
 */
public class obtainBoy {

	
	
	/*
	 * 输入一个目录(确定是否包含本目录的子目录)，从而获取符合规则的 文件名称集合字符串
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
	 * 输入一个目录(确定是否包含本目录的子目录)，从而获取符合规则的 文件名称集合字符串
	 * 格式如下：
	 * 		输入的文件路径
	 * 		[...
	 * 			....文件名称
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
	 * 输入一个目录数组 (确定是否包含本目录的子目录)，从而获取符合规则的 文件名称集合字符串
	 * 格式如下：
	 * 		输入的文件路径
	 * 		[...
	 * 			....文件名称
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
