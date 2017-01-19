package cn.com.liboke.girl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import cn.com.liboke.fileLister.selsectAddressLister;
import cn.com.liboke.fileLister.sureAddressLister;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class selectAddressGirl extends JDialog {

	private static  selectAddressGirl instance;
	private final JPanel contentPanel = new JPanel();
	private final JLabel lblNewLabel = new JLabel("\u9009\u62E9\u5730\u5740\uFF1A");
	private final JTextField textfield = new JTextField();

	
	public JTextField getTextField(){
		return textfield;
	}
	public static selectAddressGirl getSelectAddressGirl(){		
		if(instance==null){
            synchronized(filterGirl.class){
                if(instance==null){
                    instance=new selectAddressGirl();
                }
            }
        }
        return instance;	
	}
	/**
	 * Create the dialog.
	 */
	private  selectAddressGirl() {
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.textfield.setColumns(10);
		setBounds(100, 100, 450, 300);
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
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.textfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(162, Short.MAX_VALUE))
		);
		this.contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u9009\u62E9\u5730\u5740");
				okButton.addActionListener(new selsectAddressLister());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\u786E\u5B9A");
				cancelButton.addActionListener(new sureAddressLister());
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
