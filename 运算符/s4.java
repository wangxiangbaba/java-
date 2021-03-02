class  s4
{
	public static void main(String[] args) 
	{
	int n1=10;
	int n2=20;
	/*int temp=n1;
	n1=n2;
	n2=temp;*/
	/*n1=n1+n2;
	n2=n1-n2;  v 
	n1=n1-n2;*/
	int temp=n1+n2;
	n2=temp-n2;
	n1=temp-n2;
		System.out.println(n1);
		System.out.println(n2);
	}
}
