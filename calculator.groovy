//calculator program

	double num1, num2
	print "Please enter the first number: "
	num1=Double.parseDouble(System.console().readLine())
	print "Please enter the second number: "
	num2= Double.parseDouble(System.console().readLine())
	println "What would you like to do? "
	println "1-Add"
	println "2-Subtract"
	println "3-Multiply"
	println "4-Divide"
	int choice=Integer.parseInt(System.console().readLine())
	switch (choice){
		case 1:
			double sum=num1+num2
			println "The sum of the numbers is: "+ sum
			break;
		case 2:
			double subtract=num1-num2
			println "The subtraction of the number is: "+subtract.round(2)
			break;
		case 3:
		double multiply=num1*num2
			println "The multiplication of the two numbers is: "+ multiply.round(2)
			break;
		case 4:
			if(num2==0){
				println "Division by zero not allowed!"
				break;}
			else{	
			double division=num1/num2
			println "The division of the two numbers is: "+ division.round(2)
			break;}
		}
			