#include<stdio.h>
#include<math.h>

int main()
{
	int x, i, a,;
	int l=1,n;
	double arr[10];
	
		printf("Vuvedi x:");
		scanf("%d", &x);
	
	for(i = 0; i < 10; i++)
	{
		for(a = l; ; a++)
		{
			n = (int)(cos(a) * 1000);
			if (n%10 == x)
			{
			arr[i] = cos(a);
			l = a + 1;
			break;
			}
		}
	}	
	for(i = 0; i < 10; i++)
	{
		printf("%d - %f\n", i, arr[i]); 
	}
  getchar();
  getchar();
}
