# Училище: Технологично училище "Електронни системи" към ТУ-София
# Клас: 11 Б
# Номер: 5
# Име: Благовест Николаев Божинов
# Задача: https://docs.google.com/document/d/1waNU1ecWvyiarK0FFe5pnq88GBBuKO_PLX_TStnL_BM/edit
class Array
	def to_hash
	hash = Hash.new
	self.each do |elem|
	hash[elem[0]] = elem[1]
	end
	return hash
	end

	def index_by
	hash = Hash.new
	self.each do |elem|
	hash[yield elem] = elem
	end
	return hash
	end

	def subarray_count(arr)
	count = 0
	for i in 0..self.size-1
	if self[i] == arr[0] && self[i+1] == arr[1]
	count = count + 1
	end
	end
	return count
	end

	def occurences_count
	hash = Hash.new(0)
	self.each do |elem|
	if hash.has_key?(elem)
	hash[elem] = hash[elem] + 1
	else
	hash[elem] = 1
	end
	end
	return hash
	end

	def densities
	hash = self.occurences_count
	arr = Array.new(self.size){0}
	iterator = 0
	self.each do |elem|
	arr[iterator] = hash[elem]
	iterator = iterator + 1
	end
	return arr
	end
end