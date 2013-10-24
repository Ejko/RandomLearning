//converts binary to decimal numbers as specified by the user
class Conversion {

	int binary2decimal(String binaryNum){
		int powerPos=binaryNum.length()-1   //holds the current position of the binary number
		int decNum=0
		for(int i=0; i<binaryNum.length(); i++){  //loops through the binary number
			String c=binaryNum.charAt(i)
			int n=Integer.parseInt(c)* Math.pow(2, powerPos) //converts the current binary position to decimal
			powerPos--                                       //the position is reduced by one to reflect the next binary
			decNum=decNum+n                                  //digit position
		}
		return decNum                                       //the sum of all individually converted binary digits
	}
	String decimal2binary( int decimalNum){
	    String binNum=new String()
        String backBinNum=new String()
        int nextDivision=decimalNum
        while(nextDivision!=0){
            int modDiv=nextDivision%2                       //calculates the current modulo
			nextDivision=nextDivision/2                     //finds the next quotient by dividing by 2
            println "The quotient is: "+ nextDivision
			println "The modulo is: "+modDiv
            //backBinNum only stores the collection of binary position, but they are in incorrect order
            backBinNum=backBinNum+Integer.toString(modDiv)  //the modulo is continously added to a string
            }
        //loops through backBinNum to swap the reverse the position of binary digits and reflect the bin number correctly
        for(int i=backBinNum.length(); i>0;i--){
        char c=backBinNum.charAt(i-1)
         binNum=binNum+c
        }
		return binNum
	}
}
Conversion numericSystem=new Conversion()
println "Please type in the option you prefer:"
println "To convert from binary to decimal-choose 1"
println "To convert from decimal to binary-choose 2"
String input=System.console().readLine()
switch(input){
	case "1":
		print "Please enter a binary number to convert: "
		String binNum=System.console().readLine()
		println "The number entered: " + binNum
		println "The decimal number is: " + numericSystem.binary2decimal(binNum)
		break
	case "2":
		print "Please enter a decimal number to convert: "
        int decNum=Integer.parseInt(System.console().readLine())
		println "The binary number is: " + numericSystem.decimal2binary(decNum)
		break
	default:
		print "You have selected an invalid option!"
		break
	}