#include <stdio.h>

#define MAX_ARR 10

#define calcSurface(x, y) x * y

void setValues( int*, int*, int*, int* );
int cut( int x, int y, int w, int h, int coords[] );
void printArr( int arr[], int max );

void main(){
	int x, y, w, h, s, plates, coords[MAX_ARR] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	setValues( &x, &y, &h, &w );
	s = calcSurface(x, y);
	plates = cut( x, y, w, h, coords );

	switch( plates ){
		case 0:{
			printf("%d square cm surface can not be cut.\n", s);
		}
		break;
		case 1:{
			if( s == w*h ){
				printf("%d square cm surface does not need to be cut.\n", s);
			}else{
				printf("Only 1 peace can be cut from %d square cm surface.\n", s);
				printf("longitudinal cut will have to be on the following spot: \n");
				printArr(coords, MAX_ARR);
			}
		}
		break;
		default:{
			printf("%d square cm surface can be cut into %d pcs.\n", s, plates);
			printf("longitudinal cuts will have to be on the following spots: \n");
			printArr(coords, MAX_ARR);
		}
	}	
}

void setValues( int *x, int *y, int *h, int *w ){

	do{
		printf("x=");
		scanf("%d", x);
	}while( x < 0 );

	do{
		printf("y=");
		scanf("%d", y);
	}while( x < 0 );

	do{
		printf("w=");
		scanf("%d", w);
	}while( x < 0 );

	do{
		printf("h=");
		scanf("%d", h);
	}while( x < 0 );
}

int cut( int x, int y, int w, int h, int coords[] ){
	int i = 0, n = 0;
	for( i = 0; x > (coords[n] + w); i++ ){
		if( i==0 ){
			coords[i] = w;
		}else{
			coords[i] = coords[i-1] + w;
			n++;
		}
	}

	if( x > y ){
		return ( x/w ) * ( y/h );
	}else{
		return ( x/h ) * ( y/w );
	}
}

void printArr( int arr[], int max ){
	int i;
	for( i = 0; i < max; i++ ){
		if( arr[i] != 0 ){
			printf("cutting spot %d: %dcm\n", i+1, arr[i]);
		}
	}
}
