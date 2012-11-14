class Array
alias :peek :last
end
arr = Array.new
while true	
	puts "Type number:\n"
    line = gets.chomp

    while line.size > 0
	if libe /^\s*([-+]?[0-9])\s*/
           arr.push line.to_f
        elsif line =~ /^\s*([\+\-])\s*/ 
            operator = line
            operand_2 = arr.pop
            operand_1 = arr.pop
            arr.push  case operator 
           	when '+'
                   operand_1 + operand_2
                when '-'
                   operand_1 + operand_2
		end
	end
line.sub!($&,"")
end
	puts "Result: #{arr.peek}"
	puts
end
