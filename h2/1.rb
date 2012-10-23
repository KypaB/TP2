require 'csv'
def process_file_with_csv
result=0
CSV.foreach("./test1.csv") do |row|
result = result + row[1].to_i()
end
p result
end