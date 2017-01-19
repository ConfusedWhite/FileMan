package cn.com.liboke.boy;
/*
 * stringBoy 作为路径切割的作用，使路径能够在textarea中使用
 */
public class stringBoy {
	
	public static String space = System.getProperty("line.separator");
	private String[] stringArray = null;
	private  String regex = stringBoy.space;
	
	public stringBoy(){
	}
	
	public stringBoy(String regex){
		this.regex = regex;
	}
	public String getRegex() {
		return regex;
	}
	public void setRegex(String regex) {
		this.regex = regex;
	}
	
	/*
	 * 根据输入的规则 切割成字符串数组
	 */
	public String[] getStringArray(String string){
		cutString(string);
		return stringArray;
	}
	
	
	private void cutString(String string) {
		stringArray = string.split(regex);
	}
	
}
