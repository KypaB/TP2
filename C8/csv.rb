require 'csv'

ARGV.each do |a|
CSV.open("#test.csv","wb") do |csv|
CSV.foreach("#{a}") do |row|
csv<<[row[0],row[1],rand(row[1])/2 + row[1]]
end
end
end
