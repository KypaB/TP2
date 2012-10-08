#include<stdio.h>
int main(){
    int x,y,a;
    long int i=0l,j=1,f;

    printf("Vavedi x: ");
    scanf("%d",&x);
    printf("Vavedi y: ");
    scanf("%d",&y);

    printf("Cshislata na fibonachi sa: ");
    printf("%ld %ld",i,j); 

    for(a=x;a<=y;a++){
         f=i+j;
         i=j;
         j=f;
         if (f>y) break;
         printf(" %ld",j);
    }
  
  getchar();
  getchar();
}
