//line to column
String str
int poscounter=0
boolean space=false
println "Please enter some text: "
str=new String(System.console().readLine())
int lastSpacePos=0
int previousSpacePos=0


for(int i=0; i<str.length();i++){
	char c=str.charAt(i)
	if(c == " ") {
		lastSpacePos=i
		println str.substring(previousSpacePos, lastSpacePos)
		previousSpacePos = lastSpacePos+1;
	}
}
println str.substring(previousSpacePos)