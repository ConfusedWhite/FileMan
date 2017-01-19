package cn.com.liboke.man;

import cn.com.liboke.constant.glogalConstantMan;
/*
 * 这是一个功能通用的类，意思是 无论是获取、复制、重命名还是删除功能全部使用processMan，根据processMan来打开对应的输入框
 * 
 * @process 主要用来验证模式，检查并调取功能。<只是个提供流程的类>，具体由inspect类实现
 * @inspect 具体方法的实现类
 * @glogalConstantMan.model  模式：获取、复制、重命名、删除。
 * 
 * 具体工作流程：
 * 1，若model是null，意思就是程序不用运行，直接中断
 * 2，验证filter是否开启，如若开启则调取过滤器输入框
 * 3，验证address功能是否开启。这个只用来检查用户是否<复制功能>，如果使用<复制功能>则 打开地址输入框
 * 4，验证完成后，inspect.inspectModel()检查模式是什么，然后开启对应功能。
 */
public class processMan {

	public  processMan(){
		if(glogalConstantMan.model==null)return;
		inspectBoy inspect = new inspectBoy();
		/*
		 * 验证要操作的目录
		 */

		if(!inspect.inspectSource())return;
		/*
		 * 验证过滤器界面
		 */
		if(!glogalConstantMan.standbySwitchForFilter){// 过滤器窗口备用开关 			
			if(!inspect.inspectFilter())return;
		}
		
		/*
		 * 是否是copy模式
		 */
		if(glogalConstantMan.model=="copy"){
			if(inspect.inspectAddress())return;
		}
		
		/*
		 * 根据模式进行操作
		 */
		inspect.inspectModel();
		
	}
}
