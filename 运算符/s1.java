class  s1
{
	public static void main(String[] args) 
	{
	int n1=23;
	int n2=5;
	float result=n1/(float)n2;
		System.out.println(result);
	 double result2=(n1+0.0)/n2;
		System.out.println(result2);
	short s2=10;
	s2++;
		System.out.println(s2);
	byte b1=127;
	b1++; 
		System.out.println(b1);
	int a4=10;
	int b4=a4--;
		System.out.println(a4+","+b4);
	int a5=10;
	int b5=--a5;
		System.out.println(a5+","+b5);
	short s3=10;
	s3+=20;
		System.out.println(s3);
	int i1=1;
	i1*=0.1;
		System.out.println(i1);
	i1++;
		System.out.println(i1);
	int m=2,n=3;
	n*=m++;
		System.out.println(m);
		System.out.println(n);
	int y=10;
	y+=(y++)+(++y);//y=y+(y++)+(++y)
		System.out.println(y);
	boolean bo1=true;
	boolean bo2=false;
		System.out.println(bo2 == bo1);
		System.out.println(bo2 = bo1);
	}
}