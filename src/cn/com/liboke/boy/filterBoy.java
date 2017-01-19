package cn.com.liboke.boy;

import java.io.File;
import java.io.FilenameFilter;

public class filterBoy implements FilenameFilter {
	private String[] condition ;

	public filterBoy(String ...condition) {
		super();
		this.condition = condition;
	}
	 @Override
	public boolean accept(File dir, String name) {
//		 System.out.println("¹ýÂËÆ÷¿ªÆôÁË£¡£¡£¡");
		 for (String string : condition) {
			if(!name.endsWith(string))return false;
		}
		return true;
	}

}
