package example;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PartWindow extends JFrame implements ActionListener{
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JButton button1;
	JButton button2;
	JButton button3;
	JTextField text;

	JTextArea textarea1;
	JTextArea textarea2;
	JTextArea textarea3;
	JTextArea textarea4;
	
	JScrollPane scrpane1;
	JScrollPane scrpane2;
	JScrollPane scrpane3;
	JScrollPane scrpane4;
	
	String jt1String;
	
    public PartWindow() {
    	Container c = getContentPane();
    	c.setLayout(new GridLayout(10,1));
    	
    	label1 = new JLabel("疾患名");
    	c.add(label1);
    	
    	textarea1 = new JTextArea();
    	scrpane1 = new JScrollPane(textarea1);
    	c.add(scrpane1);
    	
    	
    	label2 = new JLabel("症状");
    	c.add(label2);
    	
    	textarea2 = new JTextArea();
    	scrpane2 = new JScrollPane(textarea2);
    	c.add(scrpane2);
    	
    	label3 = new JLabel("診断");
    	c.add(label3);
    	
    	textarea3 = new JTextArea();
    	scrpane3 = new JScrollPane(textarea3);
    	c.add(scrpane3);
    	
    	label4 = new JLabel("治療");
    	c.add(label4);
    	
    	textarea4 = new JTextArea();
    	scrpane4 = new JScrollPane(textarea4);
    	c.add(scrpane4);
    	
    	button1 = new JButton("登録");
    	c.add(button1);
    	
    	button1.addActionListener(this);
    	
    	
    	
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

