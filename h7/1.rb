#       Технологично училище "Електронни системи"
#       http://www.elsys-bg.org/
#       11Б клас
#	Благовест Божинов
#	Номер 5
# Програма за намиране на най-много споменатото число(номер на ученик) в група от csv файлове

require 'csv'
list = Dir.glob("/Desktop/csv.csv")
Array.new stud = Array.new(29){0}

 for l in 1..28
                       CSV.foreach("/Desktop/csv/"+num.to_i+".csv") do |line|
                                for num in 0..29
                                        if line[0]==(num+1).to_i
                                                stud[num]+=1
                                        end
                                end
                        end
                end

max = stud[0]
min = stud[0]
print "\nNomer - Broi\n"
for j in 0..29
        if j<9
                print "  " + (j+1).to_s + "   -  " + stud[j].to_s + "\n"
        else    
                print "  " + (j+1).to_s + "  -  " + stud[j].to_s + "\n"
        end

        if (max < stud[j])
                max = stud[j]
        end 

        if (min > stud[j])
                min = stud[j]
        end 
end

print "\nNai izvesniq ima " + max.to_s + " i e nomer: "
for j in 0..29
        if (stud[j] == max)
                print (j+1).to_s + " "
        end
end

print "\nNai bezizvestniq ima " + min.to_s + " i e nomer: "
for j in 0..29
        if (stud[j] == min)
                print (j+1).to_s + " "
        end
end

