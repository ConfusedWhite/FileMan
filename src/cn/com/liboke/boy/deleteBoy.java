package cn.com.liboke.boy;

import java.io.File;

public class deleteBoy {

	public static void delete(File file){
		file.delete();
	}
	public static void delete(File[] file){
		for (File file2 : file) {
			file2.delete();
		}
	}
}
