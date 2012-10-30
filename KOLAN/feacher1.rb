# Технологично училище "Електронни системи"
# http://www.elsys-bg.org/
# 11Б клас
# Благовест Божинов
# Номер 5
# Програма за четене от цсв файл и събиране на сумата на всички features/instance_create_update.feature
require 'csv'

i=0
sum=0.00	
CSV.open("test.csv","wb") do |csv|	
	CSV.foreach("feature_scenarios_times.csv") do |row|
	sum+=row[0].to_f if row[1]=="features/instance_create_update.feature"		
end
csv << [sum]
end
