class Array {
	public static void main(String args[])
	{
		int a[]= {1,4,6,7,9,12,16};
		int i;
		System.out.print("Element of Array: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		float sum=0,avg;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Average ="+avg);
	}
}
