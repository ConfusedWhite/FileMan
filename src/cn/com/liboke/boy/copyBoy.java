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
	 *复制文件
	 */
	public static void copy(File file,File address)
	{	
		/*
		 * inspect copyAddress
		 */
		System.out.println("复制的文件"+file.getAbsolutePath());
		System.out.println("复制的文件地址"+address.getAbsolutePath()+"\\"+file.getName());
		String addr = address.getAbsolutePath()+"\\"+file.getName();
		File file1 = new File(addr);
		CopyUtils.copy(file ,file1);	}
	
	/*
	 *批量复制文件
	 */
	public static void copy(File[] filearray, File address) {
		for (File file : filearray) {
				copyBoy.copy(file,address);
		}
	}
}
