public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!");
		int arr[]=new int[10];
		int res=0;
		int i=0;
		for(i=1;i<=100;++i){
			res=res+i;
		}
		System.out.println(res);
		int k=1;
		for(i=0;i<10;){
			if(k%2!=0){
				arr[i]=k;
				i++;
			}
			k++;
		}
		for(int array:arr){
			System.out.println(array);
		}
	}
}
