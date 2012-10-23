class Java{

	public static void main(String[] argc){
	int k=argc.length;
	String[] in_argc = new String[k];
	in_argc = argc ;
	String[] out_argc=new String[k];
	int count;
	for(count=0;count<k;count++)
		if(System.getProperty(str) != null ){
			out_argc[count] = System.getProperty(str);
			}
	}

		if(in_argc[k-1].equals("down")){
			for (int count2 = count-1; count2 >= 0 ;count2--){
				System.out.println(out_argc[count2]);
			}
		}
		else {
			for (int count2=0 ; count2 < count ; count2++){
				System.out.println(out_argc[count2]);
			}
	}
}


