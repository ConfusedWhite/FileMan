package cn.com.liboke.main;

import java.io.IOException;

import cn.com.liboke.man.fileMan;
/* FM  file management(�ļ�����)  
 * @cn.com.liboke.boy				�ײ㹦��
 * @cn.com.liboke.constant 			ȫ�ֱ���������
 * @cn.com.liboke.fileLister		�¼�������
 * @cn.com.liboke.girl				���ڽ���
 * @cn.com.liboke.man				�����ߵ����
 * @cn.com.liboke.main.gate.java	�������
 */
public class gate {
	public static void main(String[] args) throws IOException {
		//  Launch the application.
		fileMan f = fileMan.getFileMan();
		f.run();
	}
}
