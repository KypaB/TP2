#       Технологично училище "Електронни системи"
#       http://www.elsys-bg.org/
#       11Б клас
#	Благовест Божинов
#	Номер 5
# Програмата чете името на CSV файл от командния ред.
# Отваря файла и събира числата в 2-та колона.
# На екрана се извежда сбора им.

require "csv"

input_file=ARGV[0]
puts input_file

output_file="output"+input_file
puts output_file

sum=0

CSV.open(output_file,"w") do |csv|
	CSV.foreach(input_file) do |row|
		csv << [row[0].to_i/2, row[1].to_i/2]
		sum+=row[1].to_i
	end
end

puts sum
