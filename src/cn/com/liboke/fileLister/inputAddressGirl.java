package cn.com.liboke.fileLister;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.com.liboke.girl.filterGirl;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class inputAddressGirl extends JDialog {

	private final  JPanel contentPanel = new JPanel();
	private final  JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u6587\u4EF6\u5B58\u653E\u7684\u5730\u5740\uFF1A");
	private final  JTextField textfield = new JTextField();
	

	private static  inputAddressGirl inputaddressgirl;

	public static inputAddressGirl getInputAddressGirl(){		
		if(inputaddressgirl==null){
            synchronized(filterGirl.class){
                if(inputaddressgirl==null){
                	inputaddressgirl=new inputAddressGirl();
                }
            }
          inputaddressgirl.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        }
        return inputaddressgirl;	
	}
	
	public JTextField getTextfield() {
		return textfield;
	}

	/**
	 * Create the dialog.
	 */
	public inputAddressGirl() {
		this.textfield.setColumns(10);
		setBounds(100, 100, 452, 143);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GroupLayout gl_contentPanel = new GroupLayout(this.contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(this.textfield, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addComponent(this.lblNewLabel))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(this.lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.textfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(166, Short.MAX_VALUE))
		);
		this.contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u9009\u62E9\u76EE\u5F55");
				okButton.addActionListener(new fileChooserLister());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\u786E\u5B9A");
				cancelButton.addActionListener(new inputAddressLister());
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
