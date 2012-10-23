#
#	Технологично училище "Електронни системи"
#	www.elsys-bg.org
#	11Б клас
#	Благовест Божинов
#	Номер 5
#	Да се създаде програма, която да подрежда в самолет с 6 колони (2x3) и 27 реда #рандом пристигащи хора (от 1 до 3) така че да не се разделят.
#
class AirPlane 

        @@seats = Hash.new(0)
        

        def printSeats() 
                k=0
                l=0
                while k<27
                        l=0
                        while l<6
                                if l==2
                                        print "#{@@seats[[l,k]]}  "
                                else 
                                        print "#{@@seats[[l,k]]}"
                                end
                                l=l+1
                        end 
                        puts
                        k=k+1
                end
        end     
                
        
        

        def add(rvalue)
                k=0
                l=0
                i=0
                
                while k<27
                        l=0
                        while l<6
                                if @@seats[[l,k]]==0
                                        if l<3
                                                if (@@seats[[0,k]] + @@seats[[1,k]] + @@seats[[2,k]] + rvalue) <= 3 
                                                        while i<rvalue
                                                                l=l+1   
                                        @@seats[[l-1,k]] = 1
                                                                i=i+1
                                        end      
                                                        break
                                                end
                                        else 
                                                if(@@seats[[3,k]] + @@seats[[4,k]] + @@seats[[5,k]] + rvalue) <= 3
                                                        while i<rvalue
                                                                l=l+1   
                                        @@seats[[l-1,k]] = 1
                                                                i=i+1
                                        end  
                                                        break 
                                                end
                                        end
                                end
                                l=l+1
                        end
                        k=k+1
                end     
        end
        
        
        def freeSeats() 
                a=0
                k=0
                l=0 
                while k<27
                        l=0
                        while l<6
                                if @@seats[[l,k]] == 0 
                                        a=a+1   
                                end
                                l=l+1
                        end     
                        k=k+1
                end     
                return a
        end
end
        
        

                
                plane = AirPlane.new
                roll=0 
                it=0            
                plane.printSeats()
                while plane.freeSeats() != 0
                        roll = rand(3)+1        
                        plane.add(roll)
                        it=it+1
                end
                
                
                plane.printSeats()
                print "Free seats: #{plane.freeSeats()}\n"
