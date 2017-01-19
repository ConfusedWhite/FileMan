package cn.com.liboke.boy;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
/*
 * fileBoy ������  ����·���ַ��� �����ļ�����
 */
public class fileBoy {
	private boolean isChild ;
	private FilenameFilter filter = null;
	private File[] fileArray;
	private File[] dirArray;
	public fileBoy(boolean isChild) {
		super();
		this.isChild = isChild;
	}
	public fileBoy(FilenameFilter filter) {
		super();
		this.filter = filter;
	}
	public fileBoy(boolean isChild, FilenameFilter filter) {
		super();this.isChild = isChild;
		this.filter = filter;
	}	
	/*
	 * ��ȡ�ļ�����
	 */
	public File[] getFileArray(File dir) {
		setFileArray(dir);
		return fileArray;
	}
	/*
	 * ��ȡĿ¼����
	 */
	public File[] getDirArray(File dir) {
		setDirArray(dir);
		return dirArray;
	}
	/*
	 * ��ȡ�����ļ�������
	 */
	public String getFilenameArray(File file) {
		ArrayList arraylist = new ArrayList<File>();
		RecursiveDirectory(file,arraylist);
		return arraylist.toString();
	}
	
	
	public void setFileArray(File dir){
		ArrayList arraylist = new ArrayList<File>();
		RecursiveDirectory(dir,arraylist);
		this.fileArray = new File[arraylist.size()];
		arraylist.toArray(this.fileArray);
	}
	public void setDirArray(File dir){
		ArrayList<File> arrayList = new ArrayList<File>();
		RecursiveDirForDir(dir, arrayList);
		arrayList.add(dir);
		this.dirArray = new File[arrayList.size()];
		arrayList.toArray(this.dirArray);
	}
	/*
	 * �ݹ��ȡ�ļ���Դ
	 */
	private void RecursiveDirectory(File file,ArrayList arraylist){
		File[] fileForDir = file.listFiles();//��ȡĿ¼�б�
		File[] fileForFile = file.listFiles(filter);
		if(isChild){
			if(fileForDir!=null){
				for (File file2 : fileForDir) {
					if(file2.isDirectory())
					{
						RecursiveDirectory(file2,arraylist);
					}
				}
			}
		}
		if(fileForFile!=null)
		{
			for (File file2 : fileForFile) {
				if(file2.isFile()){
					arraylist.add(file2);
				}
			}
		}
		
	}
	/*
	 * �÷���������ȡĿ¼
	 */
	private void RecursiveDirForDir(File dir,ArrayList arraylist){
		File[] fileForDir = dir.listFiles();//��ȡĿ¼�б�
		if(isChild){
			if(fileForDir!=null){
				for (File file2 : fileForDir) {
					if(file2.isDirectory()){
						arraylist.add(file2);
						RecursiveDirForDir(file2,arraylist);
					}
				}
			}
		}
		
	}
	
}
