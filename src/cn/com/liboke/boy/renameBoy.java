package cn.com.liboke.boy;

import java.io.File;
import java.io.FilenameFilter;

public class renameBoy {

	/*
	 * ���ݽ��й��������ļ�
	 */
	public static void rename(File dir,FilenameFilter filter,String ...string){
		String LinkName = renameBoy.LinkName(string);
		renameBoy.fileRename(LinkName,dir,filter);
	}
	/*
	 * ����������ļ�ͳ�����ƣ����������ļ�
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
	 * �ν�������ļ�ͳ������
	 */
	private static String LinkName(String[] string){
		String LinkName = "";
		for (String string2 : string) {
			LinkName+=string2;
		}
		return LinkName;
	}
	
	/*
	 * ������Ŀ¼�е��ļ�
	 */
	private static void fileRename(String LinkName,File dir,FilenameFilter filter){
		
//		System.out.println("��������Ϊ��"+filter);
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
							System.out.println("before��"+file1.getAbsolutePath());
							System.out.println("---now��"+file1.getParent()+"\\"+LinkName+"0"+index+suffix);
							}
						else {
							file1.renameTo(new File(file1.getParent()+"\\"+LinkName+index+suffix));
							//
							System.out.println("before��"+file1.getAbsolutePath());
							System.out.println("---now��"+file1.getParent()+"\\"+LinkName+index+suffix);
						}
						index++;
						
					}	
			}
	}
}
