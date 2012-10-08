#include<stdio.h>
#include<math.h>

int main()
{
	int i, x;
	double a,arr[10];

	for(i = 0; i < 10; i++)
	{
		arr[i] = cos(i);
	}
	printf("-= Nesortitan =- \n");
    for(i = 0; i < 10; i++)
	{
		printf("%d , %f \n", i, arr[i]);
	}

	for(i = 9; i > 0; i--)
	{
		for(x = 1; x <= i; x++)
		{
			if(arr[x-1]<arr[x])
			{
				a = arr[x-1];
				arr[x-1] = arr[x];
				arr[x] = a;
			}
		}
	}
    printf("-= Sortitan =- \n");
	for(i = 0; i < 10; i++)
	{
    	printf("%d , %f  \n", i, arr[i]);
	}
  getchar();
  getchar();
}
