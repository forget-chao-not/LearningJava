import java.awt.*;
import javax.swing.*;

public class Test extends JFrame
{
	public static void main(String[] args)
	{
		QQchatter w=new QQchatter();
	}
	
}


//边界布局
class MyBorderWindow extends JFrame
{
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public MyBorderWindow()
	{
		jb1=new JButton("中部");
		jb2=new JButton("北");
		jb3=new JButton("南");
		jb4=new JButton("东");
		jb5=new JButton("西");
		
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.WEST);
		
		this.setTitle("窗体布局");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}


//流式布局
class MyFlowWindow extends JFrame
{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public MyFlowWindow()
	{
		jb1=new JButton("赵");
		jb2=new JButton("钱");
		jb3=new JButton("孙");
		jb4=new JButton("李");
		jb5=new JButton("周");
		jb6=new JButton("吴");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
	
		this.setTitle("窗体布局");
		this.setSize(300,200);
		this.setLocation(200,200);
		
		this.setLayout(new FlowLayout());	

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}


//网格布局
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
		
		//设置网格布局，3行3列,后两个参数设置按钮间的间隔
		this.setLayout(new GridLayout(3,3,10,5));
		for(int i=0;i<size;i++)
		{
			this.add(jb[i]);
		}
	
		this.setTitle("窗体布局");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//复杂布局
class MyComplexWindow extends JFrame
{
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;	
	public MyComplexWindow()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("苹果");
		jb2=new JButton("香蕉");
		jb3=new JButton("葡萄");
		jb4=new JButton("樱桃");
		jb5=new JButton("西瓜");
		jb6=new JButton("榴莲");
		
		jp1.add(jb1);
		jp1.add(jb2);
		
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb3);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setTitle("窗体布局");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//登录界面
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
		
		label_username=new JLabel("用户名");
		label_password=new JLabel("密    码");
		
		tf_username=new JTextField(10);
		pf=new JPasswordField(10);
		
		bt_login=new JButton("登录");
		bt_register=new JButton("注册");
		
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
	
		this.setTitle("登录系统");
		this.setSize(300,150);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//注册界面
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
		
		label_1=new JLabel("你的性别");
		label_2=new JLabel("你喜欢的运动");
		
		bt_1=new JButton("注册用户");
		bt_2=new JButton("取消注册");
		
		cbox1=new JCheckBox("足球");
		cbox2=new JCheckBox("篮球");
		cbox3=new JCheckBox("乒乓球");
		rbt1=new JRadioButton("男");
		rbt2=new JRadioButton("女");
		
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
	
		this.setTitle("注册系统");
		this.setSize(300,200);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}


//用户调查
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
		
		label_1=new JLabel("籍贯");
		label_2=new JLabel("旅游地点");
		
		String []provin={"北京","上海","合肥","杭州"};
		String []destination={"云南","广西","黄山","西安"};
		
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

		this.setTitle("旅游调查系统");
		this.setSize(300,300);
		this.setLocation(200,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);			
	}
}


//OpenCV界面
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


//QQ聊天界面
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
		
		String []chatters={"贝贝","晶晶","莹莹","妮妮"};
		cbox=new JComboBox<String>(chatters);
		textfield=new JTextField(15);
		bt=new JButton("发送");
		
		panel.add(cbox);
		panel.add(textfield);
		panel.add(bt);
		
		this.add(scrollpane);
		this.add(panel,BorderLayout.SOUTH);
		
		this.setIconImage((new ImageIcon("E:/Image/little_qq.jpg")).getImage());
		this.setTitle("腾讯QQ");
		
		this.setSize(320,260);
		this.setLocation(200,200);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
}