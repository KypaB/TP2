#include<stdio.h>

int main(){

    int a,i,b,x,y;

     printf("vavedi x:  ");
     scanf("%d",&x);

    printf("vavedi y: ");
    scanf("%d",&y);

    for(a = x;a<=y;a++){

         b = 0;

         for(i=2;i<=a/2;i++){
             if(a%i==0){
                 b++;
                 break;
             }
        }
        
         if(b==0 && a!= 1)
          for(a = x;a <= y; a++)
                if(a % 10 == 3) 
             printf("Prostite chisla koit zavarshvat na 3 sa : %d \n ",a);
    }
  getchar();
  getchar();

}
