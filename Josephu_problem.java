/*
	Լɪ�����⣺
	����Ϊ1,2,3...n��n����Χ��һȦ��Լ�����k(1<=k<=n)���˴�1��ʼ������
	����m���Ǹ��˳��У�������һλ�ִ�1��ʼ����������m���Ǹ����ֳ��У�
	�������ƣ�ֱ�������˳��У��ɴ˲���һ�����ӱ�ŵ����С�
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
	int cycLength=0;//����Ϸ��С������
	private int startNum;//�ʼ������С�����
	private int skipNum;//��skipNum��
	Child firstChild=null;//��һ��С��

	
	public CycLink(int len,int startN,int skipN)
	{
		this.cycLength=len;
		this.startNum=startN;
		this.skipNum=skipN;
	}
	
	//��������
	public void createLink()
	{
		Child temp=null;
		for(int i=1;i<=cycLength;i++)
		{
			//������һ��С��
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
		//Ѱ�ҿ�ʼ�����ĺ���
		for(int i=1;i<startNum;i++)
		{
			temp=temp.nextchild;
		}
		
		while(cycLength!=1)
		{
			//��ʼ����
			for(int i=1;i<skipNum;i++)
			{
				temp=temp.nextchild;
			}
			
			//�ҵ�Ҫ��Ȧ�ĺ��ӵ�ǰһ������
			Child temp2=temp;
			while(temp2.nextchild!=temp)
			{
				temp2=temp2.nextchild;
			}
			
			//������skipNum��С���˳�Ȧ
			temp2.nextchild=temp.nextchild;
			temp=temp.nextchild;
			cycLength--;
			System.out.println("��ǰ��Ȧ����һ�����ӱ�ţ�"+temp.number);
		}
		System.out.println("���һ��С���ǣ�"+temp.number);

	}
	
	//��ӡ����
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
