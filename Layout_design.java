import java.awt.*;
import javax.swing.*;

public class Test extends JFrame
{
	public static void main(String[] args)
	{
		QQchatter w=new QQchatter();
	}
	
}


//�߽粼��
class MyBorderWindow extends JFrame
{
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public MyBorderWindow()
	{
		jb1=new JButton("�в�");
		jb2=new JButton("��");
		jb3=new JButton("��");
		jb4=new JButton("��");
		jb5=new JButton("��");
		
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.WEST);
		
		this.setTitle("���岼��");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}


//��ʽ����
class MyFlowWindow extends JFrame
{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public MyFlowWindow()
	{
		jb1=new JButton("��");
		jb2=new JButton("Ǯ");
		jb3=new JButton("��");
		jb4=new JButton("��");
		jb5=new JButton("��");
		jb6=new JButton("��");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
	
		this.setTitle("���岼��");
		this.setSize(300,200);
		this.setLocation(200,200);
		
		this.setLayout(new FlowLayout());	

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}


//���񲼾�
class MyGridWindow extends JFrame
{
	int size=9;
	JButton jb[]=new JButton[size];

	public MyGridWindow()
	{
		for(int i=0;i<size;i++)
		{
			jb[i]=new JButton(String.valueOf(i));
		}
		
		//�������񲼾֣�3��3��,�������������ð�ť��ļ��
		this.setLayout(new GridLayout(3,3,10,5));
		for(int i=0;i<size;i++)
		{
			this.add(jb[i]);
		}
	
		this.setTitle("���岼��");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//���Ӳ���
class MyComplexWindow extends JFrame
{
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;	
	public MyComplexWindow()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("ƻ��");
		jb2=new JButton("�㽶");
		jb3=new JButton("����");
		jb4=new JButton("ӣ��");
		jb5=new JButton("����");
		jb6=new JButton("����");
		
		jp1.add(jb1);
		jp1.add(jb2);
		
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb3);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setTitle("���岼��");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//��¼����
class LoginInterface extends JFrame
{
	JPanel panel_up,panel_middle,panel_low;
	JLabel label_username,label_password;
	JButton bt_login,bt_register;
	JTextField tf_username;
	JPasswordField pf;
	
	public LoginInterface()
	{
		panel_up=new JPanel();
		panel_middle=new JPanel();
		panel_low=new JPanel();
		
		label_username=new JLabel("�û���");
		label_password=new JLabel("��    ��");
		
		tf_username=new JTextField(10);
		pf=new JPasswordField(10);
		
		bt_login=new JButton("��¼");
		bt_register=new JButton("ע��");
		
		this.setLayout(new GridLayout(3,1));
		
		panel_up.add(label_username);
		panel_up.add(tf_username);
		panel_middle.add(label_password);
		panel_middle.add(pf);
		panel_low.add(bt_login);
		panel_low.add(bt_register);
		
		this.add(panel_up);
		this.add(panel_middle);
		this.add(panel_low);
	
		this.setTitle("��¼ϵͳ");
		this.setSize(300,150);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//ע�����
class RegisterInterface extends JFrame
{
	JPanel panel_up,panel_middle,panel_low;
	JLabel label_1,label_2;
	JButton bt_1,bt_2;
	JCheckBox cbox1,cbox2,cbox3;
	JRadioButton rbt1,rbt2;
	ButtonGroup bg;
	
	public RegisterInterface()
	{
		panel_up=new JPanel();
		panel_middle=new JPanel();
		panel_low=new JPanel();
		
		label_1=new JLabel("����Ա�");
		label_2=new JLabel("��ϲ�����˶�");
		
		bt_1=new JButton("ע���û�");
		bt_2=new JButton("ȡ��ע��");
		
		cbox1=new JCheckBox("����");
		cbox2=new JCheckBox("����");
		cbox3=new JCheckBox("ƹ����");
		rbt1=new JRadioButton("��");
		rbt2=new JRadioButton("Ů");
		
		bg=new ButtonGroup();
		bg.add(rbt1);
		bg.add(rbt2);
		
		this.setLayout(new GridLayout(3,1));
		
		panel_up.add(label_1);
		panel_up.add(rbt1);
		panel_up.add(rbt2);
		
		panel_middle.add(label_2);
		panel_middle.add(cbox1);
		panel_middle.add(cbox2);
		panel_middle.add(cbox3);
		
		panel_low.add(bt_1);
		panel_low.add(bt_2);
		
		this.add(panel_up);
		this.add(panel_middle);
		this.add(panel_low);
	
		this.setTitle("ע��ϵͳ");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//�û�����
class SurveyInterface extends JFrame
{
	JPanel panel_1,panel_2;
	JLabel label_1,label_2;
	JComboBox cbox_1;
	JList list_1;
	JScrollPane scrollpane;
	
	public SurveyInterface()
	{
		panel_1=new JPanel();
		panel_2=new JPanel();
		
		label_1=new JLabel("����");
		label_2=new JLabel("���εص�");
		
		String []provin={"����","�Ϻ�","�Ϸ�","����"};
		String []destination={"����","����","��ɽ","����"};
		
		cbox_1=new JComboBox<String>(provin);
		list_1=new JList<String>(destination);
		
		scrollpane=new JScrollPane(list_1);
		list_1.setVisibleRowCount(2);
		
		
		this.setLayout(new GridLayout(3,1));
		
		panel_1.add(label_1);
		panel_1.add(cbox_1);
		
		panel_2.add(label_2);
		panel_2.add(scrollpane);
		
		this.add(panel_1);
		this.add(panel_2);

		this.setTitle("���ε���ϵͳ");
		this.setSize(300,300);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);			
	}
}


//OpenCV����
class CVgui extends JFrame
{
	JSplitPane s_pane;
	JList list;
	JLabel label;
	
	public CVgui()
	{
		String []words={"Online documentation","Tutorials","User Q&A forum","Report a bug","Build farm","Developer site","Wiki"};
		list =new JList<String>(words);
		label=new JLabel(new ImageIcon("E:/Image/data/opencv-logo-white.png"));
		
		s_pane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,list,label);
		s_pane.setOneTouchExpandable(true);
		
		this.add(s_pane);
		
		this.setTitle("OpenCV");
		this.setSize(400,300);
		this.setLocation(200,200);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//QQ�������
class QQchatter extends JFrame
{
	JTextArea text_area;
	JPanel panel;
	JComboBox cbox;
	JTextField textfield;
	JButton bt;
	JScrollPane scrollpane;
	
	public QQchatter()
	{
		text_area=new JTextArea();
		scrollpane=new JScrollPane(text_area);
		panel=new JPanel();
		
		String []chatters={"����","����","ӨӨ","����"};
		cbox=new JComboBox<String>(chatters);
		textfield=new JTextField(15);
		bt=new JButton("����");
		
		panel.add(cbox);
		panel.add(textfield);
		panel.add(bt);
		
		this.add(scrollpane);
		this.add(panel,BorderLayout.SOUTH);
		
		this.setIconImage((new ImageIcon("E:/Image/little_qq.jpg")).getImage());
		this.setTitle("��ѶQQ");
		
		this.setSize(320,260);
		this.setLocation(200,200);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}