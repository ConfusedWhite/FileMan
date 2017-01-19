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
 * inspectBoy 是一个检验、检查，以及对检验过的信息进行分配的boy，
 * 这相当一个检察官，然后评判什么该有什么不该有并指出错误
 */
public class inspectBoy {

	/*
	 * 验证输入的目录source是否正确，然后并确定 地址的值
	 */
	public boolean inspectSource(){
			
		String[] fileText;
		int index = 0;
		
		fileText = new stringBoy().getStringArray(glogalConstantMan.textareaContent.getText());
		File[] filearray = new File[fileText.length];
		/*
		 * 文本转化成文件
		 */
		for (String string : fileText) {
			File file = new File(string);
			System.out.println(file.getAbsolutePath());
			if(file.exists()){
				filearray[index]=file;
			}else{
				JOptionPane.showMessageDialog(null, "输入为空或者不正确"+stringBoy.space, "文件输入错误",JOptionPane.WARNING_MESSAGE);
				return false;
			}
			index++;
		}
		glogalConstantMan.source = filearray;
		return true;
	}
	/*
	 * 打开过滤器输入框，并验证
	 */
	public boolean inspectFilter(){
			if(glogalConstantMan.filtergirl==null){
//			System.out.println("是这里a");
			return false;}
	
			
			if(glogalConstantMan.isFilter){
				//若面板已经显示，结束此次验证
				if(glogalConstantMan.filtergirl.isVisible())
				{
//					System.out.println("开启不存在的过滤器");
					String text = glogalConstantMan.textareaFilter.getText();
					if(text.length()!=0){
						String[] filtername = new stringBoy().getStringArray(text);
						glogalConstantMan.filter = new filterBoy(filtername);
						return true;
					}
				}else
				{
					glogalConstantMan.filtergirl.setVisible(true);
//					System.out.println("过滤器已经存在");
				return false;
				}
			}else{
//				System.out.println("isFilter="+glogalConstantMan.isFilter);
//				System.out.println("没有开启过滤器");
				return true;
			}
//			System.out.println("isFilter="+glogalConstantMan.isFilter);
//			System.out.println("是这里c");
				return true;
		}
	/*
	 * 打开地址输入框，并验证
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
			JOptionPane.showMessageDialog(null, glogalConstantMan.address.getAbsolutePath()+"该地址不对或者是个文件"+stringBoy.space, "文件输入错误",JOptionPane.WARNING_MESSAGE); 
			return false;
		}
		return true;
	}
	
	/*
	 * 验证glogalConstantMan.model 模式，由此来判断是获取功能、复制功能、重命名功能还是删除功能。
	 */
	public void inspectModel(){
		//获取
		if(glogalConstantMan.model=="obtain"){
			glogalConstantMan.textareaContent.setText(
					obtainBoy.getFileName(
							glogalConstantMan.source,
							glogalConstantMan.isChiled, 
							glogalConstantMan.filter));
		}
		
		//复制
		if(glogalConstantMan.model=="copy"){
			if(glogalConstantMan.address==null)return;
			String text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"开始copy...");
			for (File dir : glogalConstantMan.source) {
				System.out.println(glogalConstantMan.address.getAbsolutePath());
				
				File[] filearray = new fileBoy(glogalConstantMan.isChiled,glogalConstantMan.filter).getFileArray(dir);
				copyBoy.copy(filearray,glogalConstantMan.address);
			}
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"copy完成，程序结束");
		}
		
		//重命名
		if(glogalConstantMan.model=="rename"){
			String text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"开始重命名...");
			for (File dir : glogalConstantMan.source) {
				File[] filearray = new fileBoy(glogalConstantMan.isChiled).getDirArray(dir);
				renameBoy.rename(filearray,glogalConstantMan.filter);
			}
			text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"重命名完成，程序结束");
		}
		
		//删除
		if(glogalConstantMan.model=="delete"){
			String text = glogalConstantMan.textareaContent.getText();
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"开始删除...");
			for (File dir : glogalConstantMan.source) {
				File[] filearray = new fileBoy(glogalConstantMan.isChiled,glogalConstantMan.filter).getFileArray(dir);
				deleteBoy.delete(filearray);
			}
			glogalConstantMan.textareaContent.setText(text+stringBoy.space+"删除完成，程序结束");
		}
		
	}
}
