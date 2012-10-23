#include<stdio.h>
#include<stdlib.h>

int main()
{
	int arr[100], i, x, a, y = 0;

	 printf("Vavedi x: ");
     scanf("%d",&x);
	
	for(i = 0; i < 100; i++)
	{
		arr[i] = rand()%100;
	}

	for(i = 0; i < 100; i++)
	{
		if(arr[i]%10 == x)
		{
		a = arr[i];
		arr[y] = arr[i];
		arr[y] = a;
		a++;
		}
	}

	for(i = 0; i < 100; i++)
	{
		printf("%d - %d\n", i, arr[i]);
	}
  getchar();
  getchar();
}
