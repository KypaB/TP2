package com.bogger.KypaB.homework11.code;

import java.lang.String;

public class AirPlane {
	private Human [][] seats = new Human [6][27];
	private int sum = 0;
	private boolean sat =false ;
	
	public void printSeats(){
		for (int k=0 ; k<27 ; k++){
			for (int l=0 ; l<6 ; l++){
				if(l==2){
					System.out.println(seats[1][k].getName() + "," + " ");
				} else {
					System.out.println(seats[1][k].getName() + ",");
				}
			}
				System.out.println();
		}
	}
	
	public void add(int rvalue, Human h){
		sat=false; 
			for (int i=0 ; i<27 ; i++){
				for(int k=0; k<6 ; k++){
					if(seats[k][i] == null){
						if (rvalue == 1) {
							seats[k][i] = h;
							sum += rvalue ;
							sat = true ;
							break ;
						}
					} else {
						continue ; 
					}
				}
				if (sat = true){
					break ;
				}
			}
			if (sat = false){
				System.out.println("Wait for another plane");
			}
	}
	
	public void add(int rvalue,Human h,Human t, Human l){
		sat=false;
			for (int i=0 ; i<27 ; i++){
				for(int k=0 ; k<6 ; k++){
					if(seats[k][i] == null){
						if (rvalue ==3 && k<=3){
							if (seats [k+1][i] == null && seats[k+2][i] == null && k%3 == 0){
								seats[k][i] = h;
								seats[k+1][i] = t;
								seats[k+2][i] = l;
								sum += rvalue;
								sat = true;
							}
						}
					} else {
						continue;
					}
				}
				if (sat == true){
					break;
				}
			}
			if (sat == false){
				System.out.println("Wait for another plane");
			}
	}
	
	public int freeSeats(){
		int freeseats;
		if (sum < 162){
			freeseats = 162 - sum ;
			return freeseats ;
		} else {
			System.out.println("No more free seats");
			return 0; 
		}
	}
	
	public int numMale() {
		int male = 0 ;
			for (Human[] h : seats) {
				for (Human j:h) {
					if (j.getGender() == "Male"){
						male++ ;
					}
				}
			}
		return male;
	}
	
	public int numFemale(){
		int female=0;
			for (Human[] h : seats){
				for(Human j:h){
					if (j.getGender() == "Female"){
					female++ ;
					}
				}
			}
		return female;
	}
	

	public static void main (String[] args){
		AirPlane plane = new AirPlane();
		System.out.println("...........");
		plane.printSeats();
		System.out.println("Males in the plane are - "+ plane.numMale());
		System.out.println("Females in the plane are - "+ plane.numFemale());
	}
}
