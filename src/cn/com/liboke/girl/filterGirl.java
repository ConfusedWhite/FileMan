package cn.com.liboke.girl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.com.liboke.fileLister.canceButtonForFiltergirl;
import cn.com.liboke.fileLister.okButtonForFiltergirl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

public class filterGirl extends JDialog {
	private static filterGirl instance = null;
	private final  static JPanel contentPanel = new JPanel();
	private static JPanel panel;
	private final static JLabel lblNewLabel = new JLabel("\u60C5\u8F93\u5165\u8FC7\u6EE4\u5668\uFF0C\u4E00\u884C\u4E00\u4E2A\u6761\u4EF6\uFF1A");
	private final static JScrollPane scrollPane = new JScrollPane();
	private static JTextArea textArea = new JTextArea();

	public  JTextArea getTextarea() {
		return textArea;
	}
	public  void setTextarea(JTextArea textarea) {
		textArea = textarea;
	}
	/*
	 * 该单例模式 保证了有且只有一个filtergirl对象在内存中
	 */
	public static filterGirl getFiltergirl(){		
		if(instance==null){
            synchronized(filterGirl.class){
                if(instance==null){
                    instance=new filterGirl();
                }
            }
        }		
        return instance;	
	}
	/**
	 * Create the dialog.
	 */
	private filterGirl() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			panel = new JPanel();
		}
		GroupLayout gl_contentPanel = new GroupLayout(this.contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(this.scrollPane, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(this.lblNewLabel)
							.addGap(143)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(this.lblNewLabel)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addComponent(this.scrollPane, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
		);
		
		this.scrollPane.setViewportView(this.textArea);
		this.contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new okButtonForFiltergirl());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new canceButtonForFiltergirl());
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}



}
