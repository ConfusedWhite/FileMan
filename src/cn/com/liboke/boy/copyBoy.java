package cn.com.liboke.boy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class copyBoy extends CopyUtils{
	/*
	 *�����ļ�
	 */
	public static void copy(File file,File address)
	{	
		/*
		 * inspect copyAddress
		 */
		System.out.println("���Ƶ��ļ�"+file.getAbsolutePath());
		System.out.println("���Ƶ��ļ���ַ"+address.getAbsolutePath()+"\\"+file.getName());
		String addr = address.getAbsolutePath()+"\\"+file.getName();
		File file1 = new File(addr);
		CopyUtils.copy(file ,file1);	}
	
	/*
	 *���������ļ�
	 */
	public static void copy(File[] filearray, File address) {
		for (File file : filearray) {
				copyBoy.copy(file,address);
		}
	}
}
