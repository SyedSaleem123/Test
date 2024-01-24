class EvenIndex {
	//SYED SALEEM BABA 
	//9182246678
	//BATCH CODE:JPU-JFFCJD-M3

	public static boolean Even(int p){
		return p%2==0;
	}
	public static int Reverse(int n){
		int m=n;
		int rev=0;
		while (m!=0)
		{
			m=m%10;
			rev=rev*10+n;
			m=m/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int n=23871;
		int p=0;
		int res=0;
		n=Reverse(n);
		while (n!=0)
		{
			int ele=n%10;
			p++;
			if(Even(p)){
				res=res*10+ele;
			}
		}
		res=Reverse(res);
		System.out.println(res);

	}
}

