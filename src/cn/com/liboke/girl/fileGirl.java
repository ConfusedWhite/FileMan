package cn.com.liboke.girl;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

import cn.com.liboke.fileLister.cleanTextLister;
import cn.com.liboke.fileLister.filtercheckLister;

import java.awt.SystemColor;
/*
 * 程序由 阿风 编写
 * filegirl用来显示 主程序页面
 */
public class fileGirl {
	
	private static fileGirl instance =null;
	private JFrame frame;
	
	private String IconImage = "images/query.png";
	private String title = "FM-文件管理";
	
	private final static JMenuBar menuBar = new JMenuBar();
	private final static JMenu menu = new JMenu("\u83DC\u5355");
	private final static JMenu menu_1 = new JMenu("\u5B50\u76EE\u5F55");
	private final static JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u70B9\u51FB\u5173\u95ED");
	private final static JMenuBar menuBar_1 = new JMenuBar();
	private final static JMenu menu_2 = new JMenu("\u5E2E\u52A9");
	private final static JPanel panel = new JPanel();
	
	private final JMenuBar menuBar_2 = new JMenuBar();
	private final JMenuBar menuBar_3 = new JMenuBar();
	private final JMenuBar menuBar_4 = new JMenuBar();
	private final JMenuBar menuBar_5 = new JMenuBar();
	private final JMenuBar menuBar_6 = new JMenuBar();
	
	/*
	 * Obtain	copy	rename	delete  对应  获取、复制、重命名、删除功能。 
	 * */
	private final static JRadioButtonMenuItem Obtain = new JRadioButtonMenuItem("\u83B7\u53D6");
	private final static JRadioButtonMenuItem copy = new JRadioButtonMenuItem("\u590D\u5236");
	private final static JRadioButtonMenuItem rename = new JRadioButtonMenuItem("\u91CD\u547D\u540D");
	private final static JRadioButtonMenuItem delete = new JRadioButtonMenuItem("\u5220\u9664");
	
	private final static JButton btnNewButton = new JButton("\u5F00\u59CB");
	private final static JSeparator separator = new JSeparator();
	private final static JScrollPane scrollPane = new JScrollPane();
	private final static JTextArea textArea = new JTextArea();
	private final static JMenuBar menuBar_7 = new JMenuBar();
	
	/*
	 * filterCheck用于开启过滤器
	 * */
	private final static JCheckBoxMenuItem filterCheck = new JCheckBoxMenuItem("\u8FC7\u6EE4\u5668");
	private final JMenuBar menuBar_8 = new JMenuBar();


	private final JMenuItem explain = new JMenuItem("\u64CD\u4F5C\u8BF4\u660E");
	private final JMenu jmenu8 = new JMenu("\u6E05\u7A7A");
	private final JMenuItem cleanText = new JMenuItem("\u6E05\u7A7A\u6587\u672C");
	
	/*
	 * GET 方法
	 */

	public JMenuItem getExplain() {
		return explain;
	}

	public JMenuItem getCleanText() {
		return cleanText;
	}
	public JFrame getFrame() {
		return frame;
	}

	public  JMenuBar getMenubar() {
		return menuBar;
	}

	public  JMenu getMenu() {
		return menu;
	}

	public  JMenu getMenu1() {
		return menu_1;
	}

	public  JMenuItem getMntmnewmenuitem2() {
		return mntmNewMenuItem_2;
	}

	public  JMenuBar getMenubar1() {
		return menuBar_1;
	}

	public  JMenu getMenu2() {
		return menu_2;
	}

	public  JPanel getPanel() {
		return panel;
	}

	public JMenuBar getMenuBar_2() {
		return menuBar_2;
	}

	public JMenuBar getMenuBar_3() {
		return menuBar_3;
	}

	public JMenuBar getMenuBar_4() {
		return menuBar_4;
	}

	public JMenuBar getMenuBar_5() {
		return menuBar_5;
	}

	public JMenuBar getMenuBar_6() {
		return menuBar_6;
	}

	public  JRadioButtonMenuItem getObtain() {
		return Obtain;
	}

	public  JRadioButtonMenuItem getCopy() {
		return copy;
	}

	public  JRadioButtonMenuItem getRename() {
		return rename;
	}

	public  JRadioButtonMenuItem getDelete() {
		return delete;
	}

