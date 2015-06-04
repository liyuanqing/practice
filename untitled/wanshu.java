class  wanshu
{
	public static void main(String[] args) 
	{
		int num= 0;
		int a = 4000000;
		System.out.println(a);
		for(int i = 1;i<40000;i++)
		{
			num = 0;
			//System.out.println(i);
			for(int j = 1;j<=(i/2);j++)
			{
				if((i%j)==0)
				{
					num = num+j;
				}
			}
			if(num==i)
				System.out.println(num+"这是一个完数！！！！");
			
		}
		System.out.println("Hello World!");
	}
}
