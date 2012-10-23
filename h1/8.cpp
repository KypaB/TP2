#include<stdio.h>

int fib(int x);

int fib()
{
  int x,y,a;
  long int i=0l,j=1,f;
     for(a=x;a<=y;a++)
     {
         f= i+j;
         i= j;
         j= f;
         if (f>y) break;
     }
}

int main()
{
	int i, k, x, l = 1;
	int arr[10];

	do
	{
		printf("Vuvedi x:");
		scanf("%d", &x);
		getchar();
	}
	while(0>x && x>10);

	for(i = 0; i < 10; i++)
	{
		printf("MINA\n");
		for(k = l; ; k++)
		{
			if(fib(k)%x == 0)
			{
			arr[i] = fib(k);
			l = k+1;
			break;
			}
		}
	}

	for(i = 0; i < 10; i++)
	{
		printf("%d - %d\n", i, arr[i]); 
	}
  getchar();
  getchar();
}

