import java.io.*;

public class Welcome 
{
	public static void main(String[] args) 
	{
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("请输入第一个数：");
			String a1=br.readLine();
			
			System.out.println("请输入第二个数：");
			String a2=br.readLine();	
			
			float num1=Float.parseFloat(a1);
			float num2=Float.parseFloat(a2);
			
			if(num1>num2)
			{
				System.out.println("第一个数大!");
			}		
			else if(num1==num2)
			{
				System.out.println("一样大!");
			}
			else
			{
				System.out.println("第二个数大！");
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
}