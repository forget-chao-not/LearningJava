/*
	��ӡ������
*/

import java.io.*;

public class Welcome 
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
			
		System.out.println("������������Ĳ�����");
		String ss=br.readLine();
			
		int layer=Integer.parseInt(ss);
		
		
		for(int i=0;i<layer;i++)
		{
			//��ӡ�ո�
			for(int j=0;j<layer-i;j++)
			{
				System.out.print(" ");
			}
			
			//��ӡ*��
			for(int k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
			
			//��ӡ����
			System.out.print("\n");
		}
	}
}