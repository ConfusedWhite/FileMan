package cn.com.liboke.boy;
/*
 * stringBoy ��Ϊ·���и�����ã�ʹ·���ܹ���textarea��ʹ��
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
	 * ��������Ĺ��� �и���ַ�������
	 */
	public String[] getStringArray(String string){
		cutString(string);
		return stringArray;
	}
	
	
	private void cutString(String string) {
		stringArray = string.split(regex);
	}
	
}
