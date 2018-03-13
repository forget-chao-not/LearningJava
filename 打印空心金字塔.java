/*
	打印空心金字塔
*/

import java.io.*;

public class Test 
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
			
		System.out.println("请输入金字塔的层数：");
		String ss=br.readLine();
			
		int layer=Integer.parseInt(ss);//金字塔层数
		
		
		for(int i=0;i<layer;i++)
		{
			//打印空格
			for(int j=0;j<layer-i;j++)
			{
				System.out.print(" ");
			}
			
			//打印*号
			for(int k=0;k<2*i+1;k++)
			{
				if(i==0||i==layer-1)
				{
					System.out.print("*");
				}
				else
				{
					if(k==0||k==2*i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			
			//打印换行
			System.out.print("\n");
		}
	}
}