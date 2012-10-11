import java.util.Random;

public class AirPlane{
private int [][] seats=new int [6][27];
	public void add(int rvalue){
	   for(int i=0;i<rvalue;i++){
	   seats [i][0]=1;
	   }
	}// da dobavqme hora na grupa
	
	public int freeSeats(){
		return 0;
	}
	public void printSeats(){
				
		for(int i=0;i<27;i++){
			for(int k=0;k<6;k++){
				System.out.print(seats[k][i]);
				if(k==2){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		AirPlane plane=new AirPlane();
		plane.printSeats();
		System.out.println("//////");
		plane.add(2);
		plane.printSeats();
	}
}
