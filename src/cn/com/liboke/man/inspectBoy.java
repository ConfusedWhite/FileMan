package cn.com.liboke.man;

import java.io.File;

import javax.swing.JOptionPane;

import cn.com.liboke.boy.copyBoy;
import cn.com.liboke.boy.deleteBoy;
import cn.com.liboke.boy.fileBoy;
import cn.com.liboke.boy.filterBoy;
import cn.com.liboke.boy.obtainBoy;
import cn.com.liboke.boy.renameBoy;
import cn.com.liboke.boy.stringBoy;
import cn.com.liboke.constant.glogalConstantMan;
/*
 * inspectBoy ��һ�����顢��飬�Լ��Լ��������Ϣ���з����boy��
 * ���൱һ�����٣�Ȼ������ʲô����ʲô�����в�ָ������
 */
public class inspectBoy {

	/*
	 * ��֤�����Ŀ¼source�Ƿ���ȷ��Ȼ��ȷ�� ��ַ��ֵ
	 */
	public boolean inspectSource(){
			
		String[] fileText;
		int index = 0;
		
		fileText = new stringBoy().getStringArray(glogalConstantMan.textareaContent.getText());
		File[] filearray = new File[fileText.length];
		/*
		 * �ı�ת�����ļ�
		 */
		for (String string : fileText) {
			File file = new File(string);
			System.out.println(file.getAbsolutePath());
			if(file.exists()){
				filearray[index]=file;
			}else{
				JOptionPane.showMessageDialog(null, "����Ϊ�ջ��߲���ȷ"+stringBoy.space, "�ļ��������",JOptionPane.WARNING_MESSAGE);
				return false;
			}
			index++;
		}
		glogalConstantMan.source = filearray;
		return true;
	}
	/*
	 * �򿪹���������򣬲���֤
	 */
	public boolean inspectFilter(){
			if(glogalConstantMan.filtergirl==null){
//			System.out.println("������a");
			return false;}
	
			
			if(glogalConstantMan.isFilter){
				//������Ѿ���ʾ�������˴���֤
				if(glogalConstantMan.filtergirl.isVisible())
				{
//					System.out.println("���������ڵĹ�����");
					String text = glogalConstantMan.textareaFilter.getText();
					if(text.length()!=0){
						String[] filtername = new stringBoy().getStringArray(text);
						glogalConstantMan.filter = new filterBoy(filtername);
						return true;
					}
				}else
				{
					glogalConstantMan.filtergirl.setVisible(true);
//					System.out.println("�������Ѿ�����");
				return false;
				}
			}else{
//				System.out.println("isFilter="+glogalConstantMan.isFilter);
//				System.out.println("û�п���������");
				return true;
			}
//			System.out.println("isFilter="+glogalConstantMan.isFilter);
//			System.out.println("������c");
				return true;
		}
	/*
	 * �򿪵�ַ����򣬲���֤
	 */
	public boolean inspectAddress(){
		
		if(glogalConstantMan.selsectaddressgirl!=null){
			if(glogalConstantMan.selsectaddressgirl.isVisible())return false;
			}
		
		glogalConstantMan.selsectaddressgirl.setVisible(true);
		
		
		if(glogalConstantMan.address==null){
			return false;
		}
		
		if(!glogalConstantMan.address.exists()&&glogalConstantMan.address.isFile()){
			JOptionPane.showMessageDialog(null, glogalConstantMan.address.getAbsolutePath()+"�õ�ַ���Ի����Ǹ��ļ�"+stringBoy.space, "�ļ��������",JOptionPane.WARNING_MESSAGE); 
			return false;
		}
		return true;
	}
	
	/*
	 * ��֤glogalConstantMan.model ģʽ���ɴ����ж��ǻ�ȡ���ܡ����ƹ��ܡ����������ܻ���ɾ�����ܡ�
	 */
	public void inspectModel(){
		//��ȡ
		if(glogalConstantMan.model=="obtain"){
			glogalConstantMan.textareaContent.setText(
					obtainBoy.getFileName(
							glogalConstantMan.source,
							glogalConstantMan.isChiled, 
							glogalConstantMan.filter));
		}
		
		//����
		if(glogalConstantMan.model=="copy"){
			if(glogalConstantMan.address==null)return;
			String text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"��ʼcopy...");
			for (File dir : glogalConstantMan.source) {
				System.out.println(glogalConstantMan.address.getAbsolutePath());
				
				File[] filearray = new fileBoy(glogalConstantMan.isChiled,glogalConstantMan.filter).getFileArray(dir);
				copyBoy.copy(filearray,glogalConstantMan.address);
			}
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"copy��ɣ��������");
		}
		
		//������
		if(glogalConstantMan.model=="rename"){
			String text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"��ʼ������...");
			for (File dir : glogalConstantMan.source) {
				File[] filearray = new fileBoy(glogalConstantMan.isChiled).getDirArray(dir);
				renameBoy.rename(filearray,glogalConstantMan.filter);
			}
			text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"��������ɣ��������");
		}
		
		//ɾ��
		if(glogalConstantMan.model=="delete"){
			String text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"��ʼɾ��...");
			for (File dir : glogalConstantMan.source) {
				File[] filearray = new fileBoy(glogalConstantMan.isChiled,glogalConstantMan.filter).getFileArray(dir);
				deleteBoy.delete(filearray);
			}
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"ɾ����ɣ��������");
		}
		
	}
}
