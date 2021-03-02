class  s5
{
	public static void main(String[] args) 
	{
	int m=15;
	int n=1;
	int max =(m>n) ? m:n;
		System.out.println(max);
	String maxStr=(m>n)?"m大":"n大";
		System.out.println(maxStr);
	int n1=12;
	int n2=30;
	int n3=-43;
	//int temp=(n1>n2)?n1:n2;
	//int max1=(temp>n3)?temp:n3;
	int max1=(((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3;
		System.out.println(max1);
	}
}
    