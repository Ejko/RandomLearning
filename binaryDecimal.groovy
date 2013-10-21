//converts binary to decimal numbers as specified by the user
class Conversion {
	String binaryNum
	int decimalNum
	
	int binary2decimal(){
		int powerPos=binaryNum.length()
		int binNum=0
		for(int i=0; i<binaryNum.length(); i++){
			char c=binaryNum.charAt(i)
			println  "The current char is:" + c
			int n=Integer.parseInt(c)*Math.pow(2,powerPos)
			println "The current converted position is: "+ n
			powerPos--
			binNum=binNum+n
		}
		return binNum	
	}
	//String decimal2binary(int dec){
	//	dec=decimalNum
	//	int nextDivision=decimalNum
	//	while(nextDivision!=0){
		//	nextDivision=nextDivision/2
		//	int modDiv=nextDivision%2
		//	String binary=binary+String.parseString(modDiv)
		//}
		//return binary 
	//}
}
Conversion numericSystem=new Conversion()
println "Please type in the option you prefer:"
println "To convert from binary to decimal-choose 1"
println "To convert from decimal to binary-choose 2"
String input=System.console().readLine()
switch(input){
	case "1":
		print "Please enter a binary number to convert: "
		numericSystem.binaryNum=System.console().readLine()
		//String str=System.console().readLine()
		println "The number entered: " + numericSystem.binaryNum
		println "The decimal number is: " + numericSystem.binary2decimal()
		break
	case "2":
		print "Please enter a decimal number to convert: "
		numericSystem.decimalNum=Integer.parseInt(System.console().readLine())
		println "The binary number is: " + numericSystem.decimal2binary()
		break
	default:
		print "You have selected an invalid option!"
		break
	}