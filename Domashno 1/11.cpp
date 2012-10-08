#include<stdio.h>
#include<math.h>

int main()
{
	int x, i, y;
	double a, arr[10];

    printf("Vuvedi x:");
	scanf("%d", &x);

	for(i = 0; i <= 10; i++)
	{
		a =0;
		for(y=i*x;y<(i+1)*x;y++)
		{
		a = a + cos(y);
		}
		arr[i] = a;
	}

	for(i = 0; i<10; i++)
	{
		printf("%d - %f\n", i, arr[i]);
	}
  getchar();
  getchar();
}
