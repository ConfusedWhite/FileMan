package cn.com.liboke.boy;

import java.io.File;
import java.io.FilenameFilter;

public class renameBoy {

	/*
	 * 根据进行过滤命名文件
	 */
	public static void rename(File dir,FilenameFilter filter,String ...string){
		String LinkName = renameBoy.LinkName(string);
		renameBoy.fileRename(LinkName,dir,filter);
	}
	/*
	 * 根据输入的文件统配名称，批量命名文件
	 */
	public static void rename(File[] dir,FilenameFilter filter,String ...string){
		String LinkName = renameBoy.LinkName(string);
		for (File file : dir) {
			if(file.isDirectory()){
				renameBoy.fileRename(LinkName,file,filter);
			}
		}
	}
	
	/*
	 * 衔接输入的文件统配名称
	 */
	private static String LinkName(String[] string){
		String LinkName = "";
		for (String string2 : string) {
			LinkName+=string2;
		}
		return LinkName;
	}
	
	/*
	 * 重命名目录中的文件
	 */
	private static void fileRename(String LinkName,File dir,FilenameFilter filter){
		
//		System.out.println("过滤器是为："+filter);
		File[] filearray = dir.listFiles(filter);
		if(filearray==null)return;
		int index = 1;
			String suffix ="";
				for (File file1 : filearray) {
						if(file1.isFile()){
							
							String str = file1.getName();
							suffix=str.substring(str.lastIndexOf("."));
						if(index<=9){
							file1.renameTo(new File(file1.getParent()+"\\"+LinkName+"0"+index+suffix));
						//
							System.out.println("before："+file1.getAbsolutePath());
							System.out.println("---now："+file1.getParent()+"\\"+LinkName+"0"+index+suffix);
							}
						else {
							file1.renameTo(new File(file1.getParent()+"\\"+LinkName+index+suffix));
							//
							System.out.println("before："+file1.getAbsolutePath());
							System.out.println("---now："+file1.getParent()+"\\"+LinkName+index+suffix);
						}
						index++;
						
					}	
			}
	}
}
