package cn.com.liboke.man;

import cn.com.liboke.constant.glogalConstantMan;
/*
 * ����һ������ͨ�õ��࣬��˼�� �����ǻ�ȡ�����ơ�����������ɾ������ȫ��ʹ��processMan������processMan���򿪶�Ӧ�������
 * 
 * @process ��Ҫ������֤ģʽ����鲢��ȡ���ܡ�<ֻ�Ǹ��ṩ���̵���>��������inspect��ʵ��
 * @inspect ���巽����ʵ����
 * @glogalConstantMan.model  ģʽ����ȡ�����ơ���������ɾ����
 * 
 * ���幤�����̣�
 * 1����model��null����˼���ǳ��������У�ֱ���ж�
 * 2����֤filter�Ƿ����������������ȡ�����������
 * 3����֤address�����Ƿ��������ֻ��������û��Ƿ�<���ƹ���>�����ʹ��<���ƹ���>�� �򿪵�ַ�����
 * 4����֤��ɺ�inspect.inspectModel()���ģʽ��ʲô��Ȼ������Ӧ���ܡ�
 */
public class processMan {

	public  processMan(){
		if(glogalConstantMan.model==null)return;
		inspectBoy inspect = new inspectBoy();
		/*
		 * ��֤Ҫ������Ŀ¼
		 */

		if(!inspect.inspectSource())return;
		/*
		 * ��֤����������
		 */
		if(!glogalConstantMan.standbySwitchForFilter){// ���������ڱ��ÿ��� 			
			if(!inspect.inspectFilter())return;
		}
		
		/*
		 * �Ƿ���copyģʽ
		 */
		if(glogalConstantMan.model=="copy"){
			if(inspect.inspectAddress())return;
		}
		
		/*
		 * ����ģʽ���в���
		 */
		inspect.inspectModel();
		
	}
}
