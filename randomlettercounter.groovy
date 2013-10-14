//counting the number of times a letter provided by the user appears
//in a text provided by the user
String str
print "Please enter some text: "
str=new String(System.console().readLine())
print "Please enter a letter you want to check for: "
char letter=System.console().readLine()
int letterCounter

for(i=0; i<str.length(); i++) {
	if(str.charAt(i)==letter){
		letterCounter ++
		}
	}
println "The number of times "+ letter+ " comes up in the text is "+ letterCounter