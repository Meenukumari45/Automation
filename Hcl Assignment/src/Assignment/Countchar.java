package Assignment;

public class Countchar {
		public void count(String str)
	{
		int count[]=new int [1000];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
			char ch[]=new char[str.length()];
			for(int i=0;i<str.length();i++)
			{
			ch[i]=str.charAt(i);
			int n=0;
			for (int j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j])
				{
					n++;
					System.out.println("no. of n "+n);
				}
			
				if(n==1)
				{
					System.out.println("No. of   "+str.charAt(i)+"  is  "+count[str.charAt(i)]);
				}
			}
			}
	}	
public static void main(String args[])
{
	Countchar ccr=new Countchar();
	String str="meenu";
	ccr.count(str);
}

}
