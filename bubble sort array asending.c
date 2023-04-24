#include<stdio.h>
void Bsort(int[]);
void Bsort(int a[5])
{
	int i,j,temp=0;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(a[j]<a[i])
			{
		     	temp=a[j];
			    a[j]=a[i];
		    	a[i]=temp;
		    }
		}
		     
	}
	    printf("\n");
	    printf("sorted arry is:");
	    for(i=0;i<5;i++)
	    {
	    	printf("%d\n",a[i]);
		}
	
	int main()
	{
		int arr[5]={5,10,56,3,2};
		Bsort(arr);
		return 0;
	}

}
