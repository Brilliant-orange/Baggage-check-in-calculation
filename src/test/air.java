package test;
import java.lang.*;
import java.util.ArrayList;
public class air 
{
	static String linetype1=null ;
	static String jicang1=null ;
	static String cusclass1=null ;
	static String vip1=null ;
	static int ticketvalue1 ;
	static int luggage1;
	static int circle=0;
	static int kgsum;
	static double expectedtotal;
	ArrayList a=new ArrayList();
	public void typeair(String linetype,String jicang,String cusclass,String vip,String ticketvalue,String luggage)
	{
		linetype1=linetype;
		jicang1=jicang;
		cusclass1=cusclass;
		vip1=vip;
		ticketvalue1=Integer.parseInt(ticketvalue);
		luggage1=Integer.parseInt(luggage);
	}
	public String linesum()
	{
		for(int i=0;i<luggage1*4;i++)
		{
			if(i%4==0)
			{
				kgsum=kgsum+Integer.parseInt(a.get(i).toString());
				for(int j=i+1;j<=i+3;j++)
				{
					circle=circle+Integer.parseInt(a.get(j).toString());
				}
			}
		}
		if(linetype1.equals("in"))
		{
			if(kgsum>50)
			{
				return "超重";
			}
			if(circle>200)
			{
				return "行李过大";
			}
		}
		else if(linetype1.equals("out"))
		{
			if(circle>158)
			{
				return "行李过大";
			}
		}
		else if(linetype1.equals("out2"))
		{
			if(circle>158)
			{
				return "行李过大";
			}
		}
		else if(linetype1.equals("out3"))
		{
			if(circle>158)
			{
				return "行李过大";
			}
		}
		else if(linetype1.equals("out4"))
		{
			if(circle>158)
			{
				return "行李过大";
			}
		}
		return null;
	}
	public double sum()
	{
		if(linetype1.equals("in"))
		{
			if(jicang1.equals("T"))
			{
				kgsum=kgsum-40;
			}
			else if(jicang1.equals("G"))
			{
				kgsum=kgsum-30;
			}
			else if(jicang1.equals("M")||jicang1.equals("J"))
			{
				kgsum=kgsum-20;
			}
			else if(jicang1.equals("W"))
			{
				kgsum=kgsum-10;
			}
			if(vip1.equals("J"))
			{
				kgsum=kgsum-20;
			}
			else if(vip1.equals("S"))
			{
				kgsum=kgsum-10;
			}
			if(kgsum<0)
			{
				kgsum=0;
			}
			return kgsum*ticketvalue1*0.015;
		}
		else if(linetype1.equals("out"))
		{
			if(jicang1.equals("T"))
			{
				kgsum=kgsum-96;
			}
			else if(jicang1.equals("G"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("M")||jicang1.equals("J"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("W"))
			{
				kgsum=kgsum-64;
			}
			if(vip1.equals("J"))
			{
				kgsum=kgsum-20;
			}
			else if(vip1.equals("S"))
			{
				kgsum=kgsum-10;
			}
			if(kgsum<0)
			{
				kgsum=0;
			}
			else if(kgsum<=32&&circle<=158)
			{
				return 1000;
			}
			else if(kgsum<=62&&circle<=158)
			{
				return 2000;
			}
			else if(kgsum<=32&&circle>158)
			{
				return 2000;
			}
			else if(kgsum<=62&&circle>158)
			{
				return 5000;
			}
		}
		else if(linetype1.equals("out2"))
		{
			if(jicang1.equals("T"))
			{
				kgsum=kgsum-96;
			}
			else if(jicang1.equals("G"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("M")||jicang1.equals("J"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("W"))
			{
				kgsum=kgsum-64;
			}
			if(vip1.equals("J"))
			{
				kgsum=kgsum-20;
			}
			else if(vip1.equals("S"))
			{
				kgsum=kgsum-10;
			}
			if(kgsum<0)
			{
				kgsum=0;
			}
			else if(kgsum<=32&&circle<=158)
			{
				return 450;
			}
			else if(kgsum<=62&&circle<=158)
			{
				return 2600;
			}
			else if(kgsum<=32&&circle>158)
			{
				return 1450;
			}
			else if(kgsum<=62&&circle>158)
			{
				return 5000;
			}
		}
		else if(linetype1.equals("out3"))
		{
			if(jicang1.equals("T"))
			{
				kgsum=kgsum-96;
			}
			else if(jicang1.equals("G"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("M")||jicang1.equals("J"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("W"))
			{
				kgsum=kgsum-64;
			}
			if(vip1.equals("J"))
			{
				kgsum=kgsum-20;
			}
			else if(vip1.equals("S"))
			{
				kgsum=kgsum-10;
			}
			if(kgsum<0)
			{
				kgsum=0;
			}
			else if(kgsum<=32&&circle<=158)
			{
				return 1000;
			}
			else if(kgsum<=62&&circle<=158)
			{
				return 2000;
			}
			else if(kgsum<=32&&circle>158)
			{
				return 2000;
			}
			else if(kgsum<=62&&circle>158)
			{
				return 5000;
			}
		}
		else if(linetype1.equals("out4"))
		{
			if(jicang1.equals("T"))
			{
				kgsum=kgsum-96;
			}
			else if(jicang1.equals("G"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("M")||jicang1.equals("J"))
			{
				kgsum=kgsum-64;
			}
			else if(jicang1.equals("W"))
			{
				kgsum=kgsum-32;
			}
			if(vip1.equals("J"))
			{
				kgsum=kgsum-20;
			}
			else if(vip1.equals("S"))
			{
				kgsum=kgsum-10;
			}
			if(kgsum<0)
			{
				kgsum=0;
			}
			else if(kgsum<=32&&circle<=158)
			{
				return 450;
			}
			else if(kgsum<=62&&circle<=158)
			{
				return 2600;
			}
			else if(kgsum<=32&&circle>158)
			{
				return 1450;
			}
			else if(kgsum<=62&&circle>158)
			{
				return 5000;
			}
		}
		return 0;
	}
	public void addnum(String in)
	{
		a.add(in);
	}
}
