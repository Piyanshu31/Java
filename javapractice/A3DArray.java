class A3DArray{
	public static void main(String args[])
	{
		int my3DArray[][][]=new int[4][3][5];
		
		int i,j,k;
		for(i=0;i<4;i++)
			for(j=0;j<3;j++)
				for(k=0;k<5;k++)
					my3DArray[i][j][k]=i*j*k;
					
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<5;k++)
				System.out.print(my3DArray[i][j][k]);
			System.out.println();
			}
		System.out.println();
		}
	}
}