	public  JButton getBtnnewbutton() {
		return btnNewButton;
	}

	public  JSeparator getSeparator() {
		return separator;
	}

	public  JScrollPane getScrollpane() {
		return scrollPane;
	}

	public  JTextArea getTextarea() {
		return textArea;
	}

	public  JMenuBar getMenubar7() {
		return menuBar_7;
	}

	public  JCheckBoxMenuItem getFiltercheck() {
		return filterCheck;
	}
	/*
	 * 获取filegirl 对象
	 */
	public static fileGirl getFilegirl(){		
		if(instance==null){
            synchronized(filterGirl.class){
                if(instance==null){
                    instance=new fileGirl();
                }
            }
        }
		instance.frame.setVisible(true);
        return instance;	
	}
	
	/**
	 * Create the application.
	 */
	private fileGirl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(IconImage));
		frame.setTitle(title);
		frame.setBackground(Color.GRAY);
		frame.setBounds(100, 100, 621, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.menuBar.setBackground(Color.GRAY);
		
		frame.setJMenuBar(this.menuBar);
		this.menu.setBackground(Color.DARK_GRAY);
		this.menu.setFont(new Font("新宋体", Font.PLAIN, 12));
		
		this.menuBar.add(this.menu);
		
		this.menu.add(this.menu_1);
		
		
		this.menu_1.add(this.mntmNewMenuItem_2);
		
		this.menuBar.add(this.menuBar_1);
		this.menu_2.setFont(new Font("新宋体", Font.PLAIN, 12));
		
		this.menuBar_1.add(this.menu_2);
		
		menu_2.add(this.explain);
		this.menuBar_8.setBackground(Color.GRAY);
		
		menuBar.add(this.menuBar_8);
		this.jmenu8.setFont(new Font("新宋体", Font.PLAIN, 12));
		this.jmenu8.setBackground(Color.GRAY);
		
		this.menuBar_8.add(this.jmenu8);
		this.cleanText.addActionListener(new cleanTextLister());
		
		this.jmenu8.add(this.cleanText);
		this.panel.setBackground(Color.WHITE);
		
		frame.getContentPane().add(this.panel, BorderLayout.CENTER);
		GroupLayout gl_panel = new GroupLayout(this.panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(this.scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
						.addComponent(this.separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(this.btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
					.addContainerGap())
		);
		/*
		 * btnNewButton  开始按钮 的添加监听方法
		 * */

		this.btnNewButton.setForeground(Color.WHITE);
		this.btnNewButton.setBackground(new Color(255, 182, 193));
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(this.btnNewButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.scrollPane, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		this.textArea.setMargin(new Insets(2, 5, 2, 2));
		this.textArea.setTabSize(10);
		
		this.scrollPane.setViewportView(this.textArea);
		this.panel.setLayout(gl_panel);
		this.menuBar_2.setForeground(Color.WHITE);
		this.menuBar_2.setBackground(Color.WHITE);
		
		frame.getContentPane().add(this.menuBar_2, BorderLayout.NORTH);
		this.menuBar_3.setForeground(Color.WHITE);
		this.menuBar_3.setBackground(Color.WHITE);
		this.menuBar_3.setFont(new Font("新宋体", Font.PLAIN, 12));
		
		this.menuBar_2.add(this.menuBar_3);
		Obtain.setFont(new Font("新宋体", Font.PLAIN, 12));
		Obtain.setBackground(Color.WHITE);

		
		this.menuBar_3.add(this.Obtain);
		
		this.menuBar_2.add(this.menuBar_4);
		copy.setBackground(Color.WHITE);
		copy.setFont(new Font("新宋体", Font.PLAIN, 12));

		
		this.menuBar_4.add(this.copy);
		
		this.menuBar_2.add(this.menuBar_5);
		rename.setFont(new Font("新宋体", Font.PLAIN, 12));
		rename.setBackground(Color.WHITE);

		
		this.menuBar_5.add(this.rename);
		
		this.menuBar_2.add(this.menuBar_6);
		delete.setBackground(Color.WHITE);
		delete.setFont(new Font("新宋体", Font.PLAIN, 12));

		
		this.menuBar_6.add(this.delete);
		
		this.menuBar_2.add(this.menuBar_7);
		filterCheck.addActionListener(new filtercheckLister());
		
		this.menuBar_7.add(this.filterCheck);
	}

	
	
}
