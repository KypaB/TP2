?/*
������� - ������������ ������� "���������� �������" ��� ��-����� http://www.elsys-bg.org/
���� - 11� ����
����� - 5
��� - ��������� �������� �������

������ - �� �� ��������� ��������, ����� ������� �� ����������� �� ������ ��� ����������� 
�����, x � �, ������ x<y.�� �� ������ ������ �� �������� ������� ����� � ��������� [x,y}
*/

#include<stdio.h>
main()
{
      int x,y,sum;
      int a;
      sum=0;
      printf("vavedi x: ");
      scanf("%d",&x); 
      printf("vavedi y: ");
      scanf("%d",&y);
      for(a = x;a <= y; a++)
         if(a % 2 !=0)
             sum = sum + a;
       printf("Sumanata na ne chetnite chisla mejdu X i Y e : %d",sum);
       getchar();
       getchar();
}
