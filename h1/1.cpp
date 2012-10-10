?/*
Училище - Технологично училище "Електронни системи" към ТУ-София http://www.elsys-bg.org/
Клас - 11Б клас
Номер - 5
Име - Благовест Николаев Божинов

Задача - Да се разработи програма, която изисква от потребителя да въведе дев целочислени 
числа, x и у, където x<y.Да се намери сумата от всичките нечетни числа в интервала [x,y}
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
