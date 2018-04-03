/*
 * 记事本程序开发
 * */

package chao.day180403;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NotePad extends JFrame implements ActionListener
{
	//定义需要的组件
	JTextArea jta=null;
	//菜单条
	JMenuBar jmb=null;
	//第一个JMenu
	JMenu jm1=null;
	//定义JMenuItem
	JMenuItem jmi1=null;
	JMenuItem jmi2=null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NotePad np=new NotePad();
		
	}
	
	//构造函数
	public NotePad()
	{
		jta=new JTextArea();
		
		jmb=new JMenuBar();
		jm1=new JMenu("文件");
		//设置助记符
		jm1.setMnemonic('F');
		jmi1=new JMenuItem("打开",new ImageIcon("E:\\document_eclipse\\TankGame\\src\\com\\chao\\explode_tankmovie_frame01.png"));
		//注册监听
		jmi1.addActionListener(this);
		jmi1.setActionCommand("open");
		
		jmi2=new JMenuItem("保存");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("save");
		
		this.setJMenuBar(jmb);
		jmb.add(jm1);
		jm1.add(jmi1);
		jm1.add(jmi2);
		
		this.add(jta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("open"))
		{
			//创建文件选择组件
			JFileChooser jfc1=new JFileChooser();
			jfc1.setDialogTitle("请选择文件...");
			jfc1.showOpenDialog(null);
			jfc1.setVisible(true);
			
			//得到用户选择的文件全路径
			String filename=jfc1.getSelectedFile().getAbsolutePath();
			//System.out.println(filename);
			
			FileReader fr=null;
			BufferedReader br=null;
			
			try 
			{
				fr=new FileReader(filename);
				br=new BufferedReader(fr);
				
				//从文件中读取信息并显示到jta
				String s="";
				String allCon="";
				while((s=br.readLine())!=null)
				{
					allCon+=s+"\r\n";
				}
				jta.setText(allCon);
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				try
				{
					br.close();
					fr.close();
				}
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(arg0.getActionCommand().equals("save"))
		{
			JFileChooser jfc=new JFileChooser();
			jfc.setDialogTitle("另存为...");
			jfc.showSaveDialog(null);
			jfc.setVisible(true);
			
			//获得文件保存路径
			File filetemp=jfc.getSelectedFile();
			if(filetemp==null)
			{
				return;
			}
			String filename=jfc.getSelectedFile().getAbsolutePath();				
			FileWriter fw=null;
			BufferedWriter bw=null;
			
			try 
			{
				fw=new FileWriter(filename);
				bw=new BufferedWriter(fw);
				
				bw.write(this.jta.getText());
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					bw.close();
					fw.close();
				}
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
