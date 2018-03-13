/*
	约瑟夫问题：
	设编号为1,2,3...n的n个人围坐一圈，约定编号k(1<=k<=n)的人从1开始报数，
	数到m的那个人出列，他的下一位又从1开始报数，数到m的那个人又出列，
	依次类推，直到所有人出列，由此产生一个出队编号的序列。
*/

public class Test
{
	public static void main(String[] args)
	{
		CycLink cl=new CycLink(12,4,6);
		cl.createLink();
		cl.show();
		cl.playgame();
	}
}

class Child
{
	int number;
	Child nextchild=null;
	
	public Child(int n)
	{
		this.number=n;
	}
}

class CycLink
{
	int cycLength=0;//玩游戏的小孩总数
	private int startNum;//最开始报数的小孩编号
	private int skipNum;//数skipNum次
	Child firstChild=null;//第一个小孩

	
	public CycLink(int len,int startN,int skipN)
	{
		this.cycLength=len;
		this.startNum=startN;
		this.skipNum=skipN;
	}
	
	//创建链表
	public void createLink()
	{
		Child temp=null;
		for(int i=1;i<=cycLength;i++)
		{
			//创建第一个小孩
			if(i==1)
			{
				Child ch=new Child(i);
				firstChild=ch;
				temp=ch;
			}	
			else
			{
				if(i!=cycLength)
				{
					Child ch=new Child(i);
					temp.nextchild=ch;
					temp=ch;
				}
				else
				{
					Child ch=new Child(i);
					temp.nextchild=ch;
					temp=ch;
					temp.nextchild=firstChild;
				}
			}
		}
	}
		
	public void playgame()
	{
		Child temp=firstChild;
		//寻找开始报数的孩子
		for(int i=1;i<startNum;i++)
		{
			temp=temp.nextchild;
		}
		
		while(cycLength!=1)
		{
			//开始数数
			for(int i=1;i<skipNum;i++)
			{
				temp=temp.nextchild;
			}
			
			//找到要出圈的孩子的前一个孩子
			Child temp2=temp;
			while(temp2.nextchild!=temp)
			{
				temp2=temp2.nextchild;
			}
			
			//将数到skipNum的小孩退出圈
			temp2.nextchild=temp.nextchild;
			temp=temp.nextchild;
			cycLength--;
			System.out.println("当前出圈的下一个孩子编号："+temp.number);
		}
		System.out.println("最后一个小孩是："+temp.number);

	}
	
	//打印链表
	public void show()
	{
		Child temp=firstChild;
		do
		{
			System.out.print(temp.number+"  ");
			temp=temp.nextchild;
		}while(temp!=firstChild);
		System.out.println();
	}
}
