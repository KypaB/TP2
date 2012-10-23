/*
	Технологично училище "Електронни системи"
	www.elsys-bg.org
	11Б клас
	Благовест Божинов
	Номер 5
	Да се създаде програма, която да подрежда в самолет с 6 колони (2x3) и 27 реда рандом пристигащи хора (от 1 до 3) така че да не се разделят.
*/

import java.util.Random;

public class AirPlane {

        private int [][] seats = new int[6][27];
        public void printSeats() {
                
                for (int k=0; k<27; k++) {
                        for(int l=0; l<6; l++) {
                                if(l == 2)
                                {
                                        System.out.print(seats[l][k] + " ");
                                } else {
                                        System.out.print(seats[l][k] );
                                }
                        }
                                System.out.println();
                }
        } 
        

        public void add(int rvalue) {
                int flag=0;
                
                for (int k=0;k<27; k++) {
                        for(int l=0; l<6 ; l++) {
                                if(seats[l][k]==0) {
                                        if(l<3) {
                                                if(((seats[0][k] + seats[1][k] + seats[2][k]) + rvalue) <= 3) {
                                                        for (int i=0;i<rvalue;i++) { 
                                                                ++l;   
                                        seats[l-1][k] = 1;
                                                        
                                        }      
                                                        k=27; l=6;
                                                                
                                                }
                                        }else {
                                                if(((seats[3][k] + seats[4][k] + seats[5][k]) + rvalue) <= 3) {
                                                        for (int i=0;i<rvalue;i++) { 
                                                                ++l;   
                                        seats[l-1][k] = 1;
                                        }  
                                                        k=27; l=6;
                                                             
                                                }
                                        }
                                }
                        }
                }       
        }
        
        
        public int freeSeats() {
                int a=0; 
                for (int k=0; k<27; k++) {
                        for(int l=0; l<6; l++) {
                                if(seats[l][k] == 0) {
                                        ++a;    
                                }
                        }       
                }       
                return a;
        }
        
        
        public static void main(String[] args) {
                Random randGen = new Random();
                AirPlane plane = new AirPlane();
                int roll,it=0;          
        
                plane.printSeats();
                do {
                roll = randGen.nextInt(3)+1;    
                plane.add(roll);
                ++it;
                }while(plane.freeSeats()!=0);
                
                plane.printSeats();
                System.out.println("Free seats: " + plane.freeSeats());
                       }

}
