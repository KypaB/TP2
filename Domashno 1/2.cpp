#include<stdio.h>
main()
{
       int x,y,sum,sumC;
      int a;
      sum=0;
      sumC=0;
      printf("vavedi x: ");
      scanf("%d",&x); 
      printf("vavedi y: ");
      scanf("%d",&y);
      for(a = x;a <= y; a++)
         if(a % 17 == 0){
             sum++;
             sumC = sumC + a;}
         printf("Broikata na chislata delqsti se na 17 e : %d \n " ,sum);
         printf("Sumata na cislata delqsti se na 17 e : %d",sumC);
         getchar();
         getchar();
      }